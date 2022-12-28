
package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;
import cursojava.classes.Secretario;
import cursojava.interfaces.PermitirAcesso;

public class PrimeiraClasse {
    public static void main(String[] args) {

        String login = JOptionPane.showInputDialog("Informe o login:");
        String senha = JOptionPane.showInputDialog("Informe a senha:");

        if (new Secretario().autenticar(login, senha)) {

            // Agora temos um objeto real namemória e 'Aluno1' é referência ao Objeto Aluno.
            Aluno aluno1 = new Aluno(); // Ex.: João

            // Interação com o Usuário [Preenchimento dos dados]
            String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
            /*
             * String idade = JOptionPane.showInputDialog("Qual a idade?");
             * String dataNascimento =
             * JOptionPane.showInputDialog("Qual a data de nascimento?");
             * String registroGeral =
             * JOptionPane.showInputDialog("Qual nr do Registro Geral?");
             * String numeroCpf = JOptionPane.showInputDialog("Qual o CPF?");
             * String nomeMae =
             * JOptionPane.showInputDialog("Qual o nome da 'MÃE' do aluno?");
             * String dataMatricula =
             * JOptionPane.showInputDialog("Qual o nr da matricula?");
             * String nomeEscola = JOptionPane.showInputDialog("Qual o nome da escola?");
             * String serieMatriculado =
             * JOptionPane.showInputDialog("Qual a série matriculada?");
             */

            for (int pos = 1; pos <= 4; pos++) {
                String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina " + pos + " ?");
                String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina " + pos + " ?");
                Disciplina disciplina = new Disciplina();
                disciplina.setDisciplina(nomeDisciplina);
                disciplina.setNota(Double.valueOf(notaDisciplina));
                aluno1.getDisciplinas().add(disciplina);

            }
            int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma discipplina?");

            if (escolha == 0) {
                String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina?");
                aluno1.getDisciplinas().remove(Integer.parseInt(disciplinaRemover) - 1);
            }

            /*
             * String disciplina1 = JOptionPane.showInputDialog("Qual a 1ª disciplina: ");
             * String nota1 = JOptionPane.showInputDialog("Digite a nota da disciplina: " +
             * disciplina1);
             * String disciplina2 = JOptionPane.showInputDialog("Qual a 2ª disciplina: ");
             * String nota2 = JOptionPane.showInputDialog("Digite a nota da disciplina: " +
             * disciplina2);
             * String disciplina3 = JOptionPane.showInputDialog("Qual a 3ª disciplina: ");
             * String nota3 = JOptionPane.showInputDialog("Digite a nota da disciplina: " +
             * disciplina3);
             * String disciplina4 = JOptionPane.showInputDialog("Qual a 4ª disciplina: ");
             * String nota4 = JOptionPane.showInputDialog("Digite a nota da disciplina: " +
             * disciplina4);
             */

            //
            aluno1.setNome(nome);
            /*
             * aluno1.setIdade(Integer.valueOf(idade));
             * aluno1.setDataNascimento(dataNascimento);
             * aluno1.setRegistroGeral(registroGeral);
             * aluno1.setNumeroCpf(numeroCpf);
             * aluno1.setNomeMae(nomeMae);
             * aluno1.setDataMatricula(dataMatricula);
             * aluno1.setNomeEscola(nomeEscola);
             * aluno1.setSerieMatriculado(serieMatriculado);
             */

            // Disciplina disciplina1 = new Disciplina();
            // disciplina1.setDisciplina(JOptionPane.showInputDialog("Qual a 1ª disciplina:
            // "));
            // disciplina1.setNota(9);

            // aluno1.getDisciplinas().add(disciplina1);

            // Disciplina disciplina2 = new Disciplina();
            // disciplina2.setDisciplina("Java Orientado Objetos");
            // disciplina2.setNota(8);

            // aluno1.getDisciplinas().add(disciplina2);

            // Disciplina disciplina3 = new Disciplina();
            // disciplina3.setDisciplina("Springboot");
            // disciplina3.setNota(7);

            // aluno1.getDisciplinas().add(disciplina3);

            // Disciplina disciplina4 = new Disciplina();
            // disciplina3.setDisciplina("HTML/CSS");
            // disciplina3.setNota(9);

            // aluno1.getDisciplinas().add(disciplina4);

            // Saída de dados
            System.out.println("Nome: " + aluno1.getNome());
            System.out.println("Idade: " + aluno1.getIdade());
            System.out.println("Data de nascimento: " + aluno1.getDataNascimento());
            System.out.println("Nome da mãe : " + aluno1.getNomeMae());
            System.out.println("Média da nota: " + aluno1.getMediaNota());
            System.out.println("Resultado: " + (aluno1.getAlunoAprovado() ? "Aprovado!" : "Reprovado!"));

            // Saída de dados de forma simplificada metodo 'toString'.
            System.out.println(aluno1.toString()); // Descrição do objeto na memória.
        } else {
            JOptionPane.showMessageDialog(null, "Acesso negado!");
        }
    }
}
