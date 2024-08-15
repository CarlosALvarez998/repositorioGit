package com.personas.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.personas.entidad.Personas;

@Repository
public interface PersonasRepository extends JpaRepository<Personas, Integer>{

	
	@Query("SELECT p FROM Personas p WHERE p.personasCol = :personasCol")
	Optional<Personas> findByID(@Param("personasCol") int personasCol);

	@Query("SELECT pe FROM Personas pe WHERE pe.curp =: curp")
	    Optional<Personas> findByCurp(@Param("curp") String curp);
	
}
