package com.aristiane.condicionais;

public class Teste6 {

	/*
	 * Crie um programa que leia 1 numero de 1 a 7, e de acordo com esse 
	 * numero diga o dia da semana
	 */
	public static void main(String[] args) {
		int [] semana = {1, 2, 3, 4, 5, 6, 7};
		for(int i= 0; i < semana.length; i++) {
			if(semana [i] == 1) {
				System.out.println("Hoje é domingo " + semana [i]);
			}
			if( semana[i] == 2) {
				System.out.println("Hoje é segunda-feira " + semana [i]);
			}
			if( semana[i] == 3) {
				System.out.println("Hoje é terça-feira " + semana [i]);
			}
			if( semana[i] == 4) {
				System.out.println("Hoje é quarta-feira " + semana [i]);
			}
			if( semana[i] == 5) {
				System.out.println("Hoje é quinta-feira " + semana [i]);
			}
			if( semana[i] == 6) {
				System.out.println("Hoje é sexta-feira " + semana [i]);
			}
			if( semana[i] == 7) {
				System.out.println("Hoje é sabado " + semana [i]);
			}
		}
	}

}
