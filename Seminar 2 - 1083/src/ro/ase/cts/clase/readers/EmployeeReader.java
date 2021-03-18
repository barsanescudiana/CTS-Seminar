package ro.ase.cts.clase.readers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;

public class EmployeeReader extends Reader {

	public EmployeeReader(String filename) {
		super(filename);
		// TODO Auto-generated constructor stub
	}

	public List<Aplicant> readAplicants() throws FileNotFoundException {
		Scanner input2 = new Scanner(new File(super.filename));
		input2.useDelimiter(",");
		List<Aplicant> angajati = new ArrayList<Aplicant>();

		while (input2.hasNext()) {
			Angajat a = new Angajat();
			super.readAplicant(a, input2);
			int salariu = input2.nextInt();
			a.setSalariu(salariu);
			String ocupatie = input2.next();
			a.setOcupatie(ocupatie);
			angajati.add(a);
		}
		input2.close();
		return angajati;
	}

}
