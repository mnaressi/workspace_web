package br.com.isidrocorp.eventdash.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.isidrocorp.eventdash.dao.EquipamentoDAO;
import br.com.isidrocorp.eventdash.model.Equipamento;

@RestController
@CrossOrigin("*")
public class EquipamentoController {
	
	
	@Autowired
	private EquipamentoDAO dao;
	
	
	@GetMapping("/equipamentos")
	public ArrayList<Equipamento> recuperarTodos(){
		
			
		ArrayList<Equipamento> lista;
		lista = (ArrayList<Equipamento>)dao.findAll();
		return lista;
		
		
	}
}
