package com.proyecto.dimeloya.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.dimeloya.models.Opinion;
import com.proyecto.dimeloya.service.IOpinionService;

@RestController
@RequestMapping("api/v1/opinion")
public class OpinionController {
	
	@Autowired
	private IOpinionService opinionService;
	
	@GetMapping("/listar")
	public ResponseEntity<List<Opinion>> listarOpiniones() {
		List<Opinion> lstOpinions;
		lstOpinions = opinionService.listarOpiniones();
		return new ResponseEntity<>(lstOpinions, HttpStatus.OK);
	}
	
	@GetMapping("/listarPorRestaurante")
	public ResponseEntity<List<Opinion>> listarOpinionesPorRestaurante(@RequestParam int codResta) {
		List<Opinion> lstOpinions;
		lstOpinions = opinionService.listarOpinionesPorRestaurante(codResta);
		return new ResponseEntity<>(lstOpinions, HttpStatus.OK);
	}
	
	@PostMapping("/registrar")
	public ResponseEntity<Opinion> registrarOpinion(@RequestBody Opinion opinion) {
		Opinion newOpinion = opinionService.registrarOpinion(opinion);
		return new ResponseEntity<>(newOpinion, HttpStatus.CREATED);
	}
}
