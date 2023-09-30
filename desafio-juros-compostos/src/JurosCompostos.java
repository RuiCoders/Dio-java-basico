import java.text.DecimalFormat;
import java.util.Scanner;

public class JurosCompostos {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.print("Digite o valor inicial: ");
        double valorInicial = scanner.nextDouble();

        System.out.print("Digite a taxa de juros (em decimal): ");
        double taxaJuros = scanner.nextDouble();

        System.out.print("Digite o período em anos: ");
        int periodo = scanner.nextInt();

        double valorFinal = valorInicial;

        for (int i = 0; i < periodo; i++) {
            valorFinal += valorFinal * taxaJuros;
        }
        System.out.println("Valor final do investimento: R$ " + df.format(valorFinal));

        scanner.close();
    }

}
