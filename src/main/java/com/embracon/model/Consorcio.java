package com.embracon.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "consorcio")
public class Consorcio {

	@Id
	private Long id;
	private String descricao;
	@Enumerated(EnumType.STRING)
	private EnumTipoConsorcio tipoConsorcio;
	
	@OneToMany(mappedBy = "consorcio")
	private List<Parcela> parcelas;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CLIENTE_ID")
	private Cliente cliente;

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
