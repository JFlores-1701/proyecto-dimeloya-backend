package com.proyecto.dimeloya.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.dimeloya.models.Restaurante;
import com.proyecto.dimeloya.service.IRestauranteService;

@RestController
@RequestMapping("api/v1/restaurante")
public class RestauranteController {
	
	@Autowired
	IRestauranteService restauranteService;
	
	@GetMapping("/listar")
	public ResponseEntity<List<Restaurante>> listar() {
		List<Restaurante> lstRestaurantes;
		lstRestaurantes = restauranteService.listarRestaurantes();
		return new ResponseEntity<>(lstRestaurantes, HttpStatus.OK);
	}
	
	@GetMapping("/listarPorNombre")
	public ResponseEntity<List<Restaurante>> listarPorNombre(@RequestParam String nombreRes) {
		List<Restaurante> lstRestaurantes;
		lstRestaurantes = restauranteService.listarRestaurantesPorNombre(nombreRes);
		return new ResponseEntity<>(lstRestaurantes, HttpStatus.OK);
	}
	
	@GetMapping("/listarCate")
	public ResponseEntity<List<Restaurante>> listarCate(@RequestParam String cateResta) {
		List<Restaurante> lstRestaurantes;
		lstRestaurantes = restauranteService.listarPorCate(cateResta);
		return new ResponseEntity<>(lstRestaurantes, HttpStatus.OK);
	}
	
	@GetMapping("/listarDirec")
	public ResponseEntity<List<Restaurante>> listarDirec(@RequestParam String dirResta) {
		List<Restaurante> lstRestaurantes;
		lstRestaurantes = restauranteService.listarPorDirec(dirResta);
		return new ResponseEntity<>(lstRestaurantes, HttpStatus.OK);
	}
	
	// 2 PARAMETROS
	@GetMapping("/listarNomCate")
	public ResponseEntity<List<Restaurante>> listarNomCate(@RequestParam String nombreRes, @RequestParam String cateResta) {
		List<Restaurante> lstRestaurantes;
		lstRestaurantes = restauranteService.listarPorNomCate(nombreRes, cateResta);
		return new ResponseEntity<>(lstRestaurantes, HttpStatus.OK);
	}
	
	@GetMapping("/listarNomDirec")
	public ResponseEntity<List<Restaurante>> listarNomDirec(@RequestParam String nombreRes, @RequestParam String dirResta) {
		List<Restaurante> lstRestaurantes;
		lstRestaurantes = restauranteService.listarPorNomDirec(nombreRes, dirResta);
		return new ResponseEntity<>(lstRestaurantes, HttpStatus.OK);
	}
	
	@GetMapping("/listarCateDirec")
	public ResponseEntity<List<Restaurante>> listarCateDirec(@RequestParam String cateResta, @RequestParam String dirResta) {
		List<Restaurante> lstRestaurantes;
		lstRestaurantes = restauranteService.listarPorCateDirec(cateResta, dirResta);
		return new ResponseEntity<>(lstRestaurantes, HttpStatus.OK);
	}
	
	// 3 PARAMETROS
	@GetMapping("/listarNomCateDirec")
	public ResponseEntity<List<Restaurante>> listarNomCateDirec(@RequestParam String nombreRes, @RequestParam String cateResta, @RequestParam String dirResta) {
		List<Restaurante> lstRestaurantes;
		lstRestaurantes = restauranteService.listarPorNomCateDirec(nombreRes, cateResta, dirResta);
		return new ResponseEntity<>(lstRestaurantes, HttpStatus.OK);
	}
	
}
