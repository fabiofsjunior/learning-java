package estrutura_dados_algoritmos;

public class Usuario {
 
    public static void main(String[] args) throws Exception{
        SmartTv smartTv = new SmartTv();

        System.out.println("Status: " + smartTv.ligada);

        smartTv.ligar();

        if (smartTv.ligada == true){
            System.out.println("Canal Atual: " + smartTv.canal);
            System.out.println("Volume Atual: " + smartTv.volume);
        }
           
        smartTv.mudarCanal(10);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();

        smartTv.diminuirVolume();

        smartTv.mudarCanal(13);

        smartTv.desligar();
    }
    
}
