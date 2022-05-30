package com.proyecto.dimeloya.service;

import java.util.List;

import com.proyecto.dimeloya.models.Restaurante;

public interface IRestauranteService {
	// LISTAR
	List<Restaurante> listarRestaurantes();
	
	// LISTAR POR NOMBRE
	List<Restaurante> listarRestaurantesPorNombre(String nombreRestaurante);
	
	// LISTAR POR NOMBRE Y CATEGORIA
	List<Restaurante> listarPorNomCate(String nomResta, String nomCate);

	// LISTAR POR NOMBRE Y DIRECCION
	List<Restaurante> listarPorNomDirec(String nomResta, String dirResta);
	
	// LISTAR POR NOMBRE, CATEGORIA Y DIRECCION
	List<Restaurante> listarPorNomCateDirec(String nomResta, String nomCate, String dirResta);
	
	// LISTAR POR CATEGORIA
	List<Restaurante> listarPorCate(String cateResta);
	
	// LISTAR POR CATEGORIA Y DIRECCION
	List<Restaurante> listarPorCateDirec(String nomCate, String dirResta);
	
	// LISTAR POR DIRECCION
	List<Restaurante> listarPorDirec(String dirResta);
}
