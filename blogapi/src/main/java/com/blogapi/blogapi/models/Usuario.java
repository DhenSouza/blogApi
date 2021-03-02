package com.blogapi.blogapi.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "usuario")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@NotNull(message = "NOME não pode estar vazia")
	@Size(min = 2, max = 100, message = "Tamanho de NOME é minimo 5 e maximo 100")
	private String nome;

	@NotNull(message = "USUARIO não pode estar vazia")
	@Size(min = 2, max = 100, message = "Tamanho de USUARIO é minimo 5 e maximo 100")
	private String usuario;

	@NotNull(message = "SENHA não pode estar vazia")
	@Size(min = 5, max = 100, message = "Tamanho de SENHA é minimo 5 e maximo 100")
	private String senha;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

}
