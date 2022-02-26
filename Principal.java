package com.aristiane.principal;

import com.aristiane.model.Pessoa;
import com.aristiane.service.PessoaService;

public class Principal {

	public static void main(String[] args) {
		PessoaService pessoaService = new PessoaService();
		Pessoa teste = pessoaService.getPessoa();
		
	pessoaService.printPessoa(teste);
		

	}

}
