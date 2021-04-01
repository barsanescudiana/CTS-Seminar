package ro.ase.cts.adapter.clase;

public class BiletAdapter extends Bilet implements BiletOnline{

	public BiletAdapter(float pret) {
		super(pret);
	}

	@Override
	public void vindeBiletOnline() {
		super.vinde();
		
	}

	@Override
	public void rezervaBiletOnline() {
		super.rezerva();
	}

}
