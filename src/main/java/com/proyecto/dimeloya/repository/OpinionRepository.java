package com.proyecto.dimeloya.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.proyecto.dimeloya.models.Opinion;

@Repository
public interface OpinionRepository extends JpaRepository<Opinion, Integer> {
	
	@Query("Select o from Opinion o where o.codRestaOpi = ?1")
	public List<Opinion> listar(int codResta);

}
