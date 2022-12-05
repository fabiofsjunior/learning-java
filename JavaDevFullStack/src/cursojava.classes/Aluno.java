public class Aluno {

    // Atributos
    String nome;
    int idade;
    String dataNascimento;
    String registroGeral;
    String numeroCpf;
    String nomeMae;
    String dataMatricula;
    String nomeEscola;
    String serieMatriculado;
    

    Disciplina disciplina = new Disciplina();

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
    public Disciplina getDisciplina() {
        return disciplina;
    }
    
    // Construtor -----------------------------------
    public Aluno() {

    }

    // SETTERS -----------------------------------

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setRegistroGeral(String registroGeral) {
        this.registroGeral = registroGeral;
    }

    public void setNumeroCpf(String numeroCpf) {
        this.numeroCpf = numeroCpf;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public void setDataMatricula(String dataMatricula) {
        this.dataMatricula = dataMatricula;
    }

    public void setNomeEscola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
    }

    public void setSerieMatriculado(String serieMatriculado) {
        this.serieMatriculado = serieMatriculado;
    }

    // GETTERS -----------------------------------

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getRegistroGeral() {
        return registroGeral;
    }

    public String getNumeroCpf() {
        return numeroCpf;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public String getDataMatricula() {
        return dataMatricula;
    }

    public String getNomeEscola() {
        return nomeEscola;
    }

    public String getSerieMatriculado() {
        return serieMatriculado;
    }



    // METODOS -----------------------------------

    @Override
    public String toString() {
        return "Aluno [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", registroGeral="
                + registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae + ", dataMatricula="
                + dataMatricula + ", nomeEscola=" + nomeEscola + ", serieMatriculado=" + serieMatriculado
                + ", disciplina=" + disciplina + "]";
    }
    // Calcula a média do aluno
    public double getMediaNota() {
        return (disciplina.getNota1() + disciplina.getNota2() + disciplina.getNota3() + disciplina.getNota4()) / 4;
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

}
