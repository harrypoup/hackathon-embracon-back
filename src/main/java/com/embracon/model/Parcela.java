package com.embracon.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "parcela")
public class Parcela {

	@Id
	private Long id;
	private boolean status;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CONSORCIO_ID")
	private Consorcio consorcio;

	public Parcela() { }
			
	public Parcela(Long id, boolean status) {
		super();
		this.id = id;
		this.status = status;
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
