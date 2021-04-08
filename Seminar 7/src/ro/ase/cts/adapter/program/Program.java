package ro.ase.cts.adapter.program;

import ro.ase.cts.adapter.clase.AdapterObiect;
import ro.ase.cts.adapter.clase.Bilet;
import ro.ase.cts.adapter.clase.BiletOnline;

public class Program {

	public static void rezervaSiVindeBiletOnline(BiletOnline biletOnline) {
		System.out.println("Online");
		biletOnline.rezervaBiletOnline();
		biletOnline.vindeBiletOnline();
	}
	
	public static void rezervaSiVindeBiletLaCasa(Bilet bilet) {
		System.out.println("La casa");
		bilet.rezerva();
		bilet.vinde();
	}
	
	public static void main(String[] args) {
		Bilet bilet = new Bilet(30f);
		AdapterObiect adaptor = new AdapterObiect(bilet);
		
		rezervaSiVindeBiletOnline(adaptor);
	}

}
