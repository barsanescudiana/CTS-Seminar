package ro.ase.cts.memento.program;

import ro.ase.cts.memento.clase.ManagerMeciuriJucate;
import ro.ase.cts.memento.clase.MeciJucat;

public class Program {

	public static void main(String[] args) {
		MeciJucat meciJucat = new MeciJucat("Steaua", "Dinamo", 500, 500, 150, 50);
		
		ManagerMeciuriJucate manager = new ManagerMeciuriJucate();
		manager.adaugaMemento(meciJucat.salvareInformatii());
		
		meciJucat.setNrSpectatori(300);
		meciJucat.setEchipaGazda("Chiajna");
		meciJucat.setEchipaOaspeti("Chindia Targviste");
		
		manager.adaugaMemento(meciJucat.salvareInformatii());
		
		System.out.println(meciJucat.toString());
		
		meciJucat.revenire(manager.getMemento(0));
		System.out.println(meciJucat.toString());

	}

}
