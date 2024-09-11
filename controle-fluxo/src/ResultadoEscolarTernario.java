public class ResultadoEscolarTernario {
    public static void main(String[] args) {
        /*semelhante a outras aplicações anteriores, utilizei a condição ternária para deixar o código mais simples*/
        int nota = 7;

        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";

        System.out.println(resultado);
    }
}
