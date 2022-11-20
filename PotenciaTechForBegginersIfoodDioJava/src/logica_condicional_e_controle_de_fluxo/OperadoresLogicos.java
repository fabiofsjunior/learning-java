package logica_condicional_e_controle_de_fluxo;

public class OperadoresLogicos{

    public static void main(String[] args) {
        
        boolean a = true;
        boolean b = true;
        boolean c = false;
        boolean d = false;

            // O conectivo E é utilizado nas expressões em que desejamos que todas as condições sejam verdadeiras.
            System.out.println("a && b" + " " + (a && b)); // V e V = V
            System.out.println("a && c" + " " + (a && c)); // V e F = F
            System.out.println("c && d" + " " + (c && d)); // F e F = F
            
            //O conectivo OU diz que uma das expressões deve ser verdadeira.
            System.out.println("a || b" + " " + (a || b)); // V ou V = V
            System.out.println("a || c" + " " + (a || c)); // V ou F = V
            System.out.println("c || d" + " " + (c || d)); // F ou F = F
            

            //XOR retorna verdadeiro apenas se os dois operandos forem diferentes
            System.out.println("a ^ b" + " " + (a ^ b)); // V ^ V = F
            System.out.println("a ^ c" + " " + (a ^ c)); // V ^ F = V
            System.out.println("c ^ d" + " " + (c ^ d)); // F ^ F = F
            
          
    }
}
/*  Nome            /Simbologia      /Terminologia
    Conjução            &&              and  Só é TRUE quando AMBOS são TRUE
    Disjunção           ||              or
    Disjunção Exclusiva: ^              xor
    Negação             !               inverção 
 */


 /* Escreva um programa que lê uma palavra e 
  Digite algumas palavras
  * input algumas palavras
  adiciona a uma lista
  mensura cada palavra
  retorna resultado

  */
