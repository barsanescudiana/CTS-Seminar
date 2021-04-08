package ro.ase.cts.decorator.clase;

public class DecoratorMesajSarbatoare extends DecoratorAbstract{

	public DecoratorMesajSarbatoare(BiletAbstract biletAbstract) {
		super(biletAbstract);
	}

	@Override
	public void rezervaBilet() {
		super.rezervaBilet();
		System.out.println("La multi ani!");
	}

	
}
