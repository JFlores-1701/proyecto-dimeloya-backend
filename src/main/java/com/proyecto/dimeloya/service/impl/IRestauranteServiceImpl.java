package com.proyecto.dimeloya.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.dimeloya.models.Restaurante;
import com.proyecto.dimeloya.repository.RestauranteRepository;
import com.proyecto.dimeloya.service.IRestauranteService;

@Service
public class IRestauranteServiceImpl implements IRestauranteService {
	
	@Autowired
	RestauranteRepository restauranteRepository;

	@Override
	public List<Restaurante> listarRestaurantes() {
		return restauranteRepository.findAll();
	}

	@Override
	public List<Restaurante> listarRestaurantesPorNombre(String nombreRestaurante) {
		return restauranteRepository.listarPorNombre(nombreRestaurante);
	}

	@Override
	public List<Restaurante> listarPorNomCate(String nomResta, String nomCate) {
		return restauranteRepository.listarPorNomCate(nomResta, nomCate);
	}

	@Override
	public List<Restaurante> listarPorNomDirec(String nomResta, String dirResta) {
		return restauranteRepository.listarPorNomDirec(nomResta, dirResta);
	}

	@Override
	public List<Restaurante> listarPorNomCateDirec(String nomResta, String nomCate, String dirResta) {
		return restauranteRepository.listarPorNomCateDirec(nomResta, nomCate, dirResta);
	}

	@Override
	public List<Restaurante> listarPorCate(String cateResta) {
		return restauranteRepository.listarPorCate(cateResta);
	}

	@Override
	public List<Restaurante> listarPorCateDirec(String nomCate, String dirResta) {
		return restauranteRepository.listarPorCateDirec(nomCate, dirResta);
	}

	@Override
	public List<Restaurante> listarPorDirec(String dirResta) {
		return restauranteRepository.listarPorDirec(dirResta);
	}

}
