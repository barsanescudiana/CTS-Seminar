package ro.ase.cts.clase.dubluri;

import java.util.List;

import ro.ase.cts.clase.IStudent;

public class StudentFake implements IStudent{

	String valoareGetNume;
	float valoareGetMedie;
	boolean valoareAreRestanta;
	
	
	
	public StudentFake() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setValoareGetNume(String valoareGetNume) {
		this.valoareGetNume = valoareGetNume;
	}

	public void setValoareGetMedie(float valoareGetMedie) {
		this.valoareGetMedie = valoareGetMedie;
	}

	public void setValoareAreRestanta(boolean valoareAreRestanta) {
		this.valoareAreRestanta = valoareAreRestanta;
	}

	@Override
	public String getNume() {
		return valoareGetNume;
	}

	@Override
	public void setNume(String nume) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Integer> getNote() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void adaugaNota(int nota) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public float calculeazaMedie() {
		return valoareGetMedie;
	}

	@Override
	public int getNota(int index) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean areRestante() {
		// TODO Auto-generated method stub
		return valoareAreRestanta;
	}

}
