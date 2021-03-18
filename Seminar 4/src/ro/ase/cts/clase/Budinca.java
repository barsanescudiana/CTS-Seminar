package ro.ase.cts.clase;

public class Budinca {
	private String aroma;
	private int gramaj;
	private boolean esteVegana;

	private static Budinca instance = null;

	private Budinca(String aroma, int gramaj, boolean esteVegana) {
		super();
		this.aroma = aroma;
		this.gramaj = gramaj;
		this.esteVegana = esteVegana;
	}

	public static synchronized Budinca getInstance(String aroma, int gramaj, boolean esteVegana) {
		if (instance == null) {
			instance = new Budinca(aroma, gramaj, esteVegana);
		}
		return instance;
	}

	public void setAroma(String aroma) {
		this.aroma = aroma;
	}

	public void setGramaj(int gramaj) {
		this.gramaj = gramaj;
	}

	public void setEsteVegana(boolean esteVegana) {
		this.esteVegana = esteVegana;
	}

	@Override
	public String toString() {
		return "Budinca [aroma=" + aroma + ", gramaj=" + gramaj + ", esteVegana=" + esteVegana + "]";
	}
	
	
}
