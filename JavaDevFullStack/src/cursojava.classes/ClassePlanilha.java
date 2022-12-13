import java.util.ArrayList;
import java.util.List;

/*
Uma lista de gastos pessoais pode conter vários atributos, dependendo do objetivo da lista e da pessoa que a criou. Alguns possíveis atributos que poderiam estar incluídos em uma lista de gastos pessoais são:

*Data do gasto
*Categoria do gasto (por exemplo, alimentação, transporte, lazer, saúde, etc.)
*Valor do gasto
*Forma de pagamento (dinheiro, cartão de crédito, etc.)

Esses são apenas alguns exemplos de atributos que poderiam estar incluídos em uma lista de gastos pessoais. A lista pode conter outros atributos além desses, dependendo das necessidades e preferências da pessoa que a criou.
 */

public class ClassePlanilha {

    // ATRIBUTOS

    List<ClassePlanilha> item = new ArrayList<>();

    public List<ClassePlanilha> getItem() {
        return item;
    }

    public void setItem(List<ClassePlanilha> item) {
        this.item = item;
    }

    public ClassePlanilha(List<ClassePlanilha> item) {
        this.item = item;
    }

    
}