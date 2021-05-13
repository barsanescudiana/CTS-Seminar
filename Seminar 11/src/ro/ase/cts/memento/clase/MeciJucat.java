package ro.ase.cts.memento.clase;

public class MeciJucat {
	private String echipaGazda;
	private String echipaOaspeti;
	private int nrSpectatori;
	private int nrBileteVandute;
	private int nrSticleApaVandute;
	private int nrJandarmi;
	
	public MeciJucat(String echipaGazda, String echipaOaspeti, int nrSpectatori, int nrBileteVandute,
			int nrSticleApaVandute, int nrJandarmi) {
		super();
		this.echipaGazda = echipaGazda;
		this.echipaOaspeti = echipaOaspeti;
		this.nrSpectatori = nrSpectatori;
		this.nrBileteVandute = nrBileteVandute;
		this.nrSticleApaVandute = nrSticleApaVandute;
		this.nrJandarmi = nrJandarmi;
	}
	
	public void setEchipaGazda(String echipaGazda) {
		this.echipaGazda = echipaGazda;
	}

	public void setEchipaOaspeti(String echipaOaspeti) {
		this.echipaOaspeti = echipaOaspeti;
	}

	public void setNrSpectatori(int nrSpectatori) {
		this.nrSpectatori = nrSpectatori;
	}

	public void setNrBileteVandute(int nrBileteVandute) {
		this.nrBileteVandute = nrBileteVandute;
	}

	public void setNrSticleApaVandute(int nrSticleApaVandute) {
		this.nrSticleApaVandute = nrSticleApaVandute;
	}

	public void setNrJandarmi(int nrJandarmi) {
		this.nrJandarmi = nrJandarmi;
	}

	public Memento salvareInformatii() {
		Memento memento = new Memento(nrSpectatori, echipaGazda, echipaOaspeti);
		return memento;
	}
	
	public void revenire(Memento memento) {
		this.nrSpectatori = memento.getNrSpectatori();
		this.echipaGazda = memento.getNumeGazda();
		this.echipaOaspeti = memento.getNumeOaspeti();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MeciJucat [echipaGazda=");
		builder.append(echipaGazda);
		builder.append(", echipaOaspeti=");
		builder.append(echipaOaspeti);
		builder.append(", nrSpectatori=");
		builder.append(nrSpectatori);
		builder.append(", nrBileteVandute=");
		builder.append(nrBileteVandute);
		builder.append(", nrSticleApaVandute=");
		builder.append(nrSticleApaVandute);
		builder.append(", nrJandarmi=");
		builder.append(nrJandarmi);
		builder.append("]");
		return builder.toString();
	}
	
	
}
