package br.com.equipealfa.horasextras.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.equipealfa.horasextras.dao.OcorrenciaDAO;
import br.com.equipealfa.horasextras.model.Ocorrencia;

@RestController
@CrossOrigin("*")
public class OcorrenciaController {

	@Autowired
	private OcorrenciaDAO dao;

	@GetMapping("/ocorrencia")
	public ArrayList<Ocorrencia> buscarTodos() {
		ArrayList<Ocorrencia> lista;
		lista = (ArrayList<Ocorrencia>) dao.findAll();
		return lista;
	}

}
