package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class ArraysVetores {

    public static void main(String[] args) {

        // o Array sempre é necessário definir a quantidade de posições.

       // double[] valores = { 1.0, 2.0, 3.0 }; // Posso declarar diretamente os valores

        // Array de Strings

        // declarando separadamente
        String[] valoreStrings = new String[5];
        valoreStrings[0] = "Fábio";
        valoreStrings[1] = "10";
        valoreStrings[2] = "Curso de Java";
        valoreStrings[3] = "contato@JdevTreinamento.com.br";

        // declarando diretamente.
        /*String[] valoresDeclarados = {
                "Fábio",
                "10",
                "Curso Java",
                "81 9999-9999" };*/

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

        //criação da disciplina0
        Disciplina disciplina = new Disciplina();
        disciplina.setDisciplina("Curso de Java");
        double[] nota = {8, 7, 6, 9};
        disciplina.setNota(nota);

        //criação da disciplina1
        Disciplina disciplina1 = new Disciplina();
        disciplina1.setDisciplina("Curso de Java");
        double[] nota1 = {8.1, 7.2, 6.3, 9.4};
        disciplina1.setNota(nota1);

        aluno.getDisciplinas().add(disciplina);
        aluno.getDisciplinas().add(disciplina1);


        System.out.println("Nome do aluno = " + aluno.getNome() + " inscrito no curso: " + aluno.getNomeEscola());
        System.out.println("--------- Disciplina do aluno ---------");

        for (Disciplina d : aluno.getDisciplinas()) {
            System.out.println("Disciplina: " + d.getDisciplina());
            System.out.println("A nota da disciplina são: ");

            double notaMax = 0.0;

            for (int posi = 0; posi < d.getNota().length; posi++ ){
                System.out.println("Nota " + posi + " é igual  = " + d.getNota()[posi]);

                //Descobrindo a maior nota com uma Variável Auxiliar.
                if (posi == 0){
                    notaMax = d.getNota()[posi];
                }else{
                    if (d.getNota()[posi] > notaMax){
                        notaMax = d.getNota()[posi];
                    }
                }
            }
            System.out.println(" A maior nota da disciplina " + d.getDisciplina() + " é " + notaMax);
            
        }

    }
}
