package com.aristiane.condicionais;

public class Teste9 {
/**
 * 8- Fa�a um programa que pergunte o pre�o de tr�s produtos e informe qual
	 * produto voc� deve comprar, sabendo que a decis�o � sempre o mais barato.
	 * 
 * @param args
 */
	public static void main(String[] args) {
		int cenoura = 40;
		int batata = 6;
		int tomate = 10;
		
		if(cenoura >batata) {
		System.out.println("Valor da batata " + batata);

	}
		else if(batata > tomate) {
		System.out.println("Valor do tomate " + tomate);
	}else {
		System.out.println("Compra cenoura que est� mais barato " + cenoura);
	}
	

}
}