package com.aristiane.condicionais;

import java.util.Scanner;

public class TesteNovo2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um n�mero ");
		int digiteNumeroUm = scan.nextInt();
		System.out.println("Digite mais um n�mero ");
		int digiteNumeroDois = scan.nextInt();

		int[] numeroUm = new int[1];
		int[] numeroDois = new int[1];

		if (digiteNumeroUm % 2 == 0) {
			System.out.println("Par " + digiteNumeroUm);
			numeroUm[0] = digiteNumeroUm;

			if (digiteNumeroDois % 2 != 0) {
				System.out.println("�mpar " + digiteNumeroDois);
				numeroDois[0] = digiteNumeroDois;
			}
		}

	}

}
