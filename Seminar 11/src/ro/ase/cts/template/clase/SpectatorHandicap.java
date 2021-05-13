package ro.ase.cts.template.clase;

public class SpectatorHandicap extends TemplateIntrareStadion{

	private String nume; 
	
	public SpectatorHandicap(String nume) {
		super();
		this.nume = nume;
	}

	@Override
	public void asezareCoada() {
		System.out.println("Spectator " + nume + " a fost preluat de la coada");
		
	}

	@Override
	public void prezentareBilet() {
		System.out.println("Spectator " + nume + " a prezentat biletul");
		
	}

	@Override
	public void controlCorporal() {
		System.out.println("Spectator " + nume + " a fost controlat. Cariciorul a fost controlat");
		
	}

	@Override
	public void ocupareLoc() {
		System.out.println("Spectator " + nume + " a ocupat locul special");
		
	}

}
