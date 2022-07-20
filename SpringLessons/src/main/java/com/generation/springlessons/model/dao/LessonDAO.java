package com.generation.springlessons.model.dao;

import java.util.List;

import com.generation.springlessons.model.entities.Lesson;


public interface LessonDAO
{
	/**
	 * Insert salva una nuova lezione sull'archivio.
	 * fornisce in fase di salvataggio l'ID.
	 * Se non l'inserimento fallisce, da eccezione
	 * @param newLesson
	 * @return
	 */
	Lesson insert(Lesson newLesson);
	
	Lesson get(String ID);
	
	List<Lesson> getAll();
	
	Lesson update(Lesson newVersion);
	
	void delete(String ID);
	
}
