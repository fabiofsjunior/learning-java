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

            PlanilhaGastos planilhaMensal = new PlanilhaGastos();
            planilhaMensal.setListNome("Lista De Gastos Mensal");

            PlanilhaGastos listaTagAlimentacao = new PlanilhaGastos(); // TAG == 1
            listaTagAlimentacao.setListNome("Tag Alimentação");
            listaTagAlimentacao.setListaTagList("1");

            PlanilhaGastos listaTagTransporte = new PlanilhaGastos(); // TAG == 2
            listaTagTransporte.setListNome("Tag Transporte");
            listaTagTransporte.setListaTagList("2");

            PlanilhaGastos listaTagSaude = new PlanilhaGastos(); // TAG == 3
            listaTagSaude.setListNome("Tag Saúde");
            listaTagSaude.setListaTagList("3");

            PlanilhaGastos listaTagLazer = new PlanilhaGastos(); // TAG == 4
            listaTagLazer.setListNome("Tag Lazer");
            listaTagLazer.setListaTagList("4");

            PlanilhaGastos listaTagRoupas = new PlanilhaGastos(); // TAG == 5
            listaTagRoupas.setListNome("Tag Roupas");
            listaTagRoupas.setListaTagList("5");

            PlanilhaGastos listaTagOutros = new PlanilhaGastos(); // TAG == 6
            listaTagOutros.setListNome("Tag Outros");
            listaTagOutros.setListaTagList("6");

            PlanilhaGastos listaPagDinheiro = new PlanilhaGastos(); // TAG == 1
            listaPagDinheiro.setListNome("(Pagamentos em Dinheiro)");
            listaPagDinheiro.setListaFormaPagamento("1");

            PlanilhaGastos listaPagCredito = new PlanilhaGastos(); // TAG == 2
            listaPagCredito.setListNome("(Pagamentos em Cartão Crédito)");
            listaPagCredito.setListaFormaPagamento("2");

            PlanilhaGastos listaPagDebito = new PlanilhaGastos(); // TAG == 3
            listaPagDebito.setListNome("(Pagamentos em Cartão Débito)");
            listaPagDebito.setListaFormaPagamento("3");

            PlanilhaGastos listaPagPix = new PlanilhaGastos(); // TAG == 4
            listaPagPix.setListNome("(Pagamentos em Pix)");
            listaPagPix.setListaFormaPagamento("4");

            //// Todos os objetos Carregados em memória e pronto para usar.

            JOptionPane.showMessageDialog(null, "Gestor de Gastos Pessoais v1.0");
            // Precisa melhorar esse método de Login com Interfaces.

            // Chamada inicial para o método que adiciona transações e imprime no console.
            // Em breve exportar em Excel

            planilhaMensal.adicionarTransacao();
            planilhaMensal.continuarAddTransacao();
            planilhaMensal.mostrarGastos();

            // Classificação da lista por Tags
            listaTagAlimentacao.listarPorTags(planilhaMensal.getListaDeGastos());
            listaTagAlimentacao.mostrarGastos();

            listaTagLazer.listarPorTags(planilhaMensal.getListaDeGastos());
            listaTagLazer.mostrarGastos();

            listaTagSaude.listarPorTags(planilhaMensal.getListaDeGastos());
            listaTagSaude.mostrarGastos();

            listaTagTransporte.listarPorTags(planilhaMensal.getListaDeGastos());
            listaTagTransporte.mostrarGastos();

            listaTagRoupas.listarPorTags(planilhaMensal.getListaDeGastos());
            listaTagRoupas.mostrarGastos();

            listaTagOutros.listarPorTags(planilhaMensal.getListaDeGastos());
            listaTagOutros.mostrarGastos();

            // Classificação das listas por Forma de Pagamento
            listaPagDinheiro.listarPorTipoPagamento(planilhaMensal.getListaDeGastos());
            listaPagDinheiro.mostrarGastos();

            listaPagCredito.listarPorTipoPagamento(planilhaMensal.getListaDeGastos());
            listaPagCredito.mostrarGastos();

            listaPagDebito.listarPorTipoPagamento(planilhaMensal.getListaDeGastos());
            listaPagDebito.mostrarGastos();

            listaPagPix.listarPorTipoPagamento(planilhaMensal.getListaDeGastos());
            listaPagPix.mostrarGastos();

        } else {
            JOptionPane.showMessageDialog(null, "Login ou Senha Inválidos.");
        }

    }
}
