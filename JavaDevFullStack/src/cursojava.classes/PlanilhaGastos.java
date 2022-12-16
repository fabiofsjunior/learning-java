import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

/*
Uma lista de gastos pessoais pode conter vários atributos, dependendo do objetivo da lista e da pessoa que a criou. Alguns possíveis atributos que poderiam estar incluídos em uma lista de gastos pessoais são:

*Data do gasto
*Categoria do gasto (por exemplo, alimentação, transporte, lazer, saúde, etc.)
*Valor do gasto
*Forma de pagamento (dinheiro, cartão de crédito, etc.)

Esses são apenas alguns exemplos de atributos que poderiam estar incluídos em uma lista de gastos pessoais. A lista pode conter outros atributos além desses, dependendo das necessidades e preferências da pessoa que a criou.
 */

public class PlanilhaGastos {

    // ATRIBUTOS

    List<ItemTransacao> listaDeGastos = new ArrayList<>();
    double totalGasto;

    public PlanilhaGastos() {

    }

    public PlanilhaGastos(double totalGasto) {
        this.totalGasto = totalGasto;
    }

    // Metodo cria um objeto e adiciona a lista de gastos, com inputs pelo usuário.
    public void adicionarTransacao() {
        ItemTransacao controleGastos = new ItemTransacao(null, null, totalGasto, null, null, null);

        controleGastos.valorTransacao = Double
                .parseDouble(JOptionPane.showInputDialog("Digite o valor gasto [Ex.: 12.55]: "));
        controleGastos.nomeTransacao = JOptionPane
                .showInputDialog("Digite uma descrição para o gasto [Ex.: Crédito Celular.]: ");
        controleGastos.tagTransacao = JOptionPane
                .showInputDialog(
                        "Digite uma TAG: \n[1 = Alimentação], \n[2 = Transporte], \n[3 = Saúde], \n[4 = Lazer], \n[5 = Roupa/Calçado], \n[6 = outros]");
        controleGastos.dataCompraTransacao = JOptionPane.showInputDialog("Digite a DATA do gasto [ex.: dd/mm/yy]: ");
        controleGastos.formaPagamentoTransacao = JOptionPane
                .showInputDialog(
                        "Digite uma Forma de Pagamento: \n[1 = Dinheiro], \n[2 = Crédito], \n[3 = Débito], \n[4 = Pix]");

        this.listaDeGastos.add(controleGastos);

        // chamada para adicionar o valor ao gasto total.
        somarGastos(controleGastos.valorTransacao);

    }

    public double somarGastos(double getValorTransacao) {
        this.totalGasto += getValorTransacao;
        return this.totalGasto;
    }

    public void continuarAddTransacao() {
        int resposta;
        resposta = JOptionPane.showConfirmDialog(null, "Quer adicionar mais alguma transação?", null, 0);

        if (resposta == 0) {
            adicionarTransacao();
            continuarAddTransacao();
        }
    }

    public void mostrarGastos() {
        for (ItemTransacao itemTransacao : listaDeGastos) {
            System.out.println(
                    "ID/INDEX: " + itemTransacao.idTransacao + "-" + listaDeGastos.indexOf(itemTransacao) + ";");
            System.out.println("NOME: " + itemTransacao.nomeTransacao + ";");
            System.out.println("VALOR: R$" + itemTransacao.valorTransacao + ";");
            switch (itemTransacao.tagTransacao) {

                case "1":
                    System.out.println("TAG: Alimentação;");
                    break;
                case "2":
                    System.out.println("TAG: Transporte;");
                    break;
                case "3":
                    System.out.println("TAG: Saúde;");
                    break;
                case "4":
                    System.out.println("TAG: Lazer;");
                    break;
                case "5":
                    System.out.println("TAG: Roupa/Calçado;");
                    break;
                case "6":
                    System.out.println("TAG: Outros;");
                    break;
            }

            System.out.println("DATA: " + itemTransacao.dataCompraTransacao + ";");

            switch (itemTransacao.formaPagamentoTransacao) {

                case "1":
                    System.out.println("FORMA DE PAGAMENTO: Dinheiro;");
                    break;
                case "2":
                    System.out.println("FORMA DE PAGAMENTO: Crédito;");
                    break;
                case "3":
                    System.out.println("FORMA DE PAGAMENTO: Débito;");
                    break;
                case "4":
                    System.out.println("FORMA DE PAGAMENTO: Pix;");
                    break;
            }
            System.out.println("================================================================");
        }

    }

    @Override
    public String toString() {
        return "ClassePlanilha [listaDeGastos=" + listaDeGastos + "]";
    }

    public List<ItemTransacao> getListaDeGastos() {
        return listaDeGastos;
    }

    public void setListaDeGastos(List<ItemTransacao> listaDeGastos) {
        this.listaDeGastos = listaDeGastos;
    }

    public double getTotalGasto() {
        return totalGasto;
    }

    public void setTotalGasto(double totalGasto) {
        this.totalGasto = totalGasto;
    }

}