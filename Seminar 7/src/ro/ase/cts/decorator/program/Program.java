package ro.ase.cts.decorator.program;

import ro.ase.cts.decorator.clase.Bilet;
import ro.ase.cts.decorator.clase.DecoratorAbstract;
import ro.ase.cts.decorator.clase.DecoratorMesajSarbatoare;
import ro.ase.cts.decorator.clase.DecoratorMesajSustinere;

public class Program {

	public static void main(String[] args) {
		Bilet bilet = new Bilet("FCSB", "Dinamo", "Ionut");
		bilet.rezervaBilet();
		
		DecoratorMesajSustinere decorator = new DecoratorMesajSustinere(bilet);
		decorator.rezervaBilet();
		
		DecoratorMesajSarbatoare decoratorSarbatoare = new DecoratorMesajSarbatoare(bilet);
		System.out.println("\n");
		decoratorSarbatoare.rezervaBilet();
		
		DecoratorAbstract decorator3 = new DecoratorMesajSarbatoare(decorator);
		System.out.println("\n");
		decorator3.rezervaBilet();

	}

}
