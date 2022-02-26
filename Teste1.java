package com.aristiane.condicionais;

public class Teste1 {
	/**
	 * Programa para calcular 4 notas de um aluno e dizer se ele foi aprovado ou
	 * reprovado.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		int nota1 = 90;
		int nota2 = 90;
		int nota3 = 20;
		int nota4 = 40;
		int resultado = 0;
		
		resultado = (nota1 + nota2 + nota3 + nota4)/4;
		System.out.println("Nota " + resultado);
		if(resultado > 80) {
			System.out.println("Aprovado "+ resultado);
		}else {
			System.out.println(" Reprovado " + resultado);
		}
	}

}
