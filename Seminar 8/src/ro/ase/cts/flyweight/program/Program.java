package ro.ase.cts.flyweight.program;

import ro.ase.cts.flyweight.clase.Client;
import ro.ase.cts.flyweight.clase.FabricaFlyweight;
import ro.ase.cts.flyweight.clase.Rezervare;

public class Program {

	public static void main(String[] args) {
		Rezervare rezervare1 = new Rezervare(1, 3, 1);
		Rezervare rezervare2 = new Rezervare(1, 2, 5);
		Rezervare rezervare3 = new Rezervare(1, 5, 2);
		
		FabricaFlyweight fabrica = new FabricaFlyweight();
		Client client = (Client) fabrica.getClient("0733946568");
		client.afiseazaInformatii(rezervare1);
		
		Client client2 = (Client) fabrica.getClient("0733946488");
		client2.afiseazaInformatii(rezervare2);
		
		fabrica.getClient("0733946568").afiseazaInformatii(rezervare3);


	}

}
