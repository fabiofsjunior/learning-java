package cursojava.thread;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ImplementacaoFilaThread extends Thread {

    /*
     * Utilizando a herança da classe Thread, utilizando o objeto ConcurrenteLinkedQueue necessário ser static.
     * invoca um objeto com metodo ITERATOR() dentro de um While e após realizar a iteração, lembrar de dar um sleep na thread para limpar memória.
     * ao final deixr SYNCHRONIZED para não haver nenhum tipo de interferência de outras threads antes que términe "blindando a thread"
     * 
     */

    private static ConcurrentLinkedQueue<ObjetoFilaThreads> pilha_filha = new ConcurrentLinkedQueue<>();

    public void add(ObjetoFilaThreads objetoFilaThreads) {
        pilha_filha.add(objetoFilaThreads);
    }

    @Override
    public void run() {
        System.out.println("fila rodando...");

        while (true) {

            Iterator iteracao = pilha_filha.iterator(); // Objeto que tem o metodo que interage com a lista.

            synchronized (iteracao) { // Bloquear o acesso a esta lista por outro processos.

                while (iteracao.hasNext()) { // Enquanto conter dados na lista irá processar.

                    ObjetoFilaThreads processar = (ObjetoFilaThreads) iteracao.next(); //pega o objeto atual
                    //Foi necessário fazer um cast para indicar o tipo de objeto
                    /*
                     * Aqui vai estar todo o processamento de dados.
                     * 
                     * Processar 10mil notas fiscais;
                     * Gerar uma lista de PDF;
                     * Gerar um envio em massa de Email;
                     */
                    System.out.println("-----------------------");
                    System.out.println(processar.getNome());
                    System.out.println(processar.getEmail());

                    iteracao.remove(); // após a remoção, é necessário dar um espaço de tempo para limpar memória.

                    try {
                        Thread.sleep(500); // Dar um tempo para descargar de memória.
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    try {
                        Thread.sleep(500); // Processou toda a lista dá um tempo para limpeza de memória.
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }

        }

    }
}
