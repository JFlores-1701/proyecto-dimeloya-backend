package com.proyecto.dimeloya.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.dimeloya.models.Intencion;
import com.proyecto.dimeloya.repository.IntencionRepository;
import com.proyecto.dimeloya.service.IIntencionService;

@Service
public class IIntencionServiceImpl implements IIntencionService {
	
	@Autowired
	private IntencionRepository intencionRepository ;

	@Override
	public Intencion registrarOpinion(Intencion opinion) {
		return intencionRepository.save(opinion);
	}
}
