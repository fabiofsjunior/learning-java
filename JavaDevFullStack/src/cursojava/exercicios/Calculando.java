package cursojava.exercicios;

import javax.swing.JOptionPane;

public class Calculando {

    public static void main(String[] args) {

        double nota1 = 12;
        double nota2 = 20;
        double nota3 = 30;
        double nota4 = 40;

        System.out.println("Média das notas = " + (nota1 + nota2 + nota3 + nota4) / 4);

        double mediaFinal = ((nota1 + nota2 + nota3 + nota4) / 4);

        if (mediaFinal > 20) {
            System.out.println("Está aprovado com a média = " + mediaFinal + "!");
        }

        String carros = JOptionPane.showInputDialog("Informe a quantidade de carros:");
        String pessoas = JOptionPane.showInputDialog("Informe a quantidade de pessoas:");

        double carrosNumero = Double.parseDouble(carros);
        double pessoasNumero = Double.parseDouble(pessoas);

        int divisao = (int) (carrosNumero / pessoasNumero);
        double resto = carrosNumero % pessoasNumero;

        System.out.println(carros);
        System.out.println(pessoas);
        System.out.println(divisao);
        System.out.println(resto);


        int resposta = JOptionPane.showConfirmDialog(null,"Deseja ver o resultado da divisão?");

        if (resposta == 0){
            JOptionPane.showMessageDialog(null, "Divisão para cada pessoa deu: "+ divisao + ".");
        }

        System.out.println(resposta);

        JOptionPane.showMessageDialog(null,
                "Cada pessoa ficou com: " + divisao + ", e sobraram: " + resto + " carros.");
    }
}
