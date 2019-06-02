package com.embracon.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "consorcio")
public class Consorcio {

	@Id
	private Long id;
	private String descricao;

	@Enumerated(EnumType.ORDINAL)
	private EnumTipoConsorcio tipoConsorcio;

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "consorcio_id")
	private List<Parcela> parcelas;

	public Consorcio(Long id, String descricao, EnumTipoConsorcio tipoConsorcio) {
		this.id = id;
		this.descricao = descricao;
		this.tipoConsorcio = tipoConsorcio;
	}

	public Consorcio() {

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
