package fluxo;

import java.util.Scanner;

public class contador {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int parametroUm;
		int parametroDois;

		try {
			System.out.println("Digite o primeio parâmetro:");
			parametroUm = Integer.parseInt(scanner.nextLine());

			System.out.println("Digite o segundo parâmetro:");
			parametroDois = Integer.parseInt(scanner.nextLine());

			contar(parametroUm, parametroDois);
		} catch (ParametrosInvalidosException e) {
			System.out.println(" O segundo parâmetro deve ser maior que o primeiro");
			e.printStackTrace();
		} catch (NumberFormatException e) {
			System.out.println("É Permitido somente números inteiros conforme o exemplo: 10");
			e.printStackTrace();
		}
	}

	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		
		if (parametroUm > parametroDois) {
			throw new ParametrosInvalidosException();
		}
		
		int contagem = parametroDois - parametroUm;
		for (int i = 1; i <= contagem; i++) {
			System.out.println("Imprimindo interação " + i);
		}
	}
}