package cursojava.classes;

import javax.swing.JOptionPane;

public class arrayVetor {

    public static void main(String[] args) {

        // o Array sempre é necessário definir a quantidade de posições.

        double[] valores = { 1.0, 2.0, 3.0 }; // Posso declarar diretamente os valores

        // Array de Strings

        // declarando separadamente
        String[] valoreStrings = new String[5];
        valoreStrings[0] = "Fábio";
        valoreStrings[1] = "10";
        valoreStrings[2] = "Curso de Java";
        valoreStrings[3] = "contato@JdevTreinamento.com.br";

        // declarando diretamente.
        String[] valoresDeclarados = {
                "Fábio",
                "10",
                "Curso Java",
                "81 9999-9999" };

        // Solicita a quantidade de posições de forma dinâmica.
        String qtdPosicoes = JOptionPane.showInputDialog("Qual será o tamanho do array?");

        // Converte a quantidade capturada em inteiros para que possa ser utilizado no
        // FOR
        double[] notas = new double[Integer.parseInt(qtdPosicoes)];

        // Solicitando de forma dinâmica os valores de cada item do Array.
        for (int pos = 0; pos < notas.length; pos++) {

            notas[pos] = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota para a posição:"));

        }
        // Imprimindo no console de foram dinâmica os valores do array.
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota na posição " + i + " é igual a: " + notas[i]);
        }


        //Praticando

        //criação do aluno
        Aluno aluno = new Aluno();
        aluno.setNome("Fábio");
        aluno.setNomeEscola("JDevTreinamentos");

        //criação da disciplina
        Disciplina disciplina = new Disciplina();
        disciplina.setDisciplina("Curso de Java");
        double[] nota = {8, 7, 6, 9};
        disciplina.setNota(nota);

        aluno.getDisciplinas().add(disciplina);



    }
}
