package br.com.isidrocorp.eventdash.controller;

import java.time.LocalDate;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.isidrocorp.eventdash.dao.EventoDAO;
import br.com.isidrocorp.eventdash.model.Evento;

@RestController
public class EventoController {
	
	@Autowired
	private EventoDAO dao;
	
	@PostMapping("/eventos")
	public ArrayList<Evento> recuperarTodos(@RequestParam(name = "ini") String ini, @RequestParam(name = "fim") String fim){
					
		ArrayList<Evento> lista;
		//converter strings para LocalDate e usar o metodo que eu criei
		LocalDate inicio = LocalDate.parse(ini);
		LocalDate dtfim = LocalDate.parse(fim);
		
		lista = dao.findAllByDataEventoBetween(inicio, dtfim);
		return lista;
		
	}
}