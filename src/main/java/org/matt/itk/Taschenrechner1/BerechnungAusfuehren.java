package org.matt.itk.Taschenrechner1;

import java.util.Scanner;

public class BerechnungAusfuehren {

	public float zahl1Eingeben()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Bitte geben sie die erste Zahl ein");
		return scan.nextFloat();
	}
	
	public float zahl2Eingeben()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Bitte geben sie die zweite Zahl ein");
		return scan.nextFloat();
	}
	public String OperatorEingeben()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Bitte geben sie den Rechenoperator ein");
		return scan.nextLine();
	}
	
	public  float rechnungAusfuehren()
	{
		float zahl1 = zahl1Eingeben();
		Rechenoperationen re;	
		switch(OperatorEingeben()){
		
		case "+":
			re = new Add();
			return re.ausführen(zahl1, zahl2Eingeben());
		case "-":
			re = new Minus();
			return re.ausführen(zahl1, zahl2Eingeben());
		case "*":
			re = new Multiplikat();
			return re.ausführen(zahl1, zahl2Eingeben());
		case "/":
			re = new Division();
			return re.ausführen(zahl1, zahl2Eingeben());	
		default:
		return 0;
	}
	}
}
