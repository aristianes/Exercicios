package com.aristiane.condicionais;

public class Teste12 {

	public static void main(String[] args) {
		double produto = 170;
		double total1 = 0;
		double total2 = 0;
		double total3 = 0;
		double total4 = 0;
		double moeda1 = 1.00;
		double moeda2 = 0.50;
		double moeda3 = 0.25;
		double moeda4 = 0.10;
		double geral = 0;

		total1 = moeda1 * 37;
		total2 = moeda2 *30;
		total3 = moeda3 * 60;
		total4 = moeda4 * 30;

		geral = total1 + total2 + total3 + total4;

		if (geral < produto) {
			System.out.println(" Teremos que juntar mais dinheiro " + geral);
		} else if (geral> produto){
			geral = total1 + total2 + total3 + total4;
			
			System.out.println("Vai sobrar dinheiro " + geral);
		}else {
			System.out.println("Deu no laço " + geral);
		}

	}

}
