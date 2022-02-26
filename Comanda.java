package com.aristiane.cafeteria.model;

import java.util.List;

public class Comanda {
	
	private int mesa;
	private Funcionario funcionario;
	private List<Acompanhamento> acompanhamentos;
	private List<Bebida> bebidas;
	public int getMesa() {
		return mesa;
	}
	public void setMesa(int mesa) {
		this.mesa = mesa;
	}
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	public List<Acompanhamento> getAcompanhamentos() {
		return acompanhamentos;
	}
	public void setAcompanhamentos(List<Acompanhamento> acompanhamentos) {
		this.acompanhamentos = acompanhamentos;
	}
	public List<Bebida> getBebidas() {
		return bebidas;
	}
	public void setBebidas(List<Bebida> bebidas) {
		this.bebidas = bebidas;
	}
	

}
