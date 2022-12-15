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
                        "Digite uma TAG, [1 = Alimentação], [2 = Transporte], [3 = Saúde], [4 = Lazer], [5 = outros]: ");
        controleGastos.dataCompraTransacao = JOptionPane.showInputDialog("Digite a DATA do gasto [ex.: dd/mm/yy]: ");
        controleGastos.formaPagamentoTransacao = JOptionPane
                .showInputDialog(
                        "Digite uma Forma de Pagamento, [1 = Crédito], [2 = Débito], [3 = Pix], [4 = Dinheiro]: ");

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
    public void mostrarGastos(){
        for (ItemTransacao itemTransacao : listaDeGastos) {
            System.out.println("ID: " + itemTransacao.idTransacao );
            System.out.println("NOME: " + itemTransacao.nomeTransacao );
            System.out.println("VALOR: R$" + itemTransacao.valorTransacao);
            System.out.println("TAG: " + itemTransacao.tagTransacao );
            System.out.println("DATA: " + itemTransacao.dataCompraTransacao );
            System.out.println("FORMA DE PAGAMENTO: " + itemTransacao.formaPagamentoTransacao );
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