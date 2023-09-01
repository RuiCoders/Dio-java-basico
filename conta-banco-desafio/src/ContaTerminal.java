import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int numero;
        String agencia, nomeCliente;
        double saldo;
        System.out.println("-------------------- CONTA BANCÁRIA -------------------- \n");
        System.out.println("Por favor, digite o número da Conta: ");
        numero = Integer.parseInt(scanner.nextLine());

        System.out.println("Digite sua Agencia: ");
        agencia = scanner.nextLine();
        
        
          /*
         * Neste código, após a leitura da agência com scanner.next(),
         * nós usamos scanner.nextLine() para consumir a quebra de linha pendente no
         * buffer.
         * Isso permite que você leia o nome do cliente corretamente, evitando que o
         * programa pule essa entrada.
         */
        System.out.println("Digite seu nome completo:");
        nomeCliente = scanner.nextLine();

        System.out.println("Entre com valor inicial depositado na conta:");
        saldo = scanner.nextDouble();

        System.out.println("-------------------- STATUS CONTA BANCÁRIA -------------------- \n");
        System.out.printf("Olá " + nomeCliente + ", \n" + 
                "Obrigado por criar uma conta em nosso banco, \n" + 
                        "sua agência é "
                + agencia + ", \n" + 
                        "conta " + numero + ", \n" + 
                                "e seu saldo R$ " + saldo + " já está disponível para saque.");

        scanner.close();

    }
}
