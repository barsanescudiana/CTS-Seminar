package ro.ase.cts.adapter.clase;

public class AdapterObiect implements BiletOnline{

	private Bilet bilet;
	
	
	
	public AdapterObiect(Bilet bilet) {
		super();
		this.bilet = bilet;
	}

	@Override
	public void vindeBiletOnline() {
		bilet.vinde();
		
	}

	@Override
	public void rezervaBiletOnline() {
		bilet.rezerva();
	}
	
}
