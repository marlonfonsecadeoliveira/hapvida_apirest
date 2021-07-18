package com.hapvida.apirest.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

//Desenvolvido por Marlon fonseca de oliveira 17/07/2021

@Entity
@Table(name = "TB_Consulta")


public class Consulta {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id")
	private long id;

	public enum StatusEnum { 
		ATIVO, 
		INATIVO, 
		PENDENTE }
	
	
	public enum EspecieEnum { 
		FELINO, 
		ROEDOR, 
		CANINO}
	
	//@Getter
	//@Setter
	@Column(name = "dataConsulta")
	private Date dataConsulta;
	
	//@Getter
	//@Setter
	@Column(name = "status")
	private StatusEnum status;
	
	
	@ManyToOne
	@JoinColumn(name = "idAnimal", referencedColumnName = "id")
	@JsonIgnore
	private Animal animal;

	
	@ManyToOne
	@JoinColumn(name = "idVeterinario", referencedColumnName = "id")
	@JsonIgnore
	private Veterinario veterinario;
	  
	  
	  

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getDataConsulta() {
		return dataConsulta;
	}

	public void setDataConsulta(Date dataConsulta) {
		this.dataConsulta = dataConsulta;
	}

	public StatusEnum getStatus() {
		return status;
	}

	public void setStatus(StatusEnum status) {
		this.status = status;
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

	public Veterinario getVeterinario() {
		return veterinario;
	}

	public void setVeterinario(Veterinario veterinario) {
		this.veterinario = veterinario;
	}

	

	
	
	
	
	

}
