package aula01;

import java.util.Scanner;

public class ExQuestao2 {

	public static void main(String[] args) {
		// 2. Criar um programa que calcule a média de salários de uma empresa,
		// pedindo ao usuário a quantidade de funcionários e os salários, e devolvendo a
		// média salarial.

		// Criação do objeto Scanner para ler os valores do usuário
		Scanner scanner = new Scanner(System.in);

		// Pedir ao usuário a quantidade de funcionários
		System.out.print("Digite a quantidade de funcionários: ");
		int quantidadeFuncionarios = scanner.nextInt();

		// Validar se a quantidade de funcionários é maior que zero
		if (quantidadeFuncionarios <= 0) {
			System.out.println("Quantidade inválida de funcionários.");
			scanner.close();
			return;
		}

		// Pedir ao usuário os salários e calcular a soma
		double somaSalarios = 0;
		for (int i = 1; i <= quantidadeFuncionarios; i++) {
			System.out.print("Digite o salário do funcionário " + i + ": ");
			double salario = scanner.nextDouble();
			somaSalarios += salario;
		}

		// Cálculo da média salarial
		double mediaSalarial = somaSalarios / quantidadeFuncionarios;

		// Exibição do resultado
		System.out.println("A média salarial da empresa é: " + mediaSalarial);

		// Fechamento do Scanner
		scanner.close();

	}

}
