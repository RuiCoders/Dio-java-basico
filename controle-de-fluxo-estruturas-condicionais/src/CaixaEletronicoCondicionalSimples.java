public class CaixaEletronicoCondicionalSimples {
    public static void main(String[] args) throws Exception {
       double saldo = 25.0;
       double valorSolicitado = 12.0;

       if(valorSolicitado < saldo)
        saldo = saldo - valorSolicitado; 
       
        System.out.println(saldo);
    }
}
