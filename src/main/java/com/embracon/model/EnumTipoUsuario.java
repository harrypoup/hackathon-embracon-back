package com.embracon.model;

public enum EnumTipoUsuario {

	CONSORCIADO(0), CPF(1), CPF_INADIMPLENTE(2);

	private final int tipoUsuario;

	private EnumTipoUsuario(int tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	public int getTipoUsuario() {
		return tipoUsuario;
	}

}
