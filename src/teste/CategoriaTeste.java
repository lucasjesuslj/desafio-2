package com.itau.application.testes;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.itau.application.model.Categoria;

public class CategoriaTeste {
	
	@Test
	public void testeGetNome (){
		Categoria testeCat = new Categoria();
		testeCat.setId((long) 1);
		testeCat.setNome("Lala");
		String output = testeCat.getNome();
		assertEquals("Lala", output);
	}

}
