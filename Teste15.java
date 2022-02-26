package com.aristiane.condicionais;

import java.util.Scanner;

public class Teste15 {

	public static void main(String[] args) {
		double alturaMan = 0;
		double alturaWoman = 0;
		double pesoWoman = 0;
		double pesoMan = 0;
		double idealM = 0;
		double idealH = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Qual seu sexo?");
		String primeiraPergunta = scan.nextLine();
		System.out.println("Qual sua altura? ");
		String segundaPergunta = scan.nextLine();
		System.out.println("Qual seu peso? ");
		String terceiraPergunta = scan.nextLine();
		
		idealM =  (pesoWoman / (alturaWoman * alturaWoman));
		if(idealM <= 18.8 && idealM >= 22.0) {
			System.out.println(" Seu peso ideal é " + idealM);
		}
	}

}
