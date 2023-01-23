package cursojava.thread;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ImplementacaoFilaThread extends Thread {

    private static ConcurrentLinkedQueue<ObjetoFilaThreads> pilha_filha = new ConcurrentLinkedQueue<>();

    public void add(ObjetoFilaThreads objetoFilaThreads) {
        pilha_filha.add(objetoFilaThreads);
    }

    @Override
    public void run() {
        System.out.println("fila rodando...");

        while (true) {

            Iterator iteracao = pilha_filha.iterator();

            synchronized (iteracao) { // Bloquear o acesso a esta lista por outro processos.

                while (iteracao.hasNext()) { // Enquanto conter dados na lista irá processar.

                    ObjetoFilaThreads processar = (ObjetoFilaThreads) iteracao.next();
                    /*
                     * Aqui vai estar todo o processamento de dados.
                     * 
                     * Processar 10mil notas fiscais;
                     * Gerar uma lista de PDF;
                     * Gerar um envio em massa de Email;
                     */
                    System.out.println("-----------------------");
                    System.out.println(processar.getEmail());
                    System.out.println(processar.getNome());

                    iteracao.remove();

                    try {
                        Thread.sleep(1000); // Dar um tempo para descargar de memória.
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    try {
                        Thread.sleep(1000); // Processou toda a lista dá um tempo para limpeza de memória.
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }

        }

    }
}
