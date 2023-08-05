package aula01;

import java.util.Scanner;

public class ExQuestao3 {

	public static void main(String[] args) {

		/*
		 * Uma parede em formato retangular, cuja altura é hp (altura da parede) e a
		 * largura lp (largura da parede) precisa ser coberta por azulejos também
		 * retangulares. O azulejo retangular tem dimensões ha (altura do azulejo) e la
		 * (largura do azulejo). Escreva um programa que leia as quatro medidas hp, lp,
		 * ha e la, calcule e imprima quanto azulejos com as medidas dadas são
		 * necessários para cobrir a parede dada.
		 * 
		 */
		
		
		// Criação do objeto Scanner para ler os valores do usuário
		Scanner scanner = new Scanner(System.in);

		// Pedir ao usuário as medidas da parede e dos azulejos
		System.out.print("Digite a altura da parede (hp): ");
		double hp = scanner.nextDouble();

		System.out.print("Digite a largura da parede (lp): ");
		double lp = scanner.nextDouble();

		System.out.print("Digite a altura do azulejo (ha): ");
		double ha = scanner.nextDouble();

		System.out.print("Digite a largura do azulejo (la): ");
		double la = scanner.nextDouble();

		// Cálculo da área da parede e do azulejo
		double areaParede = hp * lp;
		double areaAzulejo = ha * la;

		// Cálculo da quantidade de azulejos necessários
		// Math.ceil -> Arredondamento para cima, para retornar um valor inteiro.
		int quantidadeAzulejos = (int) Math.ceil(areaParede / areaAzulejo);

		// Exibição do resultado
		System.out.println("Quantidade de azulejos necessários: " + quantidadeAzulejos);

		// Fechamento do Scanner
		scanner.close();
	}

}
