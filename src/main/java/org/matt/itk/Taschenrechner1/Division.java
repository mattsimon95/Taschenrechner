package org.matt.itk.Taschenrechner1;

public class Division implements Rechenoperationen {

	public double ausführen(double zahl1, double zahl2) {
		// TODO Auto-generated method stub
		try
		{
			if(zahl2 ==0)
				{
					throw new Exception();
				}
		
		}
		catch(Exception e)
		{
			System.err.println("Division durch null nicht möglich");
			zahl2 = 1;
		}
		return zahl1/zahl2;
	}

}
