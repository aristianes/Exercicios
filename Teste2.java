package com.aristiane.condicionais;

public class Teste2 {
/**
	Ler 3 numeros inteiros, e dizer qual é o maior e o menor
	*/
	
	public static void main(String[] args) {
	int [] numero = {200, 10, 40, 60};
	int maior = 0;
	int menor = numero[0];
	
	for(int i= 0; i < numero.length; i++) {
		if(numero[i] > maior) {
			maior = numero[i];
			
		}
		if(numero[i] < menor) {
			menor = numero [i];
		}
	}
	System.out.println("Maior numero é " + maior);
	
	System.out.println("Menor numero é " + menor);
	}
}
