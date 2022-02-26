package com.aristiane.service;

import java.util.Date;

import com.aristiane.model.Carro;


public class CarroService {

	public Carro getCarro() {
		Carro carro = new Carro();
		carro.setMarca("Chery");
		carro.setFabrica("Caoa");
		carro.setModelo("Tiggo");
		carro.setCor("Preto metálico");
		carro.setAno(2021);

		return carro;
	}
	public void printCarro(Carro carro) {
		System.out.println(carro.getMarca());
		System.out.println(carro.getFabrica());
		System.out.println(carro.getModelo());
		System.out.println(carro.getCor());
		
	}
}
