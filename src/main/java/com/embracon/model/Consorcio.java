package com.embracon.model;

import java.util.List;

public class Consorcio {

	private Long id;
	private String descricao;
	private EnumTipoConsorcio tipoConsorcio;
	private List<Parcela> parcelas;

	public Consorcio(Long id, String descricao, EnumTipoConsorcio tipoConsorcio, List<Parcela> parcelas) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.tipoConsorcio = tipoConsorcio;
		this.parcelas = parcelas;
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

	public EnumTipoConsorcio getTipoConsorcio() {
		return tipoConsorcio;
	}

	public void setTipoConsorcio(EnumTipoConsorcio tipoConsorcio) {
		this.tipoConsorcio = tipoConsorcio;
	}

	public List<Parcela> getParcelas() {
		return parcelas;
	}

	public void setParcelas(List<Parcela> parcelas) {
		this.parcelas = parcelas;
	}

}
