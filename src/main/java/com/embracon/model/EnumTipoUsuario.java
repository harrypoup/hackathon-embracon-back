package com.embracon.model;

public enum EnumTipoUsuario {

	CONSORCIADO(0), CPF(1), CPF_INADIMPLENTE(2);

	public int valorCarta;

	EnumTipoUsuario(int valor) {
		valorCarta = valor;
	}

}
