import static org.junit.Assert.*;

import org.junit.Test;
import org.matt.itk.Taschenrechner1.Add;




@SuppressWarnings("deprecation")
public class addTest {

	
	@Test
	public void testAdd()
	{
		Add add = new Add();
		
		float t= add.ausführen(2, 5);
	
		assertEquals("The solution should be 7", 7, t);
	}
}
