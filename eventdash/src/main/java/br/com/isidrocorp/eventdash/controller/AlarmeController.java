package br.com.isidrocorp.eventdash.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.isidrocorp.eventdash.dao.AlarmeDAO;
import br.com.isidrocorp.eventdash.model.Alarme;

@RestController
public class AlarmeController {
	
	//Aqui o autowiored é responsável por, além de buscar um objeto que faz a implementação da interface, ele tb cria a instanciação do objeto, ou seja, não preciso do NEW
	
	@Autowired
	private AlarmeDAO dao;
	
	//metodo que retorna todos os alarmes gravados no banco
	
	@GetMapping("/alarmes")
	public ArrayList<Alarme> recuperarTodos(){
		
	//Basicamente ele deve entrar em contato com o banco de dados e fazer um select	
		
		ArrayList<Alarme> lista;
		lista = (ArrayList<Alarme>)dao.findAll();
		return lista;
		
		
	}
}
