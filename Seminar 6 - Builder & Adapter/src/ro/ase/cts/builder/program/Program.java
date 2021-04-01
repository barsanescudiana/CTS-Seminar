package ro.ase.cts.builder.program;

import ro.ase.cts.builder.clase.Rezervare;
import ro.ase.cts.builder.clase.RezervareBuilder;
import ro.ase.cts.builder.clase.RezervareBuilderV2;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RezervareBuilder rezervareBuilder = new RezervareBuilder();
		Rezervare rezervare1 = rezervareBuilder.setAreBauturaInclusa(true).build();
		Rezervare rezervare2 = new RezervareBuilder().setAreMuzicaAmbientala(true).setGenMuzical("rock").build();
		
		System.out.println(rezervare1.toString());
		System.out.println(rezervare2.toString());
		
		RezervareBuilderV2 rezervareBuilderV2 = new RezervareBuilderV2();
		Rezervare rezervare3 = rezervareBuilderV2.setAreMancareInclusa(true).build();
		Rezervare rezervare4 = rezervareBuilderV2.setAreBauturaInclusa(true).build();
		
		System.out.println(rezervare3.toString());
		System.out.println(rezervare4.toString());
	}

}
