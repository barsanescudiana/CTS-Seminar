package ro.ase.cts.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import ro.ase.cts.clase.Grupa;
import ro.ase.cts.clase.IStudent;
import ro.ase.cts.clase.Student;
import ro.ase.cts.clase.dubluri.StudentDummy;

public class DummyTests {

	@Test
	public void testAdaugaStudentDummy() {
		IStudent s1 = new StudentDummy();
		Grupa grupa = new Grupa(1076);
		grupa.adaugaStudent(s1);
		assertEquals(1, grupa.getStudenti().size());
	}

}
