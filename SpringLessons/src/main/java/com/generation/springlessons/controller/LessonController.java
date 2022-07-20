package com.generation.springlessons.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.generation.springlessons.model.dao.LessonDAO;

@Controller
public class LessonController
{
	// DIPENDENZE!!!
	// io sono un LessonController. Io DIPENDO 
	// da un LessonDAO
	// con Autowired io sto chiedendo a Spring
	// "cerca un BEAN di tipo Lesson DAO
	// E DAMMELO! 
	// questa si chiama DEPENDENCY INJECTION
	@Autowired
	LessonDAO lessonDAO;
	
	// http://localhost:8080/springlessons/ -> mainPage()
	
	// MODEL è un "contenitore" di variabili che arrivano dal model
	// e vanno alla vista. Vale a dire un contenitore di ATTRIBUTI
	// inizialmente VUOTO!
	@RequestMapping("/")
	public String mainPage(Model model)
	{
		
		/*
		 * List<Lesson> lessons = lessonDAO.getAll();
		 * request.setAttribute("lessons", lessons);
		 * request.getRequestDispatcher("Main.jsp").forward(request,response);
		 * 
		 */
		model.addAttribute("lessons", lessonDAO.getAll());
		// MODEL VIENE PASSATO AUTOMATICAMENTE a main.jsp
		return "Main";
	}
	
	// mappatura parametrica
	///
	@RequestMapping("/{id}")	// collegamento fra String ID e il pezzo di uri {id}
	public String detailPage(@PathVariable("id") String ID, Model model)
	{
		model.addAttribute("lesson", lessonDAO.get(ID));
		return "Detail";
		
	}
	
	
	
	
}
