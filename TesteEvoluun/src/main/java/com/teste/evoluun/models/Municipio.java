package com.teste.evoluun.models;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@SuppressWarnings("serial")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Municipio implements Serializable{

	private String id;
	private String nome;
	private Microrregiao microrregiao;
	
	public Municipio() {
		this.microrregiao = new Microrregiao();
		this.nome = this.id = "";
	}

	public Municipio(String id, String nome, Microrregiao microregiao) {
		this.id = id;
		this.nome = nome;
		this.microrregiao = microregiao;
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

	public Microrregiao getMicroregiao() {
		return microrregiao;
	}

	public void setMicrorregiao(Microrregiao microrregiao) {
		this.microrregiao = microrregiao;
	}


	@Override
	public String toString() {
		return this.nome + " (" + this.getMicroregiao().getMesorregiao().getUF().getSigla() +")";
	} 

	
}//class Municipio 
