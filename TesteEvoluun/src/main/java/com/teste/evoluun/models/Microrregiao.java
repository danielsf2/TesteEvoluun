package com.teste.evoluun.models;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//Classe Microregiao
@SuppressWarnings("serial")
@JsonIgnoreProperties(ignoreUnknown = true)
	public class Microrregiao implements Serializable{
		
		private String id;
		private String nome;
		private Mesorregiao mesorregiao;
		
		public Microrregiao() {
			this.mesorregiao = new Mesorregiao();
			this.id = this.nome = "";
		}
		
		public Microrregiao(String id, String nome, Mesorregiao mesorregiao) {
			this.id = id;
			this.nome = nome;
			this.mesorregiao = mesorregiao;
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

		public Mesorregiao getMesorregiao() {
			return mesorregiao;
		}

		public void setMesorregiao(Mesorregiao mesorregiao) {
			this.mesorregiao = mesorregiao;
		}

		@Override
		public String toString() {
			return "Microrregiao [id=" + this.id + ", nome=" + this.nome + ", mesorregiao=" + this.mesorregiao + "]";
		}
	
	}//class Microregiao
	
