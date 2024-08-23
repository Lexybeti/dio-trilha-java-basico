public class Operadores {

    public static void main(String[] args){
        //entendendo os tipos de operadores
        //começando com a concatenação, onde juntamos testos com testos através do operador de "Soma"
        String nomeCompleto = "Liguagem" + " Java";
        System.out.println(nomeCompleto);

        //utilizando a concatenação junto de números e vendo seus resultados
        String concatenaçao = "?";

        concatenaçao = 1+1+1+"1";

        System.out.println(concatenaçao);

        concatenaçao = 1+1+"1"+1;

        System.out.println(concatenaçao);

        concatenaçao = 1+"1"+1+1;

        System.out.println(concatenaçao);
        /*uma forma de fazer cálculos mesmo tendo uma String do lado, é utilizando os valores que serão calculados
        dentro de parenteses(). Dessa forma, o programa irá calcular o que está dentro dos parenteses() e, depois,
        concatenar com a String ao lado*/
        concatenaçao = "1"+(1+1+1);

        System.out.println(concatenaçao);
        //sempre que o programa identificar uma String, ele vai parar de calcular automaticamente

        /*int numUm = 4;
         * System.out.printIn(- numUm) -> não irá retornar um valor negativo, para fazer isso, precisamos
         * dizer que a variável é igual ela mesma no negativo, exemplo:
         */
        int numUm = 1;
        numUm = -numUm;
        System.out.println(numUm);

        //e para transformar ele de volta em positivo, basta fazer multiplicado por -1, exemplo:
        numUm = numUm * -1;
        System.out.println(numUm);


        //utilizando "boolean" e adicionando os operadores "if else"
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2; {
    
        if(numero1 == numero2) {
            System.out.println("A condição é verdadeira!");
        }
        System.out.println("numeroUm igual a numeroDois?");

        }
        //utilizando a condição Ternária
        int a, b;
        a = 5;
        b = 6;

        if (a == b)
            System.out.println("Verdadeiro!");
            else 
                System.out.println("Falso!");

        String resultado = a == b ? "Verdadeiro!" : "Falso!";
        System.out.println(resultado);
        
        /*textos são armazenados de forma diferente dos números, por isso precisamos do .equals
        para fazer a comparação de um conteúdo e determinar se é verdadeiro ou falso*/
        String nomeUm = "Alexya";
        String nomeDois = new String("Alexya");

        System.out.println(nomeUm.equals(nomeDois));

        //aprendendo a utilizar AND e OR
        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 && condicao2){
            System.out.println("As duas condições são verdadeiras!"); //utilizando AND
        }
        //para AND, só será verdadeira quando TODAS informações forem verdadeiras
        if(condicao1 || condicao2){
            System.out.println("Uma das condições é verdadeira!"); //utilizando OR
        }
        //para OR, só será falso quando TODAS informações forem falsas
        System.out.println("Fim");

    }

}

