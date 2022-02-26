package com.aristiane.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.aristiane.model.Pessoa;

public class PessoaService {

	public Pessoa getPessoa() {
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Aris");
		pessoa.setNomeMae("Maria");
		pessoa.setNomePai("Edval");
		pessoa.setDataNascimento(new Date());
		
		return pessoa;
	}
	
	public void printPessoa(Pessoa pessoa) {
		System.out.println(pessoa.getNome());
		System.out.println(pessoa.getNomeMae());
	}
	
	public List<Pessoa> getPessoas(){
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Aris");
		pessoa.setNomeMae("Maria");
		pessoa.setNomePai("Edval");
		pessoa.setDataNascimento(new Date());
		
		pessoas.add(pessoa);
		
		pessoa = new Pessoa();
		
		pessoa.setNome("Renato");
		pessoa.setNomeMae("Divanira");
		pessoa.setNomePai("Antonio");
		pessoa.setDataNascimento(new Date());
		
		pessoas.add(pessoa);
		
		
		return pessoas;
		
	}
	public void printPessoas(List<Pessoa> pessoal) {
		
		for (Pessoa pessoa : pessoal) {
			System.out.println(pessoa.getNome());
			System.out.println(pessoa.getNomeMae());
			System.out.println(pessoa.getNomePai());
			System.out.println(pessoa.getDataNascimento());
			
		}
		
		pessoal.forEach(gauderio ->{
			System.out.println(gauderio.getNome());
			System.out.println(gauderio.getNomeMae());
			System.out.println(gauderio.getNomePai());
			System.out.println(gauderio.getDataNascimento());
		});
	}
}
