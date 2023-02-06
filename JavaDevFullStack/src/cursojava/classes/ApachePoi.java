package cursojava.classes;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ApachePoi {
    public static void main(String[] args) throws IOException {

        File file = new File("C:\\Users\\junio\\OneDrive\\Desktop\\GitHub Repositórios\\learning-java\\JavaDevFullStack\\src\\cursojava\\arquivo.csv");

        if (!file.exists()) {
            file.createNewFile();
        }

        //Classe que realiza a leitura do PATH do arquivo.
        FileInputStream entradaArquivo = new FileInputStream(new File(
                "C:\\Users\\junio\\OneDrive\\Desktop\\GitHub Repositórios\\learning-java\\JavaDevFullStack\\src\\cursojava\\arquivo.txt"));

        //Classe que abre o arquivo e identifica o padrão de leitura.
        Scanner lerArquivo = new Scanner(entradaArquivo, "UTF-8");

        // Necessário Estanciar uma lista para adicionar os objetos que serão
        // "SPLITADOS".
        List<ItemTransacao> transacoes = new ArrayList<ItemTransacao>();

        // Lendo e realizando o Split
        while (lerArquivo.hasNext()) {
            String linha = lerArquivo.nextLine();
            String[] dados = linha.split("\\$");

            ItemTransacao itemTransacao = new ItemTransacao(null, null, 0, null, null, null);
            itemTransacao.setValorTransacao(Double.parseDouble(dados[1]));
            itemTransacao.setNomeTransacao(dados[2]);

            transacoes.add(itemTransacao);

            // Verifica se a linha está em branco.
            if (linha != null && !linha.isEmpty()) {
                System.out.println(linha);
            }
        }

        HSSFWorkbook hssfWorkbook = new HSSFWorkbook(); //Usado para escrever a planiliha.
        HSSFSheet linhaTransacao = hssfWorkbook.createSheet("Planiliha de pessoas JDEV TREINAMENTOS"); //Cria a planilha

        int numeroLinha = 0;
        for (ItemTransacao itemTransacao : transacoes) {
            System.out.println(itemTransacao);
            Row linha = linhaTransacao.createRow(numeroLinha++);
            int celula = 0;

            Cell celNome = linha.createCell(celula++);
            celNome.setCellValue(itemTransacao.getNomeTransacao());
        
            Cell celValor = linha.createCell(celula++);
            celValor.setCellValue(itemTransacao.getValorTransacao());
        
            FileOutputStream saida = new FileOutputStream(file);
            hssfWorkbook.write(saida);
            saida.flush();
            saida.close();

        
        }

    }

}
