package com.aristiane.principal;

import java.util.List;

import com.aristiane.model.Cachorro;
import com.aristiane.service.CachorroService;

public class CachorroPrincipal {

	public static void main(String[] args) {
		CachorroService cachorroService = new CachorroService();
//		Cachorro raca = cachorroService.getCachorro();
//
//		cachorroService.printCachorro(raca);
		
		List<Cachorro> cachorros =  cachorroService.getCachorroList();
		cachorroService.printCaes(cachorros);

	}

}
