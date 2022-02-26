package com.aristiane.condicionais;

import java.util.Scanner;

public class Switch3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Escolha as op��es  ");
		System.out.println("1 -Deseja calcular a m�dia ");
		System.out.println("2 -Mostrar os n�meros pares e �mpares ");
		System.out.println("3 -Digite uma palavra ");
		System.out.println("4 -Mostrar os n�meros pares <100 ");

		int operacao = scan.nextInt();

		switch (operacao) {

		case 1:
			System.out.println("Insira as notas ");
			System.out.println(" 1� bimestre  ");
			int notaUm = scan.nextInt();
			System.out.println(" 2� bimestre  ");
			int notaDois = scan.nextInt();
			System.out.println(" 3� bimestre  ");
			int notaTres = scan.nextInt();
			System.out.println(" 4� bimestre  ");
			int notaQuatro = scan.nextInt();

			int media = 0;

			media = (notaUm + notaDois + notaTres + notaQuatro) / 4;
			if (media >= 7) {
				System.out.println("Aprovado com nota " + media);
			} else if (media > 5 && media < 7) {
				System.out.println("Recupera��o com nota " + media);
			} else {
				System.out.println("Reprovado com nota " + media);
			}

			break;

		case 2:
			System.out.println("Digite o n�mero ");
			int numeroUm = scan.nextInt();

			if (numeroUm % 2 == 0) {
				System.out.println("Esse n�mero � par " + numeroUm);
			} else {
				System.out.println("Esse n�mero n�o � par " + numeroUm);
			}
			break;

		case 3:
			System.out.println("Digite uma palavra ");
			String palavra = scan.next();

			System.out.println("A palavra em maiusculo � " + palavra.toUpperCase());
			System.out.println("A palavra em minusculo � " + palavra.toLowerCase());

			break;

		case 4:
			for (int i = 0; i < 100; i++) {
				if (i % 2 == 0) {
					System.out.println("Numeros pares " + i);
				}
			}

			break;
		default:
			System.out.println("Voc� digitou uma op��o inv�lida ");
			break;
		}

	}

}
