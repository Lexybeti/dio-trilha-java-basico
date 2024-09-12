public class ExemploForArray {
    public static void main(String[] args) {
        
        //em arrays o indice inicia em zero(0)
        String alunos[] = { "RICARDA", "JOANA", "PEDRO", "RODRIGO"};

        for (int x=0; x < alunos.length; x ++) {
            System.out.println("O aluno no indice x = " + x + " é " + alunos[x]);
        }

        System.out.println("!Pausa!");
        
        //formato mais reduzido para For, chamado For Each
        for(String aluno : alunos){
            System.out.println("Nome do aluno é: " + aluno);
        }
    }
}
