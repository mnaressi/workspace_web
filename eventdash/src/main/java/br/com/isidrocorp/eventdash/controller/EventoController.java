package br.com.isidrocorp.eventdash.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.isidrocorp.eventdash.dao.EventoDAO;
import br.com.isidrocorp.eventdash.model.Evento;

@RestController
public class EventoController {
	
	
	
	@Autowired
	private EventoDAO dao;
	
	
	
	@GetMapping("/eventos")
	public ArrayList<Evento> recuperarTodos(){
		
			
		ArrayList<Evento> lista;
		lista = (ArrayList<Evento>)dao.findAll();
		return lista;
		
		
	}
}