package com.aristiane.condicionais;
import java.util.Scanner;

public class Teste10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Telefonou para a vítima?");
		String primeiraPergunta = scan.nextLine();
		System.out.println("Esteve no local do crime? ");
		String segundaPergunta = scan.nextLine();
		System.out.println("Mora perto da vítima? ");
		String terceiraPergunta = scan.nextLine();
		System.out.println("Devia para a vítima? ");
		String quartaPergunta = scan.nextLine();
		System.out.println("Já trabalhou com a vítima? ");
		String quintaPergunta = scan.nextLine();

		String respostaUm = "sim";
		String respostaDois = "não";
		int count = 0;

		if (primeiraPergunta.equals(respostaUm)) {
			count++;
		}
		if (segundaPergunta.equals(respostaUm)) {
			count++;
		}
		if (terceiraPergunta.equals(respostaUm)) {
			count++;
		}
		if (quartaPergunta.equals(respostaUm)) {
			count++;
		}
		if (quintaPergunta.equals(respostaUm)) {
			count++;
		}
		
		System.out.println(count);
		
		if (count == 2) {
			System.out.println("Você é suspeita ");
		} else if (count >= 3 && count < 4) {
			System.out.println(" Cúmplice");
		} else if (count == 5) {
			System.out.println("Assassina");
		}

	}

}







