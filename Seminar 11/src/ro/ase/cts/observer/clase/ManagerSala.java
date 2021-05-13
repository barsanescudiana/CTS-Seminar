package ro.ase.cts.observer.clase;

public class ManagerSala extends Subiect{
	public void anuntaMeci(String tipMeci) {
		super.notificaClient("A fost programat un nou meci de " + tipMeci);
	}

}
