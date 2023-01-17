package cursojava.classes;

public class Disciplina {
    // Esta classe disciplina, servirá para todos objetos e instâncias de notas e
    // matérias.
    double[] nota = new double[4];
    String disciplina;

    public double[] getNota() {
        return nota;
    }

    public double getMediaNotas(){
        double somaTotal = 0;
        for (int i = 0; i < nota.length; i++){
            somaTotal +=nota[i];
        }
        return somaTotal/4;
    }

    public void setNota(double[] nota) {
        this.nota = nota;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

}