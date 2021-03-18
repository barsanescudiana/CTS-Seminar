package ro.ase.cts.clase;

import java.util.Arrays;

public class Elev extends Aplicant {
	private int clasa;
	private String tutore;
	private static float sumaFinantata = 30;

	public int getClasa() {
		return clasa;
	}

	public void setClasa(int i) {
		this.clasa = i;
	}

	public String getTutore() {
		return tutore;
	}

	public void setTutore(String tutore) {
		this.tutore = tutore;
	}

	public static void setFinantare(float sumaFinantata) {
		Elev.sumaFinantata = sumaFinantata;
	}
	
	public static float getFinantare() {
		return Elev.sumaFinantata;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Elev: ");
		sb.append(super.toString()).append("Clasa=").append(clasa).append(", Tutore=").append(tutore);
		return sb.toString();
	}

	public Elev() {
		super();
	}

	public Elev(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumireProiect,
			int clasa, String tutore) {
		super(nume, prenume, varsta, punctaj, nr_proiecte, denumireProiect);
		this.clasa = clasa;
		this.tutore = tutore;
	}

	public int finantare() {
		int s = 30;
		System.out.println("Elevul " + getNume() + " " + getPrenume() + " primeste" + s + " Euro/zi in proiect.");
		return s;
	}

	@Override
	public float getSumaFinantata() {
		return Elev.sumaFinantata;
	}

}
