package ro.ase.cts.clase.readers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Student;

public class StudentReader extends Reader {

	public StudentReader(String filename) {
		super(filename);
		// TODO Auto-generated constructor stub
	}

	public List<Aplicant> readAplicants() throws FileNotFoundException, NumberFormatException {
		Scanner input = new Scanner(new File(super.filename));
		input.useDelimiter(",|\n");
		List<Aplicant> studenti = new ArrayList<Aplicant>();

		while (input.hasNext()) {
			Student s = new Student();
			super.readAplicant(s, input);
			int an_studii = input.nextInt();
			s.setAn_studii(an_studii);
			String facultate = (input.next()).toString();
			s.setNume(facultate);
			studenti.add(s);
		}
		input.close();
		return studenti;
	}

}
