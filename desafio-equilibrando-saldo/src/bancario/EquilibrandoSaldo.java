package bancario;

import java.util.Scanner;

public class EquilibrandoSaldo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o saldo atual: ");
		double saldoAtual = scanner.nextDouble();

		System.out.print("Digite o valor do depósito: ");
		double valorDeposito = scanner.nextDouble();

		System.out.print("Digite o valor da retirada: ");
		double valorRetirada = scanner.nextDouble();
		scanner.close();
		

		saldoAtual = saldoAtual + valorDeposito;
		saldoAtual = saldoAtual - valorRetirada;
		
		System.out.printf("Saldo atualizado na conta:  %.1f", saldoAtual);
	}

}
