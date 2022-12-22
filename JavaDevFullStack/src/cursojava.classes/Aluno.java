import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa {

    List<Disciplina> disciplinas = new ArrayList<Disciplina>();
    String dataMatricula;
    String nomeEscola;
    String serieMatriculado;

    public Aluno() {

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

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public String getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public String getNomeEscola() {
        return nomeEscola;
    }

    public void setNomeEscola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
    }

    public String getSerieMatriculado() {
        return serieMatriculado;
    }

    public void setSerieMatriculado(String serieMatriculado) {
        this.serieMatriculado = serieMatriculado;
    }

    @Override
    public String toString() {
        return "Aluno [disciplinas=" + disciplinas + ", dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola
                + ", serieMatriculado=" + serieMatriculado + "]";
    }

    

}
