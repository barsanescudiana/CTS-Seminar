package ro.ase.cts.factorymethod.program;

import ro.ase.cts.factorymethod.clase.AtacantFactory;
import ro.ase.cts.factorymethod.clase.Jucator;
import ro.ase.cts.factorymethod.clase.JucatorFactory;
import ro.ase.cts.factorymethod.clase.MijlocasFactory;
import ro.ase.cts.factorymethod.clase.PortarFactory;

public class Program {

	public static void afiseazaJucator(JucatorFactory factory, String nume) {
		Jucator jucator1 = factory.creareJucator(nume);
		System.out.println(jucator1.toString());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		afiseazaJucator(new PortarFactory(), "Matei");
		afiseazaJucator(new AtacantFactory(), "Ionut");
		afiseazaJucator(new MijlocasFactory(), "Cristi");
	}

}
