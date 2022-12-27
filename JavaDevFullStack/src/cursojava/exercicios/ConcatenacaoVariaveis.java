package cursojava.exercicios;

public class ConcatenacaoVariaveis {
    
    public static void main(String[] args) {
        

        String nome = "Fábio F S Jr";
        String cpf = "123.456.789-10";
        String telefone = "(00) 9 9999-9999";
        String endereco = "Rua numero, bairro, cidade/estado.";

        String saida = "Meu nome é: " + nome + ", de CPF:" + cpf + ", endereço: " +endereco + ", telefone:" + telefone + ".";

        System.out.println(saida);

    }
}
