package estrutura_dados_algoritmos;
import java.util.Scanner;
import java.util.Locale;

public class UserInputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US); 
        //nome para o objeto SCANNER não pode ser igual parece óbvio, mas só entendi pesquisando sobre o erro.
        //lembrar de utilizar o LOCALE US para pontuar casas decimais.
        String nome;
        int idade;
        double altura;

        System.out.println("Diga seu nome:");
        nome = input.nextLine();

        System.out.println("Diga seu idade:");
        idade = input.nextInt();

        System.out.println("Diga seu Altura:");
        altura = input.nextDouble();
        
        System.out.println("Seu nome: "+ nome);
        System.out.println("Seu peso: " + idade);
        System.out.println("Seu nome: " + altura);
        input.close(); //lembrar de fechar o "SCANNER" pra não ocorrer erro na execução.

    }
}
