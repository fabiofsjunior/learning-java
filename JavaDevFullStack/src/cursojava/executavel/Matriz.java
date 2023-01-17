package cursojava.executavel;

public class Matriz {
    public static void main(String[] args) {
        

        //matriz é uma array composto de outros arrays
        int notas[][] = new int[2][3];

        notas[0][0]=80;
        notas[0][1]=90;
        notas[0][2]=70;

        notas [1][0]=10;
        notas [1][1]=20;
        notas [1][2]=30;


        //Pecorre as linhas.

        for (int posLinha = 0; posLinha < notas.length; posLinha++){
            System.out.println("=========");
            for (int posColuna = 0; posColuna < notas[posLinha].length; posColuna++){
                System.out.println(notas[posLinha][posColuna]);
            }
        }


    }
}
