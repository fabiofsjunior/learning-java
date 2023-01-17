package cursojava.classes;

import javax.swing.JOptionPane;

public class arrayVetor {

    public static void main(String[] args) {

        // o Array sempre é necessário definir a quantidade de posições.



        //Solicita a quantidade de posições de forma dinâmica.
        String qtdPosicoes = JOptionPane.showInputDialog("Qual será o tamanho do array?");

        //Converte a quantidade capturada em inteiros para que possa ser utilizado no FOR
        double[] notas = new double[Integer.parseInt(qtdPosicoes)];

        //Solicitando de forma dinâmica os valores de cada item do Array.
        for (int pos = 0; pos < notas.length; pos++) {

            notas[pos] = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota para a posição:"));

        }
        //Imprimindo no console de foram dinâmica os valores do array.
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota na posição " + i + " é igual a: " + notas[i]);
        }

    }
}
