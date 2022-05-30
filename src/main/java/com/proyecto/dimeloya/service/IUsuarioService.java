package com.proyecto.dimeloya.service;

import java.util.List;

import com.proyecto.dimeloya.models.Usuario;


public interface IUsuarioService {
	
	// listar
	List<Usuario> listarUsuarios();
	
	// registro
	public Usuario registrarUusario(Usuario usuario);
	
	// actualizar
	public Usuario actualizarUsuario(Usuario usuario);
	
	// login
	public Usuario login(String email, String pass);
}
