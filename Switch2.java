package com.aristiane.condicionais;

import java.util.Scanner;

public class Switch2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um n�mero ");
		int numeroUm = scan.nextInt();
		System.out.println("Selecione a opera��o desejada ");
		System.out.println("1 -Multiplicar ");
		System.out.println("2 -Dividir ");
		System.out.println("3 -Subtrair ");
		System.out.println("4 -Somar ");
		int operacao = scan.nextInt();
		System.out.println("Digite outro n�mero ");
		
		int numeroDois = scan.nextInt();
		switch(operacao) {
		case 1:
			System.out.println("O resultado da multiplica��o �  " + numeroUm * numeroDois);
			break;
		
		case 2:
			System.out.println("O resultado da divis�o �  " + numeroUm / numeroDois);
			break;
		case 3:
			System.out.println("O resultado da subtra��o �  " + (numeroUm - numeroDois));
			break;
		case 4:
			System.out.println("O resultado da soma �  " + numeroUm + numeroDois);
			break;
		default:
			System.out.println("Opera��o n�o encontrada ");
		break;
		}


	}

}
