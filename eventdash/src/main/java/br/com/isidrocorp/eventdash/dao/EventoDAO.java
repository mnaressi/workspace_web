package br.com.isidrocorp.eventdash.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.isidrocorp.eventdash.model.Evento;

public interface EventoDAO extends CrudRepository<Evento, Integer>{
	
	

}
