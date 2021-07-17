package com.hapvida.apirest.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hapvida.apirest.models.Consulta;
import com.hapvida.apirest.repository.ConultaRepository;

@RestController
@RequestMapping(value = "/api")
public class ConsultaResource {
	
	@Autowired
	ConultaRepository conultaRepository; 
	
	@GetMapping("/consultas")
	public List<Consulta> listaConsulta(){
		return conultaRepository.findAll();
	}
	
	@GetMapping("/consulta/{id}")
	public Consulta listaConsultaUnica(@PathVariable(value = "id") long id){
		return conultaRepository.findById(id);
	}
	
	@PostMapping("/consulta")
	public Consulta salvarConsulta(@RequestBody Consulta consulta) {
		return conultaRepository.save(consulta);
		
	}

}
