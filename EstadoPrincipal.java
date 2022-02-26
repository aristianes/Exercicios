package com.aristiane.principal;

import java.util.List;


import com.aristiane.model.Estado;
import com.aristiane.service.EstadoService;



public class EstadoPrincipal {

	public static void main (String[] args) {
	EstadoService estadoService = new EstadoService();
	
	List<Estado> estados =  estadoService.getEstadoList();
	estadoService.printEstado(estados);
	
}		

	

}


