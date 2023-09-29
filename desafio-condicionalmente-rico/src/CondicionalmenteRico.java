import java.util.Scanner;

public class CondicionalmenteRico {
    public static void main(String[] args) throws Exception {

        // Entrada de dados
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o saldo total da conta: ");
        int saldoTotal = scanner.nextInt();
        System.out.println("Digite o valor do saque: ");
        int valorSaque = scanner.nextInt();

        if (saldoTotal >= valorSaque) {
            int novoSaldo = saldoTotal - valorSaque;
            System.out.println("Saque realizado com sucesso. Novo saldo: " + novoSaldo);
        } else {
            System.out.println("Saldo insuficiente. Saque nao realizado!");
        }
    }
}
