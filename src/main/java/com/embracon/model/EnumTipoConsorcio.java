package com.embracon.model;

public enum EnumTipoConsorcio {

	MOTO(0), CARRO(1), CASA(2), OUTROS(3);

	public int tipoConsorcio;

	EnumTipoConsorcio(int valor) {
		tipoConsorcio = valor;
	}

}
