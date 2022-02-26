package com.aristiane.condicionais;

public class Teste5 {

	/*
	 * Faça um programa que receba 1 nota e diga se ele foi aprovado, reprovado ou
	 * recuperação.
	 * 
	 * REGRA: Maior que passou direto; Entre 5 e 7 recuperação; abaixo de 5
	 * reprovado;
	 */
	public static void main(String[] args) {
		int nota =5;
		if (nota < 5) {
			System.out.println("Reprovado " + nota);

		} else if (nota >= 5 && nota <= 7) {
			System.out.println("Em recuperação " + nota);
		} else {

			System.out.println("Aprovado " + nota);
		}

	}
}