package cursojava.classes;

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
    String listNome;
    double totalGasto;

    public PlanilhaGastos() {

    }

    public PlanilhaGastos(List<ItemTransacao> listaDeGastos, String listNome, double totalGasto) {
        this.listaDeGastos = listaDeGastos;
        this.listNome = listNome;
        this.totalGasto = totalGasto;
    }

    // Metodo cria um objeto e adiciona a lista de gastos, com inputs pelo usuário.
    public void adicionarTransacao() {
        ItemTransacao controleGastos = new ItemTransacao(null, null, totalGasto, null, null, null);

        controleGastos.valorTransacao = Double
                .parseDouble(JOptionPane.showInputDialog("Digite o valor gasto \n[Ex.: 12.55]: "));
        controleGastos.nomeTransacao = JOptionPane
                .showInputDialog("Digite uma descrição para o gasto \n[Ex.: Crédito Celular.]: ");
        controleGastos.tagTransacao = JOptionPane
                .showInputDialog(
                        "Digite uma TAG: \n[1 = Alimentação], \n[2 = Transporte], \n[3 = Saúde], \n[4 = Lazer], \n[5 = Roupa/Calçado], \n[6 = outros]");
        //controleGastos.dataCompraTransacao = JOptionPane.showInputDialog("Digite a DATA do gasto [ex.: dd/mm/yy]: ");
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

    public void listarPorTags(List<ItemTransacao> listaDeGastos) {

        for (ItemTransacao itemTransacao : listaDeGastos) {

            switch (itemTransacao.getTagTransacao()) {

                case "1":
                    this.listaDeGastos.add(itemTransacao);
                    somarGastos(itemTransacao.getValorTransacao());
                    break;
                case "2":
                    this.listaDeGastos.add(itemTransacao);
                    somarGastos(itemTransacao.getValorTransacao());
                    break;
                case "3":
                    this.listaDeGastos.add(itemTransacao);
                    somarGastos(itemTransacao.getValorTransacao());
                    break;
                case "4":
                    this.listaDeGastos.add(itemTransacao);
                    somarGastos(itemTransacao.getValorTransacao());
                    break;
                case "5":
                    this.listaDeGastos.add(itemTransacao);
                    somarGastos(itemTransacao.getValorTransacao());
                    break;
                case "6":
                    this.listaDeGastos.add(itemTransacao);
                    somarGastos(itemTransacao.getValorTransacao());
                    break;
            }

        }
    }

    public void mostrarGastos() {
        for (ItemTransacao itemTransacao : this.listaDeGastos) {
            System.out.println(
                    "ID/INDEX: " + itemTransacao.idTransacao + "-" + this.listaDeGastos.indexOf(itemTransacao) + ";");
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
        }
        System.out.println("================================================================");

    }

    public List<ItemTransacao> getListaDeGastos() {
        return listaDeGastos;
    }

    public void setListaDeGastos(List<ItemTransacao> listaDeGastos) {
        this.listaDeGastos = listaDeGastos;
    }

    public String getListNome() {
        return listNome;
    }

    public void setListNome(String listNome) {
        this.listNome = listNome;
    }

    public double getTotalGasto() {
        return totalGasto;
    }

    public void setTotalGasto(double totalGasto) {
        this.totalGasto = totalGasto;
    }

    @Override
    public String toString() {
        return "PlanilhaGastos [listaDeGastos=" + listaDeGastos + ", listNome=" + listNome + ", totalGasto="
                + totalGasto + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((listaDeGastos == null) ? 0 : listaDeGastos.hashCode());
        result = prime * result + ((listNome == null) ? 0 : listNome.hashCode());
        long temp;
        temp = Double.doubleToLongBits(totalGasto);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        PlanilhaGastos other = (PlanilhaGastos) obj;
        if (listaDeGastos == null) {
            if (other.listaDeGastos != null)
                return false;
        } else if (!listaDeGastos.equals(other.listaDeGastos))
            return false;
        if (listNome == null) {
            if (other.listNome != null)
                return false;
        } else if (!listNome.equals(other.listNome))
            return false;
        if (Double.doubleToLongBits(totalGasto) != Double.doubleToLongBits(other.totalGasto))
            return false;
        return true;
    }

}