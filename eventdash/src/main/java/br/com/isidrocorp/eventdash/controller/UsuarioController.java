package br.com.isidrocorp.eventdash.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.isidrocorp.eventdash.dao.UsuarioDAO;
import br.com.isidrocorp.eventdash.model.Usuario;

@RestController
public class UsuarioController {
	
	
	@Autowired
	private UsuarioDAO dao;
	
	
	
	@GetMapping("/usuarios")
	public ArrayList<Usuario> recuperarTodos(){
		
	
		
		ArrayList<Usuario> lista;
		lista = (ArrayList<Usuario>)dao.findAll();
		return lista;
		
		
	}
}