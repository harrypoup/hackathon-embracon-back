package com.embracon.model;

public enum EnumTipoConsorcio {

	MOTO(0), CARRO(1), CASA(2), OUTROS(3);

	private final int tipoConsorcio;

	private EnumTipoConsorcio(int tipoConsorcio) {
		this.tipoConsorcio = tipoConsorcio;
	}

	public int getTipoConsorcio() {
		return tipoConsorcio;
	}

}
