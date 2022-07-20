package com.generation.springlessons.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.generation.springlessons.model.dao.LessonDAO;
import com.generation.springlessons.model.dao.MockLessonDAO;

// questa annotation, Component
// è una delle TANTE annotation
// che indicano un Context.

@Component 
public class Context
{

	// l'oggetto prodotto da questo metodo
	// verrà "messo sul mercato"
	// diventerà una dipendenza
	// Bean = OGGETTO CONDIVISO, MESSO SUL MERCATO
	// OFFERTA
	@Bean
	public LessonDAO getLessonDAO()
	{
		return new MockLessonDAO();
	}
	
	
}
