package com.hapvida.apirest.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.hapvida.apirest.enums.ConsultaEnum;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "TB_Consulta")


public class Consulta {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;

	public enum ConsultaEnum { 
		ATIVO, 
		INATIVO, 
		PENDENTE }
	
	//@Getter
	//@Setter
	private Date dataConsulta;
	
	//@Getter
	//@Setter
	private ConsultaEnum status = null;
	  
	  
	  

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

	public ConsultaEnum getStatus() {
		return status;
	}

	public void setStatus(ConsultaEnum status) {
		this.status = status;
	}

	
	
	
	
	

}
