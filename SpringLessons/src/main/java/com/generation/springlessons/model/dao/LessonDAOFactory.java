package com.generation.springlessons.model.dao;


public class LessonDAOFactory
{
	public static LessonDAO make()
	{
		return new MockLessonDAO();
	}
}
