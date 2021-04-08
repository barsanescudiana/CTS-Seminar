package ro.ase.cts.facade.program;

import ro.ase.cts.facade.clase.BazaDeDateHuligani;
import ro.ase.cts.facade.clase.Bilet;
import ro.ase.cts.facade.clase.Facade;
import ro.ase.cts.facade.clase.Persoana;
import ro.ase.cts.facade.clase.Politie;

public class Program {

	public static void main(String[] args) {
		Persoana p1 = new Persoana("Andrei", "2990516788245");
		Bilet b1 = new Bilet("Andrei", "1A");
		
		if(p1.getNume().equals(b1.getNume())) {
			if(!Politie.esteUrmarita(p1)) {
				if(!BazaDeDateHuligani.esteInListaDeHuligani(p1)) {
					System.out.println("Intrati in stadion!");
				} else {
					System.out.println(p1.getNume() + " este pe lista de huligani!");
				}
			} else {
				System.out.println(p1.getNume() + " este urmarita de politie!");
			}
		}
		
		Persoana p2 = new Persoana("Matei", "1970516788355");
		Bilet b2 = new Bilet("Matei", "1A");
		if(Facade.sePermiteAccesulPeStadion(p2, b2)) {
			System.out.println("Se permite accesul pentru " + p2.getNume() + "!");
		} else {
			System.out.println("Ne pare rau, nu aveti voie!");
		}
	}

}
