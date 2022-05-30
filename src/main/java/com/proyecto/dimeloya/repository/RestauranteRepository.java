package com.proyecto.dimeloya.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.proyecto.dimeloya.models.Restaurante;

@Repository
public interface RestauranteRepository extends JpaRepository<Restaurante, Integer> {
	
	@Query("Select r from Restaurante r where LOWER(r.nomResta) like %?1%")
	public List<Restaurante> listarPorNombre(String email);
	
	// LISTAR POR NOMBRE Y CATEGORIA
	@Query("Select r from Restaurante r where LOWER(r.nomResta) like %?1% AND LOWER(r.cateResta) like %?2%")
	List<Restaurante> listarPorNomCate(String nomResta, String nomCate);
	
	// LISTAR POR NOMBRE Y DIRECCION
	@Query("Select r from Restaurante r where LOWER(r.nomResta) like %?1% AND LOWER(r.direcResta) like %?2%")
	List<Restaurante> listarPorNomDirec(String nomResta, String dirResta);
	
	// LISTAR POR NOMBRE, CATEGORIA Y DIRECCION
	@Query("Select r from Restaurante r where LOWER(r.nomResta) like %?1% AND LOWER(r.cateResta) like %?2% AND LOWER(r.direcResta) like %?3%")
	List<Restaurante> listarPorNomCateDirec(String nomResta, String nomCate, String dirResta);
	
	// LISTAR POR CATEGORIA
	@Query("Select r from Restaurante r where LOWER(r.cateResta) like %?1%")
	List<Restaurante> listarPorCate(String cateResta);
	
	// LISTAR POR CATEGORIA Y DIRECCION
	@Query("Select r from Restaurante r where LOWER(r.cateResta) like %?1% AND LOWER(r.direcResta) like %?2%")
	List<Restaurante> listarPorCateDirec(String nomCate, String dirResta);
	
	// LISTAR POR DIRECCION
	@Query("Select r from Restaurante r where LOWER(r.direcResta) like %?1%")
	List<Restaurante> listarPorDirec(String dirResta);
}
