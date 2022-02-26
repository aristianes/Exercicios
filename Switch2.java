package com.aristiane.condicionais;

import java.util.Scanner;

public class Switch2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um número ");
		int numeroUm = scan.nextInt();
		System.out.println("Selecione a operação desejada ");
		System.out.println("1 -Multiplicar ");
		System.out.println("2 -Dividir ");
		System.out.println("3 -Subtrair ");
		System.out.println("4 -Somar ");
		int operacao = scan.nextInt();
		System.out.println("Digite outro número ");
		
		int numeroDois = scan.nextInt();
		switch(operacao) {
		case 1:
			System.out.println("O resultado da multiplicação é  " + numeroUm * numeroDois);
			break;
		
		case 2:
			System.out.println("O resultado da divisão é  " + numeroUm / numeroDois);
			break;
		case 3:
			System.out.println("O resultado da subtração é  " + (numeroUm - numeroDois));
			break;
		case 4:
			System.out.println("O resultado da soma é  " + numeroUm + numeroDois);
			break;
		default:
			System.out.println("Operação não encontrada ");
		break;
		}


	}

}
