package com.aristiane.condicionais;

public class Teste8 {
	/**
	 * 3- Fa�a um programa que verifique (usando if e else) se uma letra digitada �
	 * �F� ou �M�. Conforme a letra escrever: F � Feminino, M- Masculino, Sexo
	 * inv�lido.
	 * 
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		String sexo = "M";

		if (sexo.equals("M")) {
			System.out.println("Sexo MASCULINO");
		}
		else if (sexo.equals("F")) {
			System.out.println("Sexo feminino");

		}else {
			System.out.println("Sexo invalido ");
		}

	}
}
