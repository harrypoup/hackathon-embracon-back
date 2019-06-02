package com.embracon.model;

import java.math.BigDecimal;

public class Sonho {

	private Long id;
	private String descricao;
	private BigDecimal valorSonho;

	public Sonho(Long id, String descricao, BigDecimal valorSonho) {
		this.id = id;
		this.descricao = descricao;
		this.valorSonho = valorSonho;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getValorSonho() {
		return valorSonho;
	}

	public void setValorSonho(BigDecimal valorSonho) {
		this.valorSonho = valorSonho;
	}

}
