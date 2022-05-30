package com.proyecto.dimeloya.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false, name = "cod_usuario")
	private int codUsuario;
	
	@Column(name = "nom_usuario")
	private String nomUsuario;

	@Column(name = "ape_usuario")
	private String apeUsuario;

	@Column(name = "email_usuario")
	private String emailUsuario;

	@Column(name = "pass_usuario")
	private String passUsuario;
	
	@Column(name = "cod_suscri")
	private String codSuscri;
	
	public Usuario() {
		super();
	}

	public int getCodUsuario() {
		return codUsuario;
	}

	public void setCodUsuario(int codUsuario) {
		this.codUsuario = codUsuario;
	}

	public String getNomUsuario() {
		return nomUsuario;
	}

	public void setNomUsuario(String nomUsuario) {
		this.nomUsuario = nomUsuario;
	}

	public String getApeUsuario() {
		return apeUsuario;
	}

	public void setApeUsuario(String apeUsuario) {
		this.apeUsuario = apeUsuario;
	}

	public String getEmailUsuario() {
		return emailUsuario;
	}

	public void setEmailUsuario(String emailUsuario) {
		this.emailUsuario = emailUsuario;
	}

	public String getPassUsuario() {
		return passUsuario;
	}

	public void setPassUsuario(String passUsuario) {
		this.passUsuario = passUsuario;
	}

	public String getCodSuscri() {
		return codSuscri;
	}

	public void setCodSuscri(String codSuscri) {
		this.codSuscri = codSuscri;
	}
}
