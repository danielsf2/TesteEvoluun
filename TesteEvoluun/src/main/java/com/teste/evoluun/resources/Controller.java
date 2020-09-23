package com.teste.evoluun.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.teste.evoluun.models.Municipio;
import com.teste.evoluun.models.UF;

@RestController
public class Controller {
	
	private RestTemplate restTemplate;
	
	public Controller() {
		restTemplate = new RestTemplate();
	}//Controller
	
	public  List<Municipio> RequisitarMunicipios(String Url) {
		ResponseEntity<Municipio[]> response = restTemplate.getForEntity(Url, Municipio[].class);
		return Arrays.asList(response.getBody());
	}//Requisitar
	
		public List<UF> RequisitarUfs(String Url){
		ResponseEntity<UF[]> response = restTemplate.getForEntity(Url, UF[].class);
		return Arrays.asList(response.getBody());
	}//RequisitarUfs
	
	/**
	 * Recebe uma Lista de objetos contendo todos os dados oruindos da API de consulta. Converte os dados em uma Strinf json e retorna o valor.
	 * 
	 * @param List<Object> 
	 * @return Json String
	 */
	public String ConverteListJson(List<Object> dados) {
		StringBuilder json = new StringBuilder();
		
		ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
		
		dados.stream().forEach(x -> {
			try {
				json.append(ow.writeValueAsString(x));
			} catch (JsonProcessingException e) {
				e.printStackTrace();
			}
		});
		return json.toString();
	}
	
}//class Controller 
