package br.com.equipealfa.horasextras.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.equipealfa.horasextras.model.Atividade;

public interface AtividadeDAO extends CrudRepository<Atividade, Integer> {

	public Atividade findByNomeAtividade(String nomeAtividade);
}
