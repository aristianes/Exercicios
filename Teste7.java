package com.aristiane.condicionais;

public class Teste7 {
	/**
	 * Fazer um programa que leia um array com 4 posições com valores, e acrescente
	 * o dobro do valor em casa posição
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		int[] singular = { 2, 4, 6, 8 };
		int[] twice = new int [4];

		for (int i = 0; i < singular.length; i++) {

			twice[i] = singular[i] * 2;

		}

		for (int i = 0; i < twice.length; i++) {
			System.out.println(twice[i]);
		}

	}
}
