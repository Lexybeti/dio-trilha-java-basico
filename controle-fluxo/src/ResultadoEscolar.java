public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 5;

        if(nota >= 7)
        System.out.println("Aprovado!");

        else if(nota >=5 && nota < 7) //precisa sempre me retornar true ou false
        System.out.println("Recuperação!");

        else
        System.out.println("Reprovado!");
    }
}
