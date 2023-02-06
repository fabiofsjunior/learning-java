package cursojava.classes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LerArquivos {
    public static void main(String[] args) throws IOException {
        EscreveArquivos escreveArquivos = new EscreveArquivos();

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
            linha = linha.replaceFirst(";", ":");

            String[] dados = linha.split(regex);

            ArrayList<String> list = new ArrayList<>(Arrays.asList(dados));
            String[] result = list.toArray(new String[0]);

            ItemTransacao itemTransacao = new ItemTransacao(null, null, 0, null, null, null);
            itemTransacao.setDataCompraTransacao(dados[1]);
            itemTransacao.setValorTransacao(Double.parseDouble(dados[3]));
            itemTransacao.setNomeTransacao(dados[4]);
            itemTransacao.setFormaPagamentoTransacao(dados[5]);
            itemTransacao.setTagTransacao(dados[5]);

            transacoes.add(itemTransacao);

            // Verifica se a linha está em branco.
            if (linha != null && !linha.isEmpty()) {
                System.out.println(linha);
            }
        }

        // Retorna todos os objetos da lista.
        for (ItemTransacao itemTransacao : transacoes) {
            System.out.println(itemTransacao);
            escreveArquivos.escreverNoArquivo(itemTransacao);

        }
    }
}
