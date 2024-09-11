public class SistemaMedida {
    public static void main(String[] args) {
        
        /* Utilizar o switch case precisa ter atenção
         * em onde está sendo utilizado. Até porque, de modo geral,
         * ele não é tão preciso quanto um if else tradicional
         */
        String sigla = "GG";

        switch(sigla) {
            case "P": {
                System.out.println("PEQUENO");
                break;
            }
            case "M": {
                System.out.println("MÉDIO");
                break;
            }
            case "G": {
                System.out.println("GRANDE");
                break;
            }
            case "GG": {
                System.out.println("EXTRA GRANDE");
                break;
            }
            default:
                System.out.println("INDEFINIDO");
        }
    }
}
