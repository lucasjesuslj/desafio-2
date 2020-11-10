package com.itau.application.testes;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.itau.application.model.Categoria;
import com.itau.application.service.CategoriaService;

public class CategoriaServiceTeste {
	
	@Test
	public void testeListarCategorias (){
		CategoriaService testeCatServ = new CategoriaService();
		 List<Categoria> listaCategoria= testeCatServ.listarCategorias();
		
		 List<Categoria> listaCategoriaEmpty =  new ArrayList<>();
		assertNotEquals(listaCategoria, listaCategoriaEmpty);
	}

}
