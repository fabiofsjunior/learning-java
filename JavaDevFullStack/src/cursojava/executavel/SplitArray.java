package cursojava.executavel;

import java.util.Arrays;
import java.util.List;

public class SplitArray {
    public static void main(String[] args) {

        //Convertendo uma String num Array e vice versa
        String texto = "Fábio, Curso em Java, 80, 70, 90, 60";

        String[] valoresArray = texto.split(",");

        System.out.println(valoresArray);

        //Convertendo um Array em uma Lista.
        List<String> list = Arrays.asList(valoresArray);
        System.out.println(list);

        for (String valoString : list) {
            System.out.println(valoString);
            
        }

        //Convertendo uma Lista em um Array
        String[] conversaoArray = list.toArray(new String[6]);

        for (int pos = 0; pos < conversaoArray.length; pos++){
            System.out.println(conversaoArray[pos]);
        }
    }
}
