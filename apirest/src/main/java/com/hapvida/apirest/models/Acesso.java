package com.hapvida.apirest.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Arrays;
import java.util.List;

@Entity
@Table(name = "TB_Acesso")
public class Acesso {
	
	private static final long serialVersionUID = 3141224274894890129L;

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id")
	private long id;

	@Enumerated(EnumType.STRING)
	private AcessoEnum acessoEnum;
	@Column(name = "acesso")
	private String acesso;

	@Column(name = "valor")
	private Integer valor;

	@Column(name = "Ambulancia")
	private Boolean ambulancia;

	public enum AcessoEnum {
		MASTER("master"), 
		ADMIN("admin"), 
		COORDENADOR("coordenador"), 
		ATENTENDE("tarm", Arrays.asList(ADMIN)), 
		VETERINARIO("Veterinario", Arrays.asList(ADMIN)), 
		CONDUTOR("condutor");


		private String authPath;
		
		private List<AcessoEnum> permissoes;

		private AcessoEnum(String authPath) {
			this.authPath = authPath;
		}
		
		private AcessoEnum(String authPath, List<AcessoEnum> permissoes) {
			this.authPath = authPath;
			this.permissoes = permissoes;
		}

		public static AcessoEnum findByAuthPath(String authPath) {
			for (AcessoEnum e : values()) {
				if (authPath.equals(e.authPath))
					return e;
			}
			return null;
		}
		

		
		public static AcessoEnum getAcessoByAuthPath(String authPath) {
			for (AcessoEnum acesso : AcessoEnum.values()) { 
				if (authPath.equalsIgnoreCase(acesso.getAuthPath()))
					return acesso;
			}	
			return null;
		}

		public boolean isAuthtorized(AcessoEnum acesso) {
			if (this == acesso) return true;
			return this.getPermissoes().contains(acesso);
		}
		
		public String getAuthPath() {
			return authPath;
		}
		
		public List<AcessoEnum> getPermissoes() {
			return permissoes;
		}
	}


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public AcessoEnum getAcessoEnum() {
		return acessoEnum;
	}

	public void setAcessoEnum(AcessoEnum acessoEnum) {
		this.acessoEnum = acessoEnum;
	}

	public Integer getValor() {
		return valor;
	}

	public void setValor(Integer valor) {
		this.valor = valor;
	}

	public Boolean getAmbulancia() {
		return ambulancia;
	}

	public void setAmbulancia(Boolean ambulancia) {
		this.ambulancia = ambulancia;
	}

	public String getAcesso() {
		return acesso;
	}

	public void setAcesso(String acesso) {
		this.acesso = acesso;
	}

	
	

}
