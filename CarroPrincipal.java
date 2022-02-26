package com.aristiane.principal;

import com.aristiane.model.Carro;

import com.aristiane.service.CarroService;


public class CarroPrincipal {

	public static void main(String[] args) {
		CarroService carroService = new CarroService();
		Carro carros = carroService.getCarro();
		
	carroService.printCarro(carros);
		

	}
}
