package ro.ase.cts.factorymethod.clase;

public class PortarFactory implements JucatorFactory {

	@Override
	public Jucator creareJucator(String nume) {
		// TODO Auto-generated method stub
		return new Portar(nume);
	}

}
