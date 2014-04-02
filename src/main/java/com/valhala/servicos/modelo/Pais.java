package com.valhala.servicos.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Classe que mapeia a entidade de pais.
 * @author Bruno Luiz Viana
 * @version 1.0
 * @since 01/04/2014
 *
 */
@Entity @Table(name = "tb_pais")
@XmlRootElement
public class Pais implements Serializable {
	
	private static final long serialVersionUID = 1491248380279701630L;
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_pais")
	private Short id;
	@Column(name = "nome_pais", nullable = false, length = 70, unique = true)
	private String nome;
	
	public Pais() {
		super();
	}

	public Pais(String nome) {
		super();
		this.nome = nome;
	}

	public Pais(Short id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
	}

	public Short getId() {
		return id;
	}

	public void setId(Short id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pais other = (Pais) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return String.format("Pais [id=%s, nome=%s]", id, nome);
	} // fim do método toString
	
} // fim da classe Pais