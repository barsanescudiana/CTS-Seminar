package ro.ase.cts.composite.program;

import ro.ase.cts.composite.clase.ComponentaMeniu;
import ro.ase.cts.composite.clase.Item;
import ro.ase.cts.composite.clase.Sectiune;

public class Program {

	public static void main(String[] args) {
		ComponentaMeniu meniu = new Sectiune("Meniu");
		
		ComponentaMeniu sectiuneBauturi = new Sectiune("Bauturi");
		ComponentaMeniu sectiuneDesert = new Sectiune("Desert");
		
		ComponentaMeniu frappe = new Item("Frappe");
		ComponentaMeniu clatite = new Item("Clatite");
		ComponentaMeniu cola = new Item("Cola");
		
		sectiuneBauturi.adaugareNod(frappe);
		sectiuneBauturi.adaugareNod(cola);
		
		sectiuneDesert.adaugareNod(clatite);
		
		meniu.adaugareNod(sectiuneBauturi);
		meniu.adaugareNod(sectiuneDesert);
		
		meniu.afiseazaInformatii();
	
		sectiuneBauturi.stergereNod(frappe);
		sectiuneDesert.adaugareNod(frappe);
		
		meniu.afiseazaInformatii();

	}

}
