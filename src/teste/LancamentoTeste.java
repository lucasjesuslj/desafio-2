package com.itau.application.testes;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.itau.application.model.Lancamento;

public class LancamentoTeste {
	
	@Test
	public void testeGetMes (){
		Lancamento testeLancamento= new Lancamento();
		testeLancamento.setId((long) 1);
		testeLancamento.setCategoria(1);
		testeLancamento.setMes_lancamento(1);
		testeLancamento.setValor(10.5);
		testeLancamento.setOrigem("Panasonic");
		int output = testeLancamento.getMes_lancamento();
		assertEquals(1, output);
	}

}
