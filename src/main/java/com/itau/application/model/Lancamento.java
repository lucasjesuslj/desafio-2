package com.itau.application.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Lancamento {

	private Long id;
	private Double valor;
	private String origem;
	private Integer categoria;
	private Integer mes_lancamento;
	

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public String getOrigem() {
		return origem;
	}
	public void setOrigem(String origem) {
		this.origem = origem;
	}
	public Integer getCategoria() {
		return categoria;
	}
	public void setCategoria(Integer categoria) {
		this.categoria = categoria;
	}
	public Integer getMes_lancamento() {
		return mes_lancamento;
	}
	public void setMes_lancamento(Integer mes_lancamento) {
		this.mes_lancamento = mes_lancamento;
	}
	@Override
	public String toString() {
		return "Lancamento [id=" + id + ", valor=" + valor + ", origem=" + origem + ", categoria=" + categoria
				+ ", mes_lancamento=" + mes_lancamento + "]";
	}
	public Lancamento findById(String personId) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}

