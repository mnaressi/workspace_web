package br.com.isidrocorp.eventdash.controller;

import java.time.LocalDate;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.isidrocorp.eventdash.dao.EventoDAO;
import br.com.isidrocorp.eventdash.model.Alarme;
import br.com.isidrocorp.eventdash.model.Evento;

@RestController
@CrossOrigin("*")
public class EventoController {
	
	@Autowired
	private EventoDAO dao;
	
	@GetMapping("/eventos")
	public ArrayList<Evento> recuperarTodos(@RequestParam(name = "ini") String ini, @RequestParam(name = "fim") String fim){
					
		ArrayList<Evento> lista;
		//converter strings para LocalDate e usar o metodo que eu criei
		LocalDate inicio = LocalDate.parse(ini);
		LocalDate dtfim = LocalDate.parse(fim);
		
		lista = dao.findAllByDataEventoBetween(inicio, dtfim);
		return lista;
		
	}
	
	@GetMapping("/eventosporalarme")
	public ArrayList<Evento> recuperarTodosPorAlarme(@RequestParam(name = "id") int id){
		Alarme alarme = new Alarme();
		alarme.setId(id);
		return dao.findAllByAlarme(alarme);
	}
	
}