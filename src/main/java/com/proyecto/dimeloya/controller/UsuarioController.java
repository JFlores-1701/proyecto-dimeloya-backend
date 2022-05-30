package com.proyecto.dimeloya.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.dimeloya.models.Usuario;
import com.proyecto.dimeloya.service.IUsuarioService;


@RestController
@RequestMapping("api/v1/usuario")
public class UsuarioController {
	
	@Autowired
	private IUsuarioService usuarioService;
	
	@GetMapping("/listar")
	public ResponseEntity<List<Usuario>> listarUsuarios() {
		List<Usuario> lstUsuarios;
		lstUsuarios = usuarioService.listarUsuarios();
		return new ResponseEntity<>(lstUsuarios, HttpStatus.OK);
	}
	
	@PostMapping("/registrar")
	public ResponseEntity<Usuario> registrarUsuario(@RequestBody Usuario usuario) {
		Usuario newUser = usuarioService.registrarUusario(usuario);
		return new ResponseEntity<>(newUser, HttpStatus.CREATED);
	}
	
	@PutMapping("/actualizar")
	public ResponseEntity<Usuario> actualizarUsuario(@RequestBody Usuario usuario) {
		Usuario newUser = usuarioService.actualizarUsuario(usuario);
		return new ResponseEntity<>(newUser, HttpStatus.OK);
	}
	
	@PostMapping("/login")
	public ResponseEntity<Usuario> login(@RequestBody Usuario u) {
		Usuario user = usuarioService.login(u.getEmailUsuario(), u.getPassUsuario());
		if (user != null) {
			return new ResponseEntity<>(user, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(user, HttpStatus.NO_CONTENT);
		}	
	}

}
