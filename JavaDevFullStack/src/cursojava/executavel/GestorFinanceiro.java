package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.PlanilhaGastos;

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

Plano de Contas = "Tags : Receitas/Despesas / Crédito"

*/

public class GestorFinanceiro {
    public static void main(String[] args) {

        String senha = JOptionPane.showInputDialog("Informe o Login! ");
        String login = JOptionPane.showInputDialog("Informe o Senha! ");

        if (login.equalsIgnoreCase("admin") && senha.equalsIgnoreCase("admin")) {

            PlanilhaGastos planilhaDezembro = new PlanilhaGastos();

            // PlanilhaGastos listaPorTags = new PlanilhaGastos();
            PlanilhaGastos listaTagAlimentacao = new PlanilhaGastos(); // TAG == 1
            listaTagAlimentacao.setListNome("Tag Alimentação");
            PlanilhaGastos listaTagTransporte = new PlanilhaGastos(); // TAG == 2
            PlanilhaGastos listaTagSaude = new PlanilhaGastos(); // TAG == 3
            PlanilhaGastos listaTagLazer = new PlanilhaGastos(); // TAG == 4
            PlanilhaGastos listaTagRoupas = new PlanilhaGastos(); // TAG == 5
            PlanilhaGastos listaTagOutros = new PlanilhaGastos(); // TAG == 6

            // PlanilhaGastos listaPorFormaPagamento = new PlanilhaGastos();
            PlanilhaGastos listaPagDinheiro = new PlanilhaGastos(); // TAG == 1
            PlanilhaGastos listaPagCredito = new PlanilhaGastos(); // TAG == 2
            PlanilhaGastos listaPagDebito = new PlanilhaGastos(); // TAG == 3
            PlanilhaGastos listaPagPix = new PlanilhaGastos(); // TAG == 4

            // Posso realizar essas listagens com HASHMAPS()

            JOptionPane.showMessageDialog(null, "Gestor de Gastos Pessoais v1.0");
            planilhaDezembro.adicionarTransacao();
            planilhaDezembro.continuarAddTransacao();

            planilhaDezembro.mostrarGastos();

            JOptionPane.showMessageDialog(null,
                    "Total de gastos no mês de Dezembro foi de: R$ " + planilhaDezembro.getTotalGasto());

            listaTagAlimentacao.listarPorTags(planilhaDezembro.getListaDeGastos());
            listaTagAlimentacao.mostrarGastos();

            JOptionPane.showMessageDialog(null,
                    "Total de gastos no mês de Dezembro foi de: R$ " + listaTagAlimentacao.getTotalGasto());

        }else{
            JOptionPane.showMessageDialog(null, "Login ou Senha Inválidos.");
        }

    }
}
