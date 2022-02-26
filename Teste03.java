package com.aristiane.condicionais;

public class Teste03 {
	/*
	 * Pegar 3 numeros e colocar em ordem crescente e decrescente
	 */
	public static void main(String[] args) {

		int vlr1 = 100;
		int vlr2 = 15;
		int vlr3 = 400;
		int maior = 0;
		int segundoMaior = 0;
		int menor = 0;

		if (vlr1 > vlr2) {
			maior = vlr1;

		} else {
			maior = vlr2;
		}
		if (maior < vlr3) {
			maior = vlr3;
		}

		if (vlr1 < vlr2) {
			menor = vlr1;
		} else {
			menor = vlr2;
		}
		if (menor > vlr3) {
			menor = vlr3;
		}

		if (vlr1 != maior && vlr1 != menor) {
			segundoMaior = vlr1;

		} else if (vlr2 != maior && vlr2 != menor) {
			segundoMaior = vlr2;
		} else if (vlr3 != maior && vlr3 != menor) {
			segundoMaior = vlr3;
		}
		System.out.println(" O maior valor é " + maior);
		System.out.println("O valor do meio é " + segundoMaior);
		System.out.println("O menor valor é " + menor);
	}

}
