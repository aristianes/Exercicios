package com.aristiane.condicionais;

public class Teste11 {

	public static void main(String[] args) {

		double alcool = 4;
		double gasolina = 6;
		double qtdLitros = 20;
		double valorAlcool = 0;
		double valorGasolina = 0;
		boolean isGas = true;
		boolean isAlcool = false;
		
		

		if (qtdLitros <= 20 && isAlcool) {
			valorAlcool = alcool * qtdLitros;
			valorAlcool = (valorAlcool * 3 / 100) + valorAlcool;
			System.out.println(valorAlcool);
			

		}else if(qtdLitros > 20 && isAlcool) {
			valorAlcool = alcool * qtdLitros;
			valorAlcool = (valorAlcool * 5 / 100) + valorAlcool;
			System.out.println(valorAlcool);
		}
		
		if(qtdLitros <= 20 && isGas) {
			valorGasolina = gasolina * qtdLitros;
			valorGasolina = (valorGasolina *4 / 100) + valorGasolina;
			System.out.println(valorGasolina);
		}else if (qtdLitros > 20 && isGas) {
			valorGasolina = gasolina * qtdLitros;
			valorGasolina = (valorGasolina *6 / 100) + valorGasolina;
			System.out.println(valorGasolina);
		}

	}

}
