package br.com.equipealfa.horasextras.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.equipealfa.horasextras.model.Ocorrencia;

public interface OcorrenciaDAO extends CrudRepository<Ocorrencia, Integer>{
	
}
