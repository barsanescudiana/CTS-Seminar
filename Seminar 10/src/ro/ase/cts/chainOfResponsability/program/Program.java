package ro.ase.cts.chainOfResponsability.program;

import ro.ase.cts.chainOfResponsability.clase.Cont;
import ro.ase.cts.chainOfResponsability.clase.ContCurent;
import ro.ase.cts.chainOfResponsability.clase.ContDeCredit;
import ro.ase.cts.chainOfResponsability.clase.ContEconomii;
import ro.ase.cts.chainOfResponsability.clase.ContIndisponibil;

public class Program {

	public static void main(String args[]) {
		Cont contCurent = new ContCurent("Diana", 100);
		Cont contEconomii = new ContEconomii("Diana", 200);
		Cont contCredit = new ContDeCredit("Diana", 500);
		Cont contIndisponibil = new ContIndisponibil("Diana");
		
		contCurent.setSuccesor(contEconomii);
		contEconomii.setSuccesor(contCredit);
		contCredit.setSuccesor(contIndisponibil);
		
		contCurent.realizarePlata(50);
		contCurent.realizarePlata(100);
		contCurent.realizarePlata(300);
		contCurent.realizarePlata(600);
	}
}
