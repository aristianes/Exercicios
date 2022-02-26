package com.aristiane.condicionais;

import java.util.Scanner;

public class Switch3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Escolha as opções  ");
		System.out.println("1 -Deseja calcular a média ");
		System.out.println("2 -Mostrar os números pares e ímpares ");
		System.out.println("3 -Digite uma palavra ");
		System.out.println("4 -Mostrar os números pares <100 ");

		int operacao = scan.nextInt();

		switch (operacao) {

		case 1:
			System.out.println("Insira as notas ");
			System.out.println(" 1º bimestre  ");
			int notaUm = scan.nextInt();
			System.out.println(" 2º bimestre  ");
			int notaDois = scan.nextInt();
			System.out.println(" 3º bimestre  ");
			int notaTres = scan.nextInt();
			System.out.println(" 4º bimestre  ");
			int notaQuatro = scan.nextInt();

			int media = 0;

			media = (notaUm + notaDois + notaTres + notaQuatro) / 4;
			if (media >= 7) {
				System.out.println("Aprovado com nota " + media);
			} else if (media > 5 && media < 7) {
				System.out.println("Recuperação com nota " + media);
			} else {
				System.out.println("Reprovado com nota " + media);
			}

			break;

		case 2:
			System.out.println("Digite o número ");
			int numeroUm = scan.nextInt();

			if (numeroUm % 2 == 0) {
				System.out.println("Esse número é par " + numeroUm);
			} else {
				System.out.println("Esse número não é par " + numeroUm);
			}
			break;

		case 3:
			System.out.println("Digite uma palavra ");
			String palavra = scan.next();

			System.out.println("A palavra em maiusculo é " + palavra.toUpperCase());
			System.out.println("A palavra em minusculo é " + palavra.toLowerCase());

			break;

		case 4:
			for (int i = 0; i < 100; i++) {
				if (i % 2 == 0) {
					System.out.println("Numeros pares " + i);
				}
			}

			break;
		default:
			System.out.println("Você digitou uma opção inválida ");
			break;
		}

	}

}
