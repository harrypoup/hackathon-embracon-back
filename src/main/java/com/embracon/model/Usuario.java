package com.embracon.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "usuarios")
public class Usuario {

	@Id
	private Long id;
	private String usuario;
	private String senha;
	@Enumerated(EnumType.STRING)
	private EnumTipoUsuario tipo;
	@OneToOne
	@JsonIgnore
	private Cliente cliente;

	public Usuario(Long id, String usuario, String senha, EnumTipoUsuario tipo, Cliente cliente) {
		super();
		this.id = id;
		this.usuario = usuario;
		this.senha = senha;
		this.tipo = tipo;
		this.cliente = cliente;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public EnumTipoUsuario getTipo() {
		return tipo;
	}

	public void setTipo(EnumTipoUsuario tipo) {
		this.tipo = tipo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
