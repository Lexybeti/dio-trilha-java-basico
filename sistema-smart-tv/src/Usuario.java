public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("A TV está ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);


        smartTv.ligar();
        System.out.println("Usuário pressionou o botão de ligar. A TV ligou? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Usuário pressionou o botão novamente para desligar. A TV está ligada? " + 
        smartTv.ligada);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();

        smartTv.aumentarCanal();
        smartTv.diminuirCanal();
        smartTv.mudarCanal(10);
    }
}
