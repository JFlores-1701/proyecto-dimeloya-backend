package com.proyecto.dimeloya.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.proyecto.dimeloya.models.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
	
	@Query("Select u from Usuario u where u.emailUsuario =?1 and u.passUsuario =?2")
	public Usuario login(String email, String pass);
}
