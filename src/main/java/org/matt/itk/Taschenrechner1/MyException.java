package org.matt.itk.Taschenrechner1;

public class MyException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	MyException()
	{
		super("Der Eingabetyp muss eine Zahl sein");
	}
	
}
