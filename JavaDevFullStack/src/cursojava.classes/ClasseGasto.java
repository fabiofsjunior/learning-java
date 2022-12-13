import java.util.ArrayList;
import java.util.List;

public class ClasseGasto {
    
    List<ClasseGasto> gastos = new ArrayList<>();
    double valor;
    String tag;
    String dataCompra;
    String formaPagamento;

    
    public ClasseGasto(List<ClasseGasto> gastos, double valor, String tag, String dataCompra, String formaPagamento) {
        this.gastos = gastos;
        this.valor = valor;
        this.tag = tag;
        this.dataCompra = dataCompra;
        this.formaPagamento = formaPagamento;
    }



}