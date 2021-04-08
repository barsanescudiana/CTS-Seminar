package ro.ase.cts.decorator.clase;

public class DecoratorMesajSustinere extends DecoratorAbstract{

	public DecoratorMesajSustinere(BiletAbstract biletAbstract) {
		super(biletAbstract);
	}

	@Override
	public void rezervaBilet() {
		super.rezervaBilet();
		System.out.println("Sustinem " + ((Bilet)(super.getBiletAbstract())).getNumeGazda() + "!");
	}

	
}
