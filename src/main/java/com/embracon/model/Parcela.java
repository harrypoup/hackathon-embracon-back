package com.embracon.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "parcela")
public class Parcela {

	@Id
	private Long id;
	private boolean status;

	@ManyToOne(cascade = CascadeType.ALL)
	private Consorcio consorcio;

	public Parcela(Long id, boolean status) {
		this.id = id;
		this.status = status;
	}

	public Parcela() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public Consorcio getConsorcio() {
		return consorcio;
	}

	public void setConsorcio(Consorcio consorcio) {
		this.consorcio = consorcio;
	}

}
