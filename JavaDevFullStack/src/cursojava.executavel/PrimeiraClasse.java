import javax.swing.JOptionPane;

public class PrimeiraClasse {
    public static void main(String[] args) {

        // Interação com o Usuário [Preenchimento dos dados]
        String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
        String idade = JOptionPane.showInputDialog("Qual a idade?");
        String dataNascimento = JOptionPane.showInputDialog("Qual a data de nascimento?");
        String registroGeral = JOptionPane.showInputDialog("Qual nr do Registro Geral?");
        String numeroCpf = JOptionPane.showInputDialog("Qual o CPF?");
        String nomeMae = JOptionPane.showInputDialog("Qual o nome da 'MÃE' do aluno?");
        String dataMatricula = JOptionPane.showInputDialog("Qual o nr da matricula?");
        String nomeEscola = JOptionPane.showInputDialog("Qual o nome da escola?");
        String serieMatriculado = JOptionPane.showInputDialog("Qual a série matriculada?");

        String disciplina1 = JOptionPane.showInputDialog("Qual a 1ª disciplina: ");
        String nota1 = JOptionPane.showInputDialog("Digite a nota da disciplina: " + disciplina1);
        String disciplina2 = JOptionPane.showInputDialog("Qual a 2ª disciplina: ");
        String nota2 = JOptionPane.showInputDialog("Digite a nota da disciplina: " + disciplina2);
        String disciplina3 = JOptionPane.showInputDialog("Qual a 3ª disciplina: ");
        String nota3 = JOptionPane.showInputDialog("Digite a nota da disciplina: " + disciplina3);
        String disciplina4 = JOptionPane.showInputDialog("Qual a 4ª disciplina: ");
        String nota4 = JOptionPane.showInputDialog("Digite a nota da disciplina: " + disciplina4);
      

        // Instâncias

        // Agora temos um objeto real namemória e 'Aluno1' é referência ao Objeto Aluno.
        Aluno aluno1 = new Aluno(); // João
        

        //
        aluno1.setNome(nome);
        aluno1.setIdade(Integer.valueOf(idade));
        aluno1.setDataNascimento(dataNascimento);
        aluno1.setRegistroGeral(registroGeral);
        aluno1.setNumeroCpf(numeroCpf);
        aluno1.setNomeMae(nomeMae);
        aluno1.setDataMatricula(dataMatricula);
        aluno1.setNomeEscola(nomeEscola);
        aluno1.setSerieMatriculado(serieMatriculado);


        aluno1.getDisciplina().setNota1(Double.parseDouble(nota1));
        aluno1.getDisciplina().setNota2(Double.parseDouble(nota2));
        aluno1.getDisciplina().setNota3(Double.parseDouble(nota3));
        aluno1.getDisciplina().setNota4(Double.parseDouble(nota4));

        aluno1.getDisciplina().setDisciplina1(disciplina1);// getDisciplina().setDisciplina1(disciplina1);
        aluno1.getDisciplina().setDisciplina2(disciplina2);
        aluno1.getDisciplina().setDisciplina3(disciplina3);
        aluno1.getDisciplina().setDisciplina4(disciplina4);

        // Saída de dados
        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("Idade: " + aluno1.getIdade());
        System.out.println("Data de nascimento: " + aluno1.getDataNascimento());
        System.out.println("Nome da mãe : " + aluno1.getNomeMae());
        System.out.println("Média da nota: " + aluno1.getMediaNota());
        System.out.println("Resultado: " + (aluno1.getAlunoAprovado() ? "Aprovado!" : "Reprovado!"));

        // Saída de dados de forma simplificada metodo 'toString'.
        System.out.println(aluno1.toString()); // Descrição do objeto na memória.

    }
}
