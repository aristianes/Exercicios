package com.aristiane.service;

import java.util.ArrayList;
import java.util.List;


import com.aristiane.model.Estado;



public class EstadoService {

	public Estado getEstado() {
		Estado estado = new Estado();
		estado.setCidade("São José dos Pinhais");
		estado.setBairro("Centro");
		estado.setRua("Doutor Manoel Ribeiro de Campos");
		estado.setCep("83005310");
		
		return estado;
	}

	public void printEstado(Estado teste) {
		System.out.println(teste.getCidade());
		System.out.println(teste.getBairro());
		System.out.println(teste.getRua());
		System.out.println(teste.getCep());
		
		
	}

	public List<Estado> getEstadoList() {
		
		List<Estado> estados =  new ArrayList<Estado>();
		Estado estado = new Estado();
		estado.setCidade("São José dos Pinhais");
		estado.setBairro("São Pedro");
		estado.setRua("Antonio Sbrissia");
		estado.setCep("83005000");
		estados.add(estado);
		
		estado = new Estado();
		estado.setCidade("São José dos Pinhais");
		estado.setBairro("Centro");
		estado.setRua("Rua Voluntarios da Patria");
		estado.setCep("83005540");
		
		estados.add(estado);
		return estados;
	}

	public void printEstado(List<Estado> estados) {
		estados.forEach(estado ->{
			System.out.println("Imprimindo do for  java 8 pra cima");
			System.out.println(estado.getCidade());
			System.out.println(estado.getBairro());
			System.out.println(estado.getRua());
			System.out.println(estado.getCep());
		});
	}
}
