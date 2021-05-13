package ro.ase.cts.memento.clase;

public class Memento {
	private int nrSpectatori;
	private String echipaGazda;
	private String echipaOaspeti;
	public Memento(int nrSpectatori, String numeGazda, String numeOaspeti) {
		super();
		this.nrSpectatori = nrSpectatori;
		this.echipaGazda = numeGazda;
		this.echipaOaspeti = numeOaspeti;
	}
	public int getNrSpectatori() {
		return nrSpectatori;
	}
	public void setNrSpectatori(int nrSpectatori) {
		this.nrSpectatori = nrSpectatori;
	}
	public String getNumeGazda() {
		return echipaGazda;
	}
	public void setNumeGazda(String numeGazda) {
		this.echipaGazda = numeGazda;
	}
	public String getNumeOaspeti() {
		return echipaOaspeti;
	}
	public void setNumeOaspeti(String numeOaspeti) {
		this.echipaOaspeti = numeOaspeti;
	}
	
	
}
