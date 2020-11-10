package com.itau.application.service;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.itau.application.model.Categoria;



public class CategoriaService {

	public List<Categoria> listarCategorias(){
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<List<Categoria>> rateResponse =
                restTemplate.exchange("https://desafio-it-server.herokuapp.com/categorias",
                        HttpMethod.GET, null, new ParameterizedTypeReference<List<Categoria>>() {
                        });
		return  rateResponse.getBody();
	}
	
	
	public Categoria getCategoriaById(long id) {
		Predicate <Categoria> byId = p -> p.getId().equals(id);
		return filterCategorias(byId);
	}
	
	public Categoria filterCategorias (Predicate <Categoria> strategy) {
		return listarCategorias().stream().filter(strategy).findFirst().orElse(null);
		
	}
}
