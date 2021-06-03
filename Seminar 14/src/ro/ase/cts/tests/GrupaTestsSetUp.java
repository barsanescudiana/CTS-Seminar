package ro.ase.cts.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import ro.ase.cts.clase.Grupa;
import ro.ase.cts.clase.Student;
import ro.ase.cts.tests.categories.TesteGetPromovabilitate;

public class GrupaTestsSetUp {

Grupa grupa;
	
	@Before
	public void setUp() throws Exception {
		grupa = new Grupa(1076);
		for(int i = 0; i<=35; i++) {
			Student student = new Student("Anca");
			student.adaugaNota(9);
			student.adaugaNota(8);
			student.adaugaNota(10);
			student.adaugaNota(9);
			student.adaugaNota(8);
			student.adaugaNota(10);
			student.adaugaNota(8);
			student.adaugaNota(10);
			grupa.adaugaStudent(student);
		}
	}
	
	@Test(timeout = 500)
	@Category(TesteGetPromovabilitate.class)
	public void testPromovabilitatePerformance() {
		grupa.getPromovabilitate();
	}

}
