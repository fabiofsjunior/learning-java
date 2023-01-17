package cursojava.classes;

public class arrayVetor {
    
    public static void main(String[] args) {

        //o Array sempre é necessário definir a quantidade de posições.
        double[] notas = new double[4];

        notas[0] = 1.5;
        notas[1] = 2.1;
        notas[2] = 3.2;
        notas[3] = 4.3;

        for (int i = 0; i < 5; i++){
            System.out.println("Nota na posição: " + i + " é igual a: " + notas[i]);
        }

      

    }
}
