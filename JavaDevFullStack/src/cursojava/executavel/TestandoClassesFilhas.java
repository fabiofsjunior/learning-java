package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Pessoa;
import cursojava.classes.Secretario;

public class TestandoClassesFilhas {
    /**
     * @param args
     */
    public static void main(String[] args) {

        Aluno aluno = new Aluno();
        aluno.setNome("Fábio Fs Dev Java");

        Diretor diretor = new Diretor();
        diretor.setNome("Steven Spielberg");

        Secretario secretario = new Secretario();
        secretario.setNome("Jack Black");



        System.out.println("Salário Aluno é: "+ aluno.salario());
        System.out.println("Salário Diretor é: "+ diretor.salario());
        System.out.println("Salário Secretário é: "+ secretario.salario());

        
        teste(aluno);
        teste(diretor);
        teste(secretario);

        
    }

    public static void teste(Pessoa pessoa){
        System.out.println("Esta pessoa é demais = R$"
        + pessoa.getNome() + "e o salário é de = R$" + pessoa.salario());
    }
}
