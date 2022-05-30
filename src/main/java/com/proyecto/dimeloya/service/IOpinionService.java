package com.proyecto.dimeloya.service;

import java.util.List;

import com.proyecto.dimeloya.models.Opinion;

public interface IOpinionService {

	// LISTAR
	public List<Opinion> listarOpiniones();
	
	// REGISTRAR
	public Opinion registrarOpinion(Opinion opinion);
	
	// LISTAR POR RESTAURANTE
	public List<Opinion> listarOpinionesPorRestaurante(int codResta);
}
