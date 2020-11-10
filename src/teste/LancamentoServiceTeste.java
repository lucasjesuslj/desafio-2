package com.itau.application.service;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.itau.application.model.Lancamento;
import com.itau.application.service.LancamentoService;

public class LancamentoServiceTeste {
	
	@Test
	public void testeListarLancamentos (){
		LancamentoService testeCatServ = new LancamentoService();
		 List<Lancamento> listaLancamento= testeCatServ.listarLancamentos();
		
		 List<Lancamento> listaLancamentoEmpty =  new ArrayList<>();
		assertNotEquals(listaLancamento, listaLancamentoEmpty);
	}
	
	@Test
	public void testeGetLancamentosByCategoria (){
		LancamentoService testeLancaServ = new LancamentoService();
		 List<Lancamento> listaLancamento= testeLancaServ.getLancamentosByCategoria(1);
		
		 List<Lancamento> listaLancamentoEmpty =  new ArrayList<>();
		assertNotEquals(listaLancamento, listaLancamentoEmpty);
	}
	
	@Test
	public void testeGetLancamentosByMes(){
		LancamentoService testeLancaServ = new LancamentoService();
		 List<Lancamento> listaLancamento= testeLancaServ.getLancamentosByMes(1);
		
		 List<Lancamento> listaLancamentoEmpty =  new ArrayList<>();
		assertNotEquals(listaLancamento, listaLancamentoEmpty);
	}
	
	@Test
	public void testeGetLancamentoById(){
		LancamentoService testeLancaServ = new LancamentoService();
		 Lancamento lancamento= testeLancaServ.getLancamentoById(1);
		 
		assertEquals("1", lancamento.getId());
	}

}
