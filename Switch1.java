package com.aristiane.condicionais;

import java.util.Scanner;

public class Switch1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Selecione a opção desejada ");
		System.out.println("1 -Cachorro ");
		System.out.println("2 -Gato ");
		System.out.println("3 -Galinha ");
		System.out.println("4 -Peixe ");
		System.out.println("Qual é a sua opçao ");
		
		int opcao = scan.nextInt();
		switch(opcao) {
		case 1:
			System.out.println("Voce gosta de cachorro ");
			break;
		case 2:
			System.out.println("Você gosta de gato ");
			break;
		case 3:
			System.out.println("Você gosta de galinha ");
			break;
		case 4:
			System.out.println("Você gosta de peixe");
			break;
			default:
				System.out.println("Você digitou a opção invalida");
				break;
		}
	}

}
