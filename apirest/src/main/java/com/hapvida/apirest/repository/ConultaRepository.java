package com.hapvida.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hapvida.apirest.models.Consulta;

public interface ConultaRepository extends JpaRepository<Consulta, Long> {
	
	Consulta findById(long id);	

}
