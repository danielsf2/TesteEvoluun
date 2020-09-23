package com.teste.evoluun.models;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@SuppressWarnings("serial")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Regiao implements Serializable{
	
	private String id;
	private String sigla;
	private String nome;
	
	public Regiao() {
		this.id = this.sigla = this.nome = "";
	}

	public Regiao(String id, String sigla, String nome) {
		this.id = id;
		this.sigla = sigla;
		this.nome = nome;
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

	@Override
	public String toString() {
		return "Regiao [id=" + this.id + ", sigla=" + this.sigla + ", nome=" + this.nome + "]";
	}
	
	
}//class Regiao
