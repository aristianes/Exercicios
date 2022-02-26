package com.aristiane.condicionais;

import java.util.Scanner;

public class Teste13 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Sexo? ");
		String primeiraPergunta = scan.nextLine();
		System.out.println("Altura? ");
		String segundaPergunta = scan.nextLine();
		System.out.println("Peso? ");
		String terceiraPergunta = scan.nextLine();
		
		double totalMulheres = 0;
		double pesoMulheres = 62.1 ;
		double alturaMulheres = 1.60;
		double totalHomens = 0;
		double pesoHomens = 72.7;
		double alturaHomens = 1.80  ;
		
		totalHomens = pesoHomens / (alturaHomens* alturaHomens);
	String sexo = "M";
	
		if( totalHomens <18.5 && sexo.equals("M") ) {
			System.out.println("Está abaixo do peso" + totalHomens);
		} else if(totalHomens >18.5 && totalHomens <=24.9 && sexo.equals("M")) {
			System.out.println("Peso normal " + totalHomens);
		}
		totalMulheres = pesoMulheres / (alturaMulheres* alturaMulheres);
		if( totalMulheres <18.5 && sexo.equals("f")) {
			System.out.println("Está abaixo do peso" + totalMulheres);
		} else if(totalMulheres >18.5 && totalMulheres <=24.9 && sexo.equals("F")) {
			System.out.println("Peso normal " + totalMulheres);
		}
		
		
	}

}
