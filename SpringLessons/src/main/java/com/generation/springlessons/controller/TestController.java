package com.generation.springlessons.controller;
// SONO NEL PACKAGE GIUSTO!!


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


// ANNOTAZIONE - Le annotazioni cominciano con @
// e servono ad arricchire il codice, a spiegare a Java come gestire il 
// nostro codice.
// Spring LAVORA CON ANNOTAZIONI.

// Questa annotazione è una annotazione di Spring, e serve 
// a dire a Spring che questo è un CONTROLLER
// vale a dire, saprà gestire request http
@Controller
public class TestController
{

	// request mapping = "a che indirizzo trovo questo metodo?"
	// se l'utente inserisce http://localhost:8080/Springlessons/test verrà eseguito questo metodo
	@RequestMapping("/test" )
	public String test()
	{
		// restituisce il file Test.jsp che si trova in WEB-INF/jsp. Ma come fa a sapere dove si trova??
		return "Test";
	}
	
	
	
}
