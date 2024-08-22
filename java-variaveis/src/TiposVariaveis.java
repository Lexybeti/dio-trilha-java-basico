public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        double salarioMinimo = 2;
        //estudando a variável do tipo String
        String meuNome = "Alexya";
        String seuNome = "João";
        System.out.println(meuNome);
        System.out.println(seuNome);
        
        //estudando variável para números
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        int numero = 1;
        numero = 2;

        System.out.println(numero);
        
        //utilizando constantes, definindo valores que não podem ser alterados
        final int NUMERO = 1;

        final short NUMERO_CURTO = 3;
        
        final double PI = 3.14;

        System.out.println(PI);
    }
}
