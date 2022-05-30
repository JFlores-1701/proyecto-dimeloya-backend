package com.proyecto.dimeloya.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "restaurante")
public class Restaurante {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false, name = "cod_resta")
	private int codResta;
	
	@Column(name = "nom_resta")
	private String nomResta;
	
	@Column(name = "sub_resta")
	private String subResta;
	
	@Column(name = "puntos_resta")
	private int puntosResta;
	
	@Column(name = "direc_resta")
	private String direcResta;
	
	@Column(name = "fono_resta")
	private String fonoResta;
	
	@Column(name = "face_resta")
	private String faceResta;
	
	@Column(name = "insta_resta")
	private String instaResta;
	
	@Column(name = "img_princ_resta")
	private String imgPrincResta;
	
	@Column(name = "img_secon_resta")
	private String imgSecondResta;
	
	@Column(name = "aforo_resta")
	private int aforoResta;
	
	@Column(name = "mapa_resta")
	private String mapaResta;
	
	@Column(name = "cateResta")
	private String cateResta;

	public Restaurante() {
		super();
	}

	public int getCodResta() {
		return codResta;
	}

	public void setCodResta(int codResta) {
		this.codResta = codResta;
	}

	public String getNomResta() {
		return nomResta;
	}

	public void setNomResta(String nomResta) {
		this.nomResta = nomResta;
	}

	public int getPuntosResta() {
		return puntosResta;
	}

	public void setPuntosResta(int puntosResta) {
		this.puntosResta = puntosResta;
	}

	public String getFonoResta() {
		return fonoResta;
	}

	public void setFonoResta(String fonoResta) {
		this.fonoResta = fonoResta;
	}

	public String getFaceResta() {
		return faceResta;
	}

	public void setFaceResta(String faceResta) {
		this.faceResta = faceResta;
	}

	public String getInstaResta() {
		return instaResta;
	}

	public void setInstaResta(String instaResta) {
		this.instaResta = instaResta;
	}

	public String getImgPrincResta() {
		return imgPrincResta;
	}

	public void setImgPrincResta(String imgPrincResta) {
		this.imgPrincResta = imgPrincResta;
	}

	public String getImgSecondResta() {
		return imgSecondResta;
	}

	public void setImgSecondResta(String imgSecondResta) {
		this.imgSecondResta = imgSecondResta;
	}

	public int getAforoResta() {
		return aforoResta;
	}

	public void setAforoResta(int aforoResta) {
		this.aforoResta = aforoResta;
	}

	public String getMapaResta() {
		return mapaResta;
	}

	public void setMapaResta(String mapaResta) {
		this.mapaResta = mapaResta;
	}
	
	public String getCateResta() {
		return cateResta;
	}

	public void setCateResta(String cateResta) {
		this.cateResta = cateResta;
	}
	
	public String getDirecResta() {
		return direcResta;
	}

	public void setDirecResta(String direcResta) {
		this.direcResta = direcResta;
	}

	public String getSubResta() {
		return subResta;
	}

	public void setSubResta(String subResta) {
		this.subResta = subResta;
	}	
}
