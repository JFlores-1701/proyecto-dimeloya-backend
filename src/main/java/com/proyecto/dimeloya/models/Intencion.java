package com.proyecto.dimeloya.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "inten")
public class Intencion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false, name = "cod_inten")
	private int codInten;
	
	@Column(name = "fec_inten")
	private Date fechaInten;
	
	@Column(name = "tipo_inten")
	private String tipoInten;
	
	public Intencion() {
		super();
	}

	public int getCodInten() {
		return codInten;
	}

	public void setCodInten(int codInten) {
		this.codInten = codInten;
	}

	public Date getFechaInten() {
		return fechaInten;
	}

	public void setFechaInten(Date fechaInten) {
		this.fechaInten = fechaInten;
	}

	public String getTipoInten() {
		return tipoInten;
	}

	public void setTipoInten(String tipoInten) {
		this.tipoInten = tipoInten;
	}
}
