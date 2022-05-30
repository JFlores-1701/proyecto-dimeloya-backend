package com.proyecto.dimeloya.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.dimeloya.models.Intencion;
import com.proyecto.dimeloya.service.IIntencionService;

@RestController
@RequestMapping("api/v1/intencion")
public class IntencionController {
	
	@Autowired
	private IIntencionService intencionService;
	
	@PostMapping("/registrar")
	public ResponseEntity<Intencion> registrarOpinion(@RequestBody Intencion intencion) {
		intencion.setFechaInten(new Date());
		Intencion newOpinion = intencionService.registrarOpinion(intencion);
		return new ResponseEntity<>(newOpinion, HttpStatus.CREATED);
	}
}
