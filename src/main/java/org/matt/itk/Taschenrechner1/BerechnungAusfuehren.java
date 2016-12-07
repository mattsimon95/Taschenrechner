package org.matt.itk.Taschenrechner1;

import java.util.Scanner;

public class BerechnungAusfuehren {

	
	

		public String OperatorEingeben()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Bitte geben sie den Rechenoperator ein");
		return scan.nextLine();
	}
	
	public  double rechnungAusfuehren()
	{
		
		double zahl1 = zahlEingeben();
		Rechenoperationen re;	
		switch(OperatorEingeben()){
		
		case "+":
			re = new Add();
			return re.ausführen(zahl1, zahlEingeben());
		case "-":
			re = new Minus();
			return re.ausführen(zahl1, zahlEingeben());
		case "*":
			re = new Multiplikat();
			return re.ausführen(zahl1, zahlEingeben());
		case "/":
			re = new Division();
			return re.ausführen(zahl1, zahlEingeben());	
		default:
		return 0;
		}
	}
	
	public double zahlEingeben()
	{
		System.out.println("Bitte geben eine Zahl ein");
		Scanner scan = new Scanner(System.in);
		String x = scan.nextLine();
		double zahl=0;
		
		if(isNumeric(x))
		{
			zahl= Double.parseDouble(x);
			
		}
		
		return zahl;
		
	}
	
	public boolean isNumeric(String value)
	{
		try{
			double number = Double.parseDouble(value);
			return number<100000;
		}
		catch(NumberFormatException e){
			return false;
		}
		
	}
	
}
