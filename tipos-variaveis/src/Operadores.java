import javax.imageio.stream.ImageInputStreamImpl;

public class Operadores {
    public static void main(String[] args) {
        // concatenando textos

        /*
         * String nomeCompleto = "Linguagem " + "Java";
         * System.out.println(nomeCompleto);
         * 
         * String concatenacao = "?";
         * 
         * concatenacao = 1+1+1+"1";
         * System.out.println(concatenacao);
         * 
         * concatenacao = 1+"1"+1+1;
         * System.out.println(concatenacao);
         * 
         * concatenacao = 1+"1"+1+"1";
         * System.out.println(concatenacao);
         * 
         * concatenacao = "1"+1+1+1;
         * System.out.println(concatenacao);
         * 
         * concatenacao = "1"+(1+1+1);
         * System.out.println(concatenacao);
         */

        // Operadores de incremento e decremento

        /*
         * int numero = 5;
         * int numero2 = 3;
         * numero = -numero;
         * // o numero estava positivo com atribuição o numero ficou negativo
         * System.out.println(numero);
         * // realizzei a impressao e mesmo -5
         * numero = -numero;
         * // realizei a troca do operador aritimentico por - + - retorna positivo 5
         * System.out.println(numero);
         * numero = ++numero;
         * numero2= --numero2;
         * // incremento de antes de impressão somando somente mais 1
         * // incremento depois numero ++ somando somente mais 1
         * System.out.println(numero);
         * System.out.println(numero2);
         */

        // Operadores Boolenos true /false

        /*
         * boolean verdadeira = true;
         * boolean falsa = false;
         * // transformando a mesma com o sinal de negação
         * verdadeira = !verdadeira;
         * falsa = !falsa;
         * System.out.println(verdadeira);
         * System.out.println(falsa);
         */

        // Operador Ternario

        /*
         * int a, b;
         * a= 5;
         * b=5;
         * String resultado = a==b ?"verdadeiro" : "falso";
         * // a == igual deve retornar verdadeiro ou falso Utilizando o ternario ?: como
         * resultado em unica linha diferiente IF /ELSE lembrando que string tem o
         * retorno como texto
         * System.out.println(resultado);
         */

        // Operadores Relacionais

        /*
         * == Igual
         * != Diferiente
         * > Maior
         * >= Maior ou igual
         * < Menor
         * <= Menor ou igual
         
        int numero1 = 1;
        int numero2 = 2;
        boolean simNao = numero1 == numero2;
        System.out.println("numeroUm é IGUAL a numeroDois?" + simNao);

        simNao = numero1 != numero2;
        System.out.println("numeroUm é DIFERENTE a numeroDois?" + simNao);

        simNao = numero1 > numero2;
        System.out.println("numeroUm é MAIOR a numeroDois?" + simNao);
          if(numero1 < numero2){
            System.out.println("A nossa condição e verdadeira");
        }*/

        //Operadores Logicos

        /*boolean condicao1 = true;
        boolean condicao2 =true;

        if(condicao1 && condicao2){
            System.out.println("As DUAS condiçoes são verdadeiras");
             }
        if(condicao1 || condicao2){
            System.out.println("UMA das condições e verdadeira");
        }*/

        
    }

}
