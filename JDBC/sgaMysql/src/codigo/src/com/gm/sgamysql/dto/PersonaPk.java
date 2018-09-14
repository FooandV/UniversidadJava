/*
 * This source file was generated by FireStorm/DAO.
 * 
 * If you purchase a full license for FireStorm/DAO you can customize this header file.
 * 
 * For more information please visit http://www.codefutures.com/products/firestorm
 */

package com.gm.sgamysql.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/** 
 * This class represents the primary key of the persona table.
 */
public class PersonaPk implements Serializable
{
	protected int idPersona;

	/** 
	 * This attribute represents whether the primitive attribute idPersona is null.
	 */
	protected boolean idPersonaNull;

	/** 
	 * Sets the value of idPersona
	 */
	public void setIdPersona(int idPersona)
	{
		this.idPersona = idPersona;
	}

	/** 
	 * Gets the value of idPersona
	 */
	public int getIdPersona()
	{
		return idPersona;
	}

	/**
	 * Method 'PersonaPk'
	 * 
	 */
	public PersonaPk()
	{
	}

	/**
	 * Method 'PersonaPk'
	 * 
	 * @param idPersona
	 */
	public PersonaPk(final int idPersona)
	{
		this.idPersona = idPersona;
	}

	/** 
	 * Sets the value of idPersonaNull
	 */
	public void setIdPersonaNull(boolean idPersonaNull)
	{
		this.idPersonaNull = idPersonaNull;
	}

	/** 
	 * Gets the value of idPersonaNull
	 */
	public boolean isIdPersonaNull()
	{
		return idPersonaNull;
	}

	/**
	 * Method 'equals'
	 * 
	 * @param _other
	 * @return boolean
	 */
	public boolean equals(Object _other)
	{
		if (_other == null) {
			return false;
		}
		
		if (_other == this) {
			return true;
		}
		
		if (!(_other instanceof PersonaPk)) {
			return false;
		}
		
		final PersonaPk _cast = (PersonaPk) _other;
		if (idPersona != _cast.idPersona) {
			return false;
		}
		
		if (idPersonaNull != _cast.idPersonaNull) {
			return false;
		}
		
		return true;
	}

	/**
	 * Method 'hashCode'
	 * 
	 * @return int
	 */
	public int hashCode()
	{
		int _hashCode = 0;
		_hashCode = 29 * _hashCode + idPersona;
		_hashCode = 29 * _hashCode + (idPersonaNull ? 1 : 0);
		return _hashCode;
	}

	/**
	 * Method 'toString'
	 * 
	 * @return String
	 */
	public String toString()
	{
		StringBuffer ret = new StringBuffer();
		ret.append( "com.gm.sgamysql.dto.PersonaPk: " );
		ret.append( "idPersona=" + idPersona );
		return ret.toString();
	}

}
