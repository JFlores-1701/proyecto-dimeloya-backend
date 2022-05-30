package com.proyecto.dimeloya.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "opinion")
public class Opinion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false, name = "cod_opi")
	private int codOpi;

	@Column(name = "punt_opi")
	private int puntOpi;

	@Column(name = "des_opi")
	private String desOpi;

	@Column(name = "cant_like_opi", columnDefinition = "integer default 0")
	private int cantLikeOpi;

	@Column(name = "cant_dislike_opi", columnDefinition = "integer default 0")
	private int cantDisLikeOpi;

	@Column(name = "cod_resta_opi")
	private int codRestaOpi;
	
	@Column(name = "nom_usuario_opi")
	private String nomUsuarioOpi;

	public Opinion() {
		super();
	}

	public int getCodOpi() {
		return codOpi;
	}

	public void setCodOpi(int codOpi) {
		this.codOpi = codOpi;
	}

	public int getPuntOpi() {
		return puntOpi;
	}

	public void setPuntOpi(int puntOpi) {
		this.puntOpi = puntOpi;
	}

	public String getDesOpi() {
		return desOpi;
	}

	public void setDesOpi(String desOpi) {
		this.desOpi = desOpi;
	}

	public int getCantLikeOpi() {
		return cantLikeOpi;
	}

	public void setCantLikeOpi(int cantLikeOpi) {
		this.cantLikeOpi = cantLikeOpi;
	}

	public int getCantDisLikeOpi() {
		return cantDisLikeOpi;
	}

	public void setCantDisLikeOpi(int cantDisLikeOpi) {
		this.cantDisLikeOpi = cantDisLikeOpi;
	}

	public int getCodRestaOpi() {
		return codRestaOpi;
	}

	public void setCodRestaOpi(int codRestaOpi) {
		this.codRestaOpi = codRestaOpi;
	}
	
	public String getNomUsuarioOpi() {
		return nomUsuarioOpi;
	}

	public void setNomUsuarioOpi(String nomUsuarioOpi) {
		this.nomUsuarioOpi = nomUsuarioOpi;
	}	
}
