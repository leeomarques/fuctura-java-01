package aula01;

import java.util.Scanner;

public class ExQuestao1 {

	public static void main(String[] args) {
		// Escreva um programa que, com base em uma temperatura em graus celsius, a
		// converta e
		// exiba em Kelvin (K), Réaumur (Re), Rankine (Ra) e Fahrenheit (F), seguindo as
		// fórmulas: F = C * 1.8 + 32; K = C + 273.15; Re = C * 0.8; Ra = C * 1.8 + 32 +
		// 459.67

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a temperatura em graus celsius: ");
		double celsius = sc.nextDouble();

		double fahrenheit = celsius * 1.8 + 32;
		double kelvin = celsius + 273.15;
		double reaumur = celsius * 0.8;
		double rankine = celsius * 1.8 + 32 + 459.67;

		System.out.println("A Conversão de Graus para Fahrenheit (F) -> " + fahrenheit);
		System.out.println("A Conversão de Graus para Kelvin (K) -> " + kelvin);
		System.out.println("A Conversão de Graus para Réaumur (Re) -> " + reaumur);
		System.out.println("A Conversão de Graus para Rankine (Ra) -> " + rankine);

	}
}
