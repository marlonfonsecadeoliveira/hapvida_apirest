package com.hapvida.apirest.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.hapvida.apirest.models.Consulta.EspecieEnum;


@Entity
@Table(name = "TB_Animal")
public class Animal {
	
	private static final long serialVersionUID = 3141224274894890129L;
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id")
	private long id;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "especie")
	private EspecieEnum especie;
	
	@Column(name = "raca")
	private String raca;

	@Column(name = "dataNascimento")
	private String dataNascimento;
	
	
	@ManyToOne
	@JoinColumn(name = "idTutor", referencedColumnName = "id")
	@JsonIgnore
	private Tutor tutor;

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

	public EspecieEnum getEspecie() {
		return especie;
	}

	public void setEspecie(EspecieEnum especie) {
		this.especie = especie;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	
	
	

}
