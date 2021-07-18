package com.hapvida.apirest.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hapvida.apirest.models.Consulta;
import com.hapvida.apirest.repository.ConultaRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

// Desenvolvido por Marlon fonseca de oliveira 17/07/2021



@RestController
@RequestMapping(value="/api")
@Api(value = "API REST Consulta")
//mudar para o dominio de acesso futuramente http://......
@CrossOrigin(origins = "*")
public class ConsultaResource {
	
	@Autowired
	ConultaRepository conultaRepository; 
	
	@GetMapping("/consultas")
	@ApiOperation(value = "Retorna uma lista de consultas")
	public List<Consulta> listaConsulta(){
		return conultaRepository.findAll();
	}
	
	@GetMapping("/consulta/{id}")
	@ApiOperation(value = "Retorna uma consulta")
	public Consulta listaConsultaUnica(@PathVariable(value = "id") long id){
		return conultaRepository.findById(id);
	}
	
	@PostMapping("/consulta")
	@ApiOperation(value = "Salva uma consulta")
	public Consulta salvarConsulta(@RequestBody Consulta consulta) {
		return conultaRepository.save(consulta);
		
	}
	
	@DeleteMapping("/consulta")
	@ApiOperation(value = "Exclui uma consulta")
	public void excluirConsulta(@RequestBody Consulta consulta) {
		conultaRepository.delete(consulta);
		
	}

	@PutMapping("/consulta")
	@ApiOperation(value = "Atualiza uma consulta")
	public Consulta atualizarConsulta(@RequestBody Consulta consulta) {
		return conultaRepository.save(consulta);
		
	}

}
