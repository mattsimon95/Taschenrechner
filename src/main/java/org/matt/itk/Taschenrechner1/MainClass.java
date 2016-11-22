package org.matt.itk.Taschenrechner1;
import java.util.*;


public class MainClass {
	
	public MainClass()
	{
		BerechnungAusfuehren be;
	}

	public static void  main(String[] args) {
		// TODO Auto-generated method stub
		BerechnungAusfuehren be = new BerechnungAusfuehren();
		Scanner scan = new Scanner(System.in);
		boolean eingabe=true;
		do
		{
			System.out.println("Ergebniss "+be.rechnungAusfuehren());
			System.out.println("Wollen Sie weitere Berechnungen ausführen! 0= Nein 1= Ja");
			int i = scan.nextInt();
			if(i==0)
			{
				eingabe = false;
				System.out.println("Taschenrechner-Programm wird beendet");
			}
			else if(i==1)
			{
				eingabe = true;
			}
			else
			{
				//Exception
			}
		}while(eingabe == true);
	}


}
