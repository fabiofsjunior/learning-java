import java.util.Random;

public class LacoRepeticao {
    public static void main(String[] args) {
        
        //WHILE
        int contador1 = 0;
        System.out.println("Este é o laço de repetição WHILE");
        
        while (contador1<10){ //verifica e depois executa
            contador1 += 1;
            System.out.println("Contador. " + contador1);
        }

        // DO WHILE 
        int contador2 = 0;
        System.out.println("Este é o laço de repetição DO WHILE");
        
        do{ //verifica e depois executa
            contador2 += 1;
            System.out.println("Contador.. " + contador2);
        }while (contador2<10);
                    

        //FOR
        System.out.println("Este é o laço de repetição FOR");
        for (int contador3 = 1; contador3 <= 10; contador3 ++){
            System.out.println("Contador... " + contador3);
        }
        for (int contador3 = 10; contador3 >= 0; contador3 --){
            System.out.println("Contador... " + contador3);
        }


        //FOR com  BREAK
        System.out.println("Este é o laço de repetição FOR com um BREAK");

        for (int contador4 = 10; contador4 >= 0; contador4 --){
            System.out.println("Buscando número..." + contador4);
            if (contador4 == 7){
                System.out.println("Encontrei o número que buscava, R= " + contador4);
                break;
            }
        }

        System.out.println("Este é o laço de repetição FOR com um BREAK NO NÚMERO SORTEADO ");

        Random geraUmNumero = new Random();

        int numeroEscolhido = geraUmNumero.nextInt(100);

        System.out.println("O Número escolhido foi: " + numeroEscolhido);

        for (int contador4 = 0; contador4 >= 0; contador4 ++){
            System.out.println("Buscando número..." + contador4);
            
            if (contador4 == numeroEscolhido){
                System.out.println("Encontrei o número que buscava, R= " + contador4);
                break;
            }
        }

        System.out.println("Este é o laço de repetição FOR com um CONTINUE NO NÚMERO SORTEADO ");

        Random geraUmNumero2 = new Random();

        int numeroEscolhido2 = geraUmNumero2.nextInt(50);
        int numeroEscolhido3 = geraUmNumero2.nextInt(50);
        int numeroEscolhido4 = geraUmNumero2.nextInt(50);

        System.out.println("O Números escolhidos foram: " 
        + numeroEscolhido2 + ", " 
        + numeroEscolhido3 + "e " 
        + numeroEscolhido4 + "." );

        for (int contador4 = 0; contador4 >= 0; contador4 ++){
            System.out.println("Buscando número..." + contador4);
            
            if(contador4 == 50){
                break;
            }
            else if (contador4 == numeroEscolhido2 || contador4 == numeroEscolhido3 || contador4 == numeroEscolhido4){
                System.out.println("Encontrei o número que buscava, R= " + contador4);
                continue;
            }
            
        }


    }
}
