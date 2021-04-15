package ro.ase.cts.flyweight.clase;

import java.util.HashMap;
import java.util.Map;

public class FabricaFlyweight {

	private Map<String, FlyweightAbstract> clienti;

	public FabricaFlyweight() {
		super();
		this.clienti = new HashMap<String, FlyweightAbstract>();
	}
	
	public FlyweightAbstract getClient(String nrTelefon){
		Client client = (Client) clienti.get(nrTelefon);
		if(client == null) {
			client = new Client("Andrei", nrTelefon, "andrei@gmail.com");
			clienti.put(nrTelefon, client);
		}
		return client;
	}
	
}
