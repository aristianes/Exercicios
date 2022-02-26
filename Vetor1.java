package com.aristiane.condicionais;

public class Vetor1 {

	public static void main(String[] args) {

		int[] numeros = { 2, 8, 10, 12, 18, 26, 17, 75, 49, 51 };

		int maior = 0;
		int menor = 0;
		int pares = 0;
		int impar = 0;
		

		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] > maior) {
				maior = numeros[i];

			}
			if (numeros[i] < menor) {
				menor = numeros[i];
			}
			if (numeros [i] %2 == 0) {
				System.out.println("Esse numero é par " + numeros[i]);
			}else {
				System.out.println("Esse numero é impar" + numeros[i]);
			}
		}
		System.out.println("Maior numero é " + maior);
		
		System.out.println("Menor numero é " + menor);
		
		
		
		
	}

}