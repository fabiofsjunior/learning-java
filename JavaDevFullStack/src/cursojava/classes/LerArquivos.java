package cursojava.classes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class LerArquivos {
    public static void main(String[] args) throws IOException {

        System.setProperty("file.encoding", "UTF-8"); // Define a codificação padrão

        // Metodologia simples

        // Inicia arquivo pelo diretório a ser escrito.
        File arquivo = new File(
                "C:\\Users\\junio\\OneDrive\\Desktop\\GitHub Repositórios\\learning-java\\JavaDevFullStack\\src\\cursojava\\arquivo.csv");

        // Condição caso o arquivo não exista, criar um novo

        FileWriter escreveArquivos = new FileWriter(arquivo);

        if (!arquivo.exists()) {
            arquivo.createNewFile();
        }

        // Classe que realiza a leitura do PATH do arquivo.
        FileInputStream entradaArquivo = new FileInputStream(new File(
                "C:\\Users\\junio\\OneDrive\\Desktop\\GitHub Repositórios\\learning-java\\JavaDevFullStack\\src\\cursojava\\arquivo.txt"));

        // Classe que abre o arquivo e identifica o padrão de leitura.
        Scanner lerArquivo = new Scanner(entradaArquivo, "UTF-8");

        // Necessário Estanciar uma lista para adicionar os objetos que serão
        // "SPLITADOS".
        List<ItemTransacao> transacoes = new ArrayList<ItemTransacao>();

        // Lendo e realizando o Split
        while (lerArquivo.hasNext()) {
            String linha = lerArquivo.nextLine();
            // String regex = "[\\[\\]:$\\s;]";
            String regex = "[;]";
            linha = linha.replace("[", "");
            linha = linha.replace("]", ";");
            linha = linha.replaceFirst(",", ";");
            linha = linha.replace(",", ".");
            linha = linha.replace(":", ";");
            linha = linha.replace("$", ";");
            linha = linha.replace(" ", "");
            linha = linha.replace("/", "-");
            linha = linha.replaceFirst(";", ":");

            String[] dados = linha.split(regex);

            try {
                ItemTransacao itemTransacao = new ItemTransacao(null, null, 0, null, null, null);
                itemTransacao.setDataCompraTransacao(dados[1]);
                itemTransacao.setValorTransacao(Double.parseDouble(dados[3]));
                itemTransacao.setNomeTransacao(dados[4].toUpperCase());
                itemTransacao.setFormaPagamentoTransacao(dados[5]);
                itemTransacao.setTagTransacao(dados[5]);
                transacoes.add(itemTransacao);

            } catch (Exception e) {
                e.printStackTrace();
            }

            // Verifica se a linha está em branco.
            if (linha != null && !linha.isEmpty()) {
                // System.out.println(linha);
            }
        }

        // Retorna todos os objetos da lista.
        for (ItemTransacao itemTransacao : transacoes) {
            System.out.println(itemTransacao);
            itemTransacao.getNomeTransacao();
            escreveArquivos.write(itemTransacao.toString());

        }
        escreveArquivos.flush();
        escreveArquivos.close();

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        
        // APARTIR DAQUI EXPORTA JSON
        // Organiza a estrutura do arquivo JSON.
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String jsonUser = gson.toJson(transacoes);

        // Criação do arquivo JSON
        File arquivoJson = new File(
                "C:\\Users\\junio\\OneDrive\\Desktop\\GitHub Repositórios\\learning-java\\JavaDevFullStack\\src\\cursojava\\arquivo.json");

        if (!arquivoJson.exists()) {
            arquivo.createNewFile();
        }
        // responsável por escrever o arquivo reconhecendo a escrita brasileira e
        // simbolos.
        OutputStreamWriter escreverJson = new OutputStreamWriter(new FileOutputStream(arquivoJson), "UTF-8");
        escreverJson.write(jsonUser);

        escreverJson.flush();
        escreverJson.close();
        // APARTIR DAQUI ENCERRA O EXPORT JSON

        //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        // LEITURA DE ARQUIVO JSON
        FileReader fileReader = new FileReader(arquivoJson);

        JsonArray jsonArray = (JsonArray) JsonParser.parseReader(fileReader);
        List<ItemTransacao> listaTransacoes = new ArrayList<ItemTransacao>();

        for (JsonElement jsonElement : jsonArray) {

            ItemTransacao itemTransacaoFromJson = new Gson().fromJson(jsonElement, ItemTransacao.class);
            listaTransacoes.add(itemTransacaoFromJson);

        }
        System.out.println("Leitura do Arquivo Json: " + listaTransacoes);


        
    }
}
