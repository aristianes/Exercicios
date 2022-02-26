package com.aristiane.condicionais;

public class Vetor2 {

	public static void main(String[] args) {
		int[] numeros = { 2, 8, 10, 12, 18, 26, 17, 75, 49, 51, 4 };
		int soma = 0;

		for (int i = 0; i < numeros.length; i++) {

			soma = soma + numeros[i];

		}
		System.out.println(soma / numeros.length);
	}

}
