package cursojava.thread;

import javax.swing.JOptionPane;

public class ThreadExercise {
    public static void main(String[] args) throws InterruptedException {

        // Thread do Envio de email. THREAD NR 1
        new Thread() {
            /* Esse RUN executa o que quremos. */
            public void run() {
                // Código da rotina que eu quero executar em paralelo.
                for (int pos = 0; pos <= 10; pos++) {

                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    // Quero executar esse envio com tempo de parada ou com tempo determinado.
                    System.out.println("Executando alguma rotina, por exemplo envio de E-mail " + pos);
                }
            }
        }.start();// o Start liga a thread que fica processando paralelamente por trás.

        // Fim do código em PARALELO

        // DIVISÃO DAS EXECUÇÕES.

        // Thread do Envio de email. THREAD NR 2
        new Thread() {
            /* Esse RUN executa o que quremos. */
            public void run() {
                // Código da rotina que eu quero executar em paralelo.
                for (int pos = 0; pos <= 10; pos++) {

                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    // Quero executar esse envio com tempo de parada ou com tempo determinado.
                    System.out.println("Executando alguma rotina, por exemplo envio de Nota Fiscal " + pos);
                }
            }
        }.start();// o Start liga a thread que fica processando paralelamente por trás.

        // Fim do código em PARALELO

        // Código do sistema do usuário continua o fluxo de trabalho.
        System.out.println("Chegou ao fim do código de teste de THREAD.");

        // Fluxo do sistema, cadastro de venda, uma emissão de nota fiscal, algo do
        // tipo.
        JOptionPane.showMessageDialog(null, "Sistema continua executando para o usuário");
    }

    private static Runnable thread1 = new Runnable() {

        @Override
        public void run() {
            // TODO Auto-generated method stub
            
        }
        
    };
}
