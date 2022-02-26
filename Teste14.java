package com.aristiane.condicionais;

import java.util.Scanner;

public class Teste14 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {

			System.out.println("Digite um numero: ");
			int valor = 0;
			int x = teclado.nextInt();
			

			for (int j = 1; j < x; j++) {

				if (x % j == 0)
					valor += j;

			}
			if (valor == x) {
				System.out.println("Numero perfeito");
				
			}else {
				System.out.println("Não é numero perfeito");
			}
				
				

		}
	}
}
