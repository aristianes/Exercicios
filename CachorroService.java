package com.aristiane.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.aristiane.model.Cachorro;
import com.aristiane.model.Pessoa;

public class CachorroService {

	public Cachorro getCachorro() {
		Cachorro cachorro = new Cachorro();
		cachorro.setNomeRaca("Yorkshire");
		cachorro.setPelagem("Azul aço");
		
		
		return cachorro;
	}

	public void printCachorro(Cachorro raca) {
		System.out.println(raca.getNomeRaca());
		System.out.println(raca.getPelagem());
		
	}
	
	public List<Cachorro> getCachorroList(){
		List<Cachorro> cachorros =  new ArrayList<Cachorro>();
		
		Cachorro cachorro = new Cachorro();
		cachorro.setNomeRaca("Yorkshire");
		cachorro.setPelagem("Azul aço");
		
		cachorros.add(cachorro);
		
		cachorro = new Cachorro();
		cachorro.setNomeRaca("Rusky");
		cachorro.setPelagem("Branco");
		
		cachorros.add(cachorro);
		return cachorros;
	}
	
	public void printCaes(List<Cachorro> caes) {
		
		//for numero 2
		
		for (Cachorro cachorro : caes) {
			System.out.println("IMprimendo do foreach");
			System.out.println(cachorro.getNomeRaca());
			System.out.println(cachorro.getPelagem());
		}
		
		caes.forEach(cao ->{
			System.out.println("IMprimendo do for  java 8 pra cima");
			System.out.println(cao.getNomeRaca());
			System.out.println(cao.getPelagem());
		});
	}

}
