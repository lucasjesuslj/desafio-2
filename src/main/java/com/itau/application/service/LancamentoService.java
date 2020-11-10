package com.itau.application.service;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.itau.application.model.Lancamento;



public class LancamentoService {

	public List<Lancamento> listarLancamentos(){

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<List<Lancamento>> rateResponse =
                restTemplate.exchange("https://desafio-it-server.herokuapp.com/lancamentos",HttpMethod.GET, null, new ParameterizedTypeReference<List<Lancamento>>() {});
		
		return  rateResponse.getBody().stream().sorted(Comparator.comparingInt(Lancamento::getMes_lancamento)).collect(Collectors.toList());

	}
	
	public Lancamento getLancamentoById(long id) {
		Predicate <Lancamento> byId = p -> p.getId().equals(id);
		return filterLancamentos (byId);
	}
	
	public Lancamento filterLancamentos (Predicate <Lancamento> strategy) {
		return listarLancamentos().stream().filter(strategy).findFirst().orElse(null);
		
	}
	
	
	public List<Lancamento> getLancamentosByCategoria(Integer categoria){
		
		return  listarLancamentos().stream().filter(lancamento -> lancamento.getCategoria() == categoria).collect(Collectors.toList());

	}
	
	public List<Lancamento> getLancamentosByMes(Integer mes_lancamento){
		
		return  listarLancamentos().stream().filter(lancamento -> lancamento.getMes_lancamento() == mes_lancamento).collect(Collectors.toList());

	}
	
}
