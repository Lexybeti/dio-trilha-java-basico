import java.util.Random;
public class ExemploDoWhile {
    public static void main(String[] args) {
        System.out.println("Discando...");

        do {
            System.out.println("Telefone tocando");
        } while(tocando());

        System.out.println("Alô?");
    }
    /*dentro desse método, será gerado um número aleatório
     * de 1 a 3. Quando o valor for igual a "1", significa
     * que a pessoa atendeu. Logo, "true"
     */
    private static boolean tocando() {
        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("Atendeu? " + atendeu);
        return !atendeu;
    }
}
