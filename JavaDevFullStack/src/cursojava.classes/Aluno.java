import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa {

    List<Disciplina> disciplinas = new ArrayList<Disciplina>();

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public Aluno() {

    }

    @Override
    public String toString() {
        return "Aluno [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", registroGeral="
                + registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae + ", dataMatricula="
                + dataMatricula + ", nomeEscola=" + nomeEscola + ", serieMatriculado=" + serieMatriculado + "]";
    }

    // Calcula a média do aluno
    public double getMediaNota() {
        double somaNotas = 0.0;
        for (Disciplina disciplina : disciplinas) {
            somaNotas += disciplina.getNota();
        }
        return somaNotas / disciplinas.size();

    }

    // Verifica se o aluno foi aprovado.
    public boolean getAlunoAprovado() {
        double media = this.getMediaNota();
        if (media >= 7) {
            return true;
        } else {
            return false;
        }
    }

    public String getAlunoAprovado2() {
        double media = this.getMediaNota();
        if (media >= 5) {
            if (media >= 7) {
                return "Aluno aprovado!";
            } else {
                return "Aluno em recuperação";
            }
        } else {
            return "Aluno reprovado!";
        }
    }

}
