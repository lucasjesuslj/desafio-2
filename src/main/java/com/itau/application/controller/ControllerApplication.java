package com.itau.application.controller;

import java.util.List;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import com.itau.application.model.Categoria;
import com.itau.application.model.Lancamento;
import com.itau.application.service.CategoriaService;
import com.itau.application.service.LancamentoService;

@RestController
@EnableAutoConfiguration
public class ControllerApplication {
	
	    @ResponseStatus(HttpStatus.OK) 
	    @CrossOrigin(origins = "http://localhost:8080")
	    @RequestMapping(path = "/lancamentos",
        method = RequestMethod.GET, 
        produces = MediaType.APPLICATION_JSON_VALUE)
	    @ResponseBody
	    public List<Lancamento> lancamento() {
		 List<Lancamento> lancamentos = new LancamentoService().listarLancamentos();
		 return lancamentos;
	 }
	    
	    
	    @ResponseStatus(HttpStatus.OK) 
	    @CrossOrigin(origins = "http://localhost:8080")
	    @RequestMapping(path = "/categorias",
        method = RequestMethod.GET, 
        produces = MediaType.APPLICATION_JSON_VALUE)
	    @ResponseBody
	    public List<Categoria> categoria() {
		 List<Categoria> categorias = new CategoriaService().listarCategorias();
		 return categorias;
	 }
	    
	    @ResponseStatus(HttpStatus.OK) 
	    @CrossOrigin(origins = "http://localhost:8080")
	    @RequestMapping(path = "/lancamento/{id}")
	    @ResponseBody
	    public Lancamento getLancamentoById(@PathVariable("id") long id){
	   	 Lancamento lancamentoService = new LancamentoService().getLancamentoById(id);
		 return lancamentoService;
	    }
	    
	    @ResponseStatus(HttpStatus.OK)
	    @CrossOrigin(origins = "http://localhost:8080")
	    @RequestMapping(path = "/categoria/{id}")
	    @ResponseBody
	    public Categoria getCategoriaById(@PathVariable("id") long id){
	   	 Categoria categoriaService = new CategoriaService().getCategoriaById(id);
		 return categoriaService;
	    }
	    
	    @ResponseStatus(HttpStatus.OK)
	    @CrossOrigin(origins = "http://localhost:8080")
	    @RequestMapping(path = "/lancamentosPorCategoria/{categoria}")
	    @ResponseBody
	    public List<Lancamento> getLancamentosPorCategoria(@PathVariable("categoria") Integer categoria){
	   	 List<Lancamento> lancamentoService = new LancamentoService().getLancamentosByCategoria(categoria);
		 return lancamentoService;
	    }
	    
	    @ResponseStatus(HttpStatus.OK)
	    @CrossOrigin(origins = "http://localhost:8080")
	    @RequestMapping(path = "/lancamentosPorMes/{mes_lancamento}")
	    @ResponseBody
	    public List<Lancamento> getLancamentosPorMes(@PathVariable("mes_lancamento") Integer mes_lancamento){
	   	 List<Lancamento> lancamentoService = new LancamentoService().getLancamentosByMes(mes_lancamento);
		 return lancamentoService;
	    }
	    
	public static void main(String[] args) {
	        SpringApplication.run(ControllerApplication.class, args);
	    }
}

