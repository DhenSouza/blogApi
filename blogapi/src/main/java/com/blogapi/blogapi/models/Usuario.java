package com.blogapi.blogapi.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "usuario")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@NotNull(message = "NOME não pode estar vazia")
	@Size(min = 2, max = 100, message = "Tamanho de NOME é minimo 2 e maximo 100")
	private String nome;

	@NotNull(message = "USUARIO não pode estar vazia")
	@Size(min = 2, max = 100, message = "Tamanho de USUARIO é minimo 2 e maximo 100")
	private String usuario;

	@NotNull(message = "SENHA não pode estar vazia")
	@Size(min = 5, max = 100, message = "Tamanho de SENHA é minimo 5 e maximo 100")
	private String senha;

	private String foto;

	private String tipo;

	@OneToMany(mappedBy = "usuario", cascade = CascadeType.REMOVE)
	@JsonIgnoreProperties("usuario")
	private List<Postagens> postagem;

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

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public List<Postagens> getPostagem() {
		return postagem;
	}

	public void setPostagem(List<Postagens> postagem) {
		this.postagem = postagem;
	}

}
