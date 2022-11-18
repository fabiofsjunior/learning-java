package estrutura_dados_algoritmos;

public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 10;
    
    public void ligar(){
        ligada = true;
        System.out.println("Turn On.");

    }
    public void desligar(){
        ligada = false;
        System.out.println("Turn Off.");
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("Volume....... "+volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Volume....... "+volume);
    }
    
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
        System.out.println("Canal: "+canal);

    }

    public void aumentarCanal(){
        canal++;
        System.out.println("Canal: "+canal);
    }
    
    public void diminuirCanal(){
        canal++;
        System.out.println("Canal: "+canal);
    }


}
