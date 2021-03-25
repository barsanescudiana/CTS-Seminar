package ro.ase.cts.program;

import ro.ase.cts.clase.Jucator;
import ro.ase.cts.clase.JucatorFactory;
import ro.ase.cts.clase.TipJucator;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			Jucator jucator1 = JucatorFactory.createJucator(TipJucator.Fundas, "Mihai");
			Jucator jucator2 = JucatorFactory.createJucator(TipJucator.Portar, "Adrian");
			
			System.out.println(jucator1.toString());
			System.out.println(jucator2.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
