package aula01;

import java.util.Scanner;

public class ExQuestao4 {

	public static void main(String[] args) {
		/*
		 * 4. Calcular e apresentar o valor do volume de uma lata de óleo, utilizando
		 * fórmula: V = 3.14159 * R * R * A, em que as variáveis: V, R e A representam
		 * respectivamente o volume, o raio e a altura. Vamos declarar as variáveis V, R
		 * e A como double e definir um valor qualquer para as variáveis de altura e de
		 * raio. Agora vamos escrever a fórmula, conforme dita no enunciado e, em
		 * seguida, exibir na tela uma mensagem contendo o resultado do volume
		 * encontrado.
		 */

		// Criação do objeto Scanner para ler os valores do usuário
		Scanner scanner = new Scanner(System.in);

		// Declaração das variáveis
		double V, R, A;

		// Pedir ao usuário o valor do raio e da altura da lata de óleo
		System.out.print("Digite o valor do raio da lata de óleo: ");
		R = scanner.nextDouble();

		System.out.print("Digite o valor da altura da lata de óleo: ");
		A = scanner.nextDouble();

		// Cálculo do volume da lata de óleo
		V = 3.14159 * R * R * A;

		// Exibição do resultado
		System.out.println("O volume da lata de óleo é: " + V);

		// Fechamento do Scanner
		scanner.close();
	}

}
