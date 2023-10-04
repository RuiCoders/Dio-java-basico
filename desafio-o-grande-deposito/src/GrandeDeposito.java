import java.util.Scanner;

public class GrandeDeposito {
    public static void main(String[] args) throws Exception {
         Scanner scanner = new Scanner(System.in);
         double saldo = 0.0;
        double valor = scanner.nextDouble();
        
        if (valor > 0) {
            saldo += valor;
            System.out.println("Deposito realizado com sucesso!");
            System.out.println("Saldo atual: R$ " + String.format("%.2f", saldo));
        } else if (valor < 0 ) {
            System.out.println("Valor invalido! Digite um valor maior que zero.");
        } else {
            System.out.println("Encerrando o programa...");
        }
    }
    }
