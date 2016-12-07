package Taschenrechner1;

import org.matt.itk.Taschenrechner1.Add;
import org.matt.itk.Taschenrechner1.Division;

import junit.framework.*;



public class JunitTest extends TestCase
{
	protected double a, b, ergebniss;
	
	protected void setUp(){
		
		a= 3.0;
		b=5;
		
		}
	
	public void testAdd()
	{
		Add add = new Add();
		ergebniss = 8.0;
		assertEquals(ergebniss, add.ausführen(a, b));
		
	}
	public void testDiv()
	{
		Division  div = new Division();
		ergebniss = 0.6;
		assertEquals(ergebniss, div.ausführen(a, b));
		
	}
}

	
