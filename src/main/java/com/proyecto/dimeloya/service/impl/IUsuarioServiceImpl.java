package com.proyecto.dimeloya.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.dimeloya.models.Usuario;
import com.proyecto.dimeloya.repository.UsuarioRepository;
import com.proyecto.dimeloya.service.IUsuarioService;

@Service
public class IUsuarioServiceImpl implements IUsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;

	@Override
	public List<Usuario> listarUsuarios() {

		return usuarioRepository.findAll();
	}

	@Override
	public Usuario registrarUusario(Usuario usuario) {

		return usuarioRepository.save(usuario);
	}

	@Override
	public Usuario actualizarUsuario(Usuario usuario) {

		return usuarioRepository.save(usuario);
	}

	@Override
	public Usuario login(String email, String pass) {

		return usuarioRepository.login(email, pass);
	}

}
