public class PlanoOperadora {
    public static void main(String[] args) {
        //Switch case utilizado da melhor forma possível

        //É importante estudar continue, break e default
        String plano = "B";

        switch(plano) {
            case "T": {
                System.out.println("5Gb YouTube");
            }
            case "M": {
                System.out.println("WhatsApp e Instagram grátis");
            }
            case "B": {
                System.out.println("100 minutos de ligação");
            }
        }
    }
}
