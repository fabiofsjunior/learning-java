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

    double nota1;
    double nota2;
    double nota3;
    double nota4;

    // Construtores
    public Aluno() {

    }

    public Aluno(String nomePadrao) {
        nome = nomePadrao;
    }

    public Aluno(String nomePadrao, int idadePadrao) {
        nome = nomePadrao;
        idade = idadePadrao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public double getNota4() {
        return nota4;
    }

    // SETTERS -----------------------------------
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

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public void setNota4(double nota4) {
        this.nota4 = nota4;
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

    /* Calcula a média do aluno. */
    public double getMediaNota() {
        return (nota1 + nota2 + nota3 + nota4) / 4;
    }

    public boolean getAlunoAprovado(){
        double media = this.getMediaNota();
        if (media >= 7){
            return true;
        }else{
            return false;
        }
    }
   

}
