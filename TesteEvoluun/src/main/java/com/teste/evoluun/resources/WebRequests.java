package com.teste.evoluun.resources;

import java.util.List;

import com.teste.evoluun.models.Municipio;
import com.teste.evoluun.models.UF;

public class WebRequests {

	public List<UF> ConsultarEstados() {
		return new Controller().RequisitarUfs("https://servicodados.ibge.gov.br/api/v1/localidades/estados");
	}//ConsultarEstados
	
	public List<Municipio> ConsultarMunicipios(String ufId) {
		return new Controller().RequisitarMunicipios("https://servicodados.ibge.gov.br/api/v1/localidades/estados/"+ufId+"/municipios");
	}//ConsultarMunicipios
	
	public String ConsultarMunicipiosNome(String nome) {
		return new Controller().RequisitarMunicipios("https://servicodados.ibge.gov.br/api/v1/localidades/estados/municipios").stream().filter(x -> x.getNome().equalsIgnoreCase(nome)).findFirst().get().getId();                 
	}//ConsultarMunicipios
	
}//class WebRequests 
