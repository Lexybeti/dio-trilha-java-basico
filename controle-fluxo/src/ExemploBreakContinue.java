public class ExemploBreakContinue {
    public static void main(String[] args) {
        for(int numero = 1; numero <= 5; numero ++){
            //se for break, ele para e não imprime

            /*se for continue, ele para, lê o "continue",
            * não imprime o número correspondente, e continua
            */
            if(numero == 3)
                continue;

            System.out.println(numero);
        }
    }
}
