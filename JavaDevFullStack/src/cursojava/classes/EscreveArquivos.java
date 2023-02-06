package cursojava.classes;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EscreveArquivos {

    public void escreverNoArquivo(ItemTransacao itemTransacao) throws IOException {

        // Inicia arquivo pelo diretório.
        File arquivo = new File(
                "C:\\Users\\junio\\OneDrive\\Desktop\\GitHub Repositórios\\learning-java\\JavaDevFullStack\\src\\cursojava\\arquivo.csv");

        // Metodologia simples

        // Condição caso o arquivo não exista, criar um novo

        FileWriter escrever_no_arquivo = new FileWriter(arquivo);

        if (!arquivo.exists()) {
            arquivo.createNewFile();
        }

        // Classe que Escreve dentro do arquivo.

        // escrever_no_arquivo.write("Teste de inserção de texto");

        // automatizando escrita com FOR

        escrever_no_arquivo.write(itemTransacao.toString()+"\n");

        // for (int i = 1; i <= 10; i++) {

        // Para arquivos do tipo '.csv', ao executar o arquivo em Excel, será separado
        // automaticamente por colunas quando inserido ';'.
        // escrever_no_arquivo.write("Teste; de ;insercao ;de ;texto ;" + i + "\n");

        // }

        // ao final do código é importante fazer: o flush() que garante se os dados
        // foram gravados e o close() no arquivo.
        escrever_no_arquivo.flush();
        escrever_no_arquivo.close();

    }

}
