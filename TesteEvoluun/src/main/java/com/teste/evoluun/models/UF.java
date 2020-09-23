package com.teste.evoluun.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class UF {

	private String id;
	private String sigla;
	private String nome;
	private Regiao regiao;
	
	public UF() {
		regiao = new Regiao();
		this.id = this.nome = this.sigla = "";
	}

	public UF(String id, String sigla, String nome, Regiao regiao) {
		this.id = id;
		this.sigla = sigla;
		this.nome = nome;
		this.regiao = regiao;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Regiao getRegiao() {
		return regiao;
	}

	public void setRegiao(Regiao regiao) {
		this.regiao = regiao;
	}

	@Override
	public String toString() {
		return this.nome+" ("+this.sigla+")";
	}
	
	
}//class UF 
