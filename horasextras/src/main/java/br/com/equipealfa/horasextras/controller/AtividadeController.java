package br.com.equipealfa.horasextras.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.equipealfa.horasextras.dao.AtividadeDAO;
import br.com.equipealfa.horasextras.model.Atividade;

@RestController
@CrossOrigin("*")
public class AtividadeController {
	
	@Autowired
	private AtividadeDAO dao;
	
	@GetMapping("/atividade")
	public ArrayList<Atividade> buscarTodos() {
		ArrayList<Atividade> lista;
		lista = (ArrayList<Atividade>) dao.findAll();
		return lista;
	}
}
