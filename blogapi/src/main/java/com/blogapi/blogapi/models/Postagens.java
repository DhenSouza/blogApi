package com.blogapi.blogapi.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "postagens")
public class Postagens {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@NotNull(message = "O Campo Titulo não pode estar vazio")
	@Size(min = 2, max = 100, message = "O minimo de caracters é 2 e maximo 100")
	private String titulo;

	@NotNull(message = "O Campo TEXTO não pode estar vazio")
	@Size(min = 2, max = 100, message = "O minimo de caracters é 2 e maximo 100")
	private String texto;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

}
