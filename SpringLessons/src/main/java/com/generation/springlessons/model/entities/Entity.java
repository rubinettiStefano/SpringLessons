package com.generation.springlessons.model.entities;


/**
 * Base per tutte le entities successive
 * @author rubin
 *
 */
public abstract class Entity implements Validable
{
	//protected = visibile nel package e da tutti i DISCENDENTI
	protected String ID;

	//ACCESSORY METHOD, metodo che da accesso ad una proprietà
	public String getID()
	{
		return ID;
	}

	public void setID(String ID)
	{
		this.ID = ID;
	}
	
	
	
}
