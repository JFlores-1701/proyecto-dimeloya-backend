package com.proyecto.dimeloya.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.dimeloya.models.Opinion;
import com.proyecto.dimeloya.repository.OpinionRepository;
import com.proyecto.dimeloya.service.IOpinionService;

@Service
public class IOpinionServiceImpl implements IOpinionService {
	
	@Autowired
	private OpinionRepository opinionRepository ;

	@Override
	public List<Opinion> listarOpiniones() {		
		return opinionRepository.findAll();
	}

	@Override
	public Opinion registrarOpinion(Opinion opinion) {
		return opinionRepository.save(opinion);
	}

	@Override
	public List<Opinion> listarOpinionesPorRestaurante(int codResta) {
		return opinionRepository.listar(codResta);
	}

}
