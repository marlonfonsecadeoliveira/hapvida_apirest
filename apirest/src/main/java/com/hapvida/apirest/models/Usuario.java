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


@Entity
@Table(name = "TB_Usuario")
public class Usuario {

	private static final long serialVersionUID = 3141224274894890129L;

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id")
	private long id;

	private String login;
	private String name;
	private String password;
	private String passwordMd5;
	private String mensagem;

	@Column(name = "senha_tentativas")
	private Integer senhaTentativas;

	@Column(name = "id_google")
	private String idGoogle;

	@Column(name = "dataHoraLogin")
	private Date dataHoraLogin;

	@Column(name = "dataHoraLogout")
	private Date dataHoraLogout;

	@ManyToOne
	@JoinColumn(name = "idAcesso", referencedColumnName = "Id")
	private Acesso acesso;

	@ManyToOne
	@JoinColumn(name = "idTurno", referencedColumnName = "Id")
	private DominioTurnoUsuario turnoUsuario;

	@ManyToOne
	@JoinColumn(name = "idSstatus", referencedColumnName = "Id")
	private DominioStatusUsuario statusUsuario;

	@ManyToOne
	@JoinColumn(name = "idEquipe", referencedColumnName = "id")
	private Equipe equipe;
	

	@Column(name = "IpUsuario")
	private String ipUsuario;





	public void setId(Integer id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public Acesso getAcesso() {
		return acesso;
	}

	public void setAcesso(Acesso acesso) {
		this.acesso = acesso;
	}

	public DominioTurnoUsuario getTurnoUsuario() {
		return turnoUsuario;
	}

	public void setTurnoUsuario(DominioTurnoUsuario turnoUsuario) {
		this.turnoUsuario = turnoUsuario;
	}

	public DominioStatusUsuario getStatusUsuario() {
		return statusUsuario;
	}

	public void setStatusUsuario(DominioStatusUsuario statusUsuario) {
		this.statusUsuario = statusUsuario;
	}

	public Equipe getEquipe() {
		return equipe;
	}

	public void setEquipe(Equipe equipe) {
		this.equipe = equipe;
	}

	public Date getDataHoraLogin() {
		return dataHoraLogin;
	}

	public void setDataHoraLogin(Date dataHoraLogin) {
		this.dataHoraLogin = dataHoraLogin;
	}

	public Date getDataHoraLogout() {
		return dataHoraLogout;
	}

	public void setDataHoraLogout(Date dataHoraLogout) {
		this.dataHoraLogout = dataHoraLogout;
	}

	public String getIdGoogle() {
		return idGoogle;
	}

	public void setIdGoogle(String idGoogle) {
		this.idGoogle = idGoogle;
	}

	public String getIpUsuario() {
		return ipUsuario;
	}

	public void setIpUsuario(String ipUsuario) {
		this.ipUsuario = ipUsuario;
	}

	public String getPasswordMd5() {
		return passwordMd5;
	}

	public void setPasswordMd5(String passwordMd5) {
		this.passwordMd5 = passwordMd5;
	}

	public Integer getSenhaTentativas() {
		return senhaTentativas;
	}

	public void setSenhaTentativas(Integer senhaTentativas) {
		this.senhaTentativas = senhaTentativas;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	
	

}
