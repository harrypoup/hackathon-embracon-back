package com.embracon.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "clientes")
public class Cliente {

	@Id
	private Long id;
	private String nome;
	private String cpf;
	private String email;
	private String idade;
	private String telefone;
	@OneToMany(mappedBy = "cliente")
	private List<Consorcio> consorcios;

	public Cliente(Long id, String nome, String cpf, String email, String idade, String telefone,
			List<Consorcio> consorcios) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.idade = idade;
		this.telefone = telefone;
		this.consorcios = consorcios;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public List<Consorcio> getConsorcios() {
		return consorcios;
	}

	public void setConsorcios(List<Consorcio> consorcios) {
		this.consorcios = consorcios;
	}

}
