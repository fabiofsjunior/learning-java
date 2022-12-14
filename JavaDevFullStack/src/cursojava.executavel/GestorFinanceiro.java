
/* [Forma mais simples]
Iniciar o programa: 
solicitar valores até que finalize a quantidade de transações.
adicionar os valores numa lista.
somar os valores
printar o valor total da soma.



[+Features]
separar por tags (cria uma nova lista por tags)
apresenta opções de print por tags (MENU OPÇÕES)
printar o valor total da soma por tag.
excluir valores
gerar gráficos de gastos
integrar campos no site. 
https://fabiofsjunior.github.io/gestorfinanceiro/
*/

public class GestorFinanceiro {
    public static void main(String[] args) {

        ClassePlanilha planilhaDezembro = new ClassePlanilha();


        planilhaDezembro.adicionarTransacao();
        planilhaDezembro.continuarAddTransacao();

        System.out.println(planilhaDezembro);
        System.out.println("Total de gastos no mês de Dezembro foi de: R$ " + planilhaDezembro.totalGasto);

        



        /* 
        String resposta;

        resposta = JOptionPane.showInputDialog(args);
        int respostaConvertida = Integer.parseInt(resposta);

        while (respostaConvertida != 1) {
            if (respostaConvertida == 1){
                System.out.println("loading...");
            break;
            }
            else{
                System.out.println("Opção errada.");
            }
            /* 
            System.out.println("Este é seu Gestor de Finanças Pessoais v1.0");
            System.out.println("[------------- M E N U -------------]");
            System.out.println("[1] - Adicionar Gasto.");
            System.out.println("[2] - Remover Gasto.");
            System.out.println("[3] - Ver Gráfico.");
            System.out.println("[4] - Fechar Programa.");

            resposta = JOptionPane.showInputDialog(args);
           
            break;
        }

        switch (resposta) {

            case "1":
                break;

            case "2":
                System.out.println("Opção ainda em desenvolvimento.");
                break;

            case "3":
                System.out.println("Opção ainda em desenvolvimento.");

                break;

            case "4":
                System.out.println("Opção ainda em desenvolvimento.");

                break;

            default:
                System.out.println("Não escolheu nenhuma opção válida");
        }
        System.out.println("validando opção escolhida "+resposta);
        */
    }
}
