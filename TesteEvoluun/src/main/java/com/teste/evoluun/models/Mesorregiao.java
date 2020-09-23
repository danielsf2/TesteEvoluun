package com.teste.evoluun.models;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@SuppressWarnings("serial")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Mesorregiao implements Serializable{

	private String id;
	private String nome;
	private UF UF;
	
	public Mesorregiao() {
		this.UF = new UF();
		this.id = this.nome;
	}

	public Mesorregiao(String id, String nome, UF uf) {
		this.id = id;
		this.nome = nome;
		this.UF = uf;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public UF getUF() {
		return UF;
	}

	public void setUF(UF uf) {
		this.UF = uf;
	}

	@Override
	public String toString() {
		return "Mesorregiao [id=" + id + ", nome=" + nome + ", UF=" + UF + "]";
	}

}//class Mesorregiao 
