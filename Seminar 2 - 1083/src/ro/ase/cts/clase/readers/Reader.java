package ro.ase.cts.clase.readers;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.clase.Aplicant;

public abstract class Reader {

	protected String filename;

	public Reader(String filename) {
		super();
		this.filename = filename;
	}

	public abstract List<Aplicant> readAplicants() throws FileNotFoundException;

	public void readAplicant(Aplicant aplicant, Scanner input) {
		String nume = input.next();
		String prenume = (input.next()).toString();
		int varsta = Integer.valueOf(input.nextInt());
		int punctaj = Integer.valueOf(input.nextInt());
		int nr = Integer.valueOf(input.nextInt());
		String[] vect = new String[nr];
		for (int i = 0; i < nr; i++)
			vect[i] = input.next();

		aplicant.setNume(nume);
		aplicant.setPrenume(prenume);
		aplicant.setVarsta(varsta);
		aplicant.setPunctaj(punctaj);
		aplicant.setDenumiriProiecte(vect, nr);
	}
}
