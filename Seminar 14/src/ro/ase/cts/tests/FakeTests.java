package ro.ase.cts.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import ro.ase.cts.clase.Grupa;
import ro.ase.cts.clase.IStudent;
import ro.ase.cts.clase.dubluri.StudentFake;
import ro.ase.cts.tests.categories.TesteGetPromovabilitate;

public class FakeTests {

	@Test
	@Category(TesteGetPromovabilitate.class)
	public void testPromovabilitateRight() {
		Grupa grupa = new Grupa(1076);
		for ( int i = 0; i< 8; i++) {
			StudentFake s = new StudentFake();
			s.setValoareAreRestanta(false);
			grupa.adaugaStudent(s);
		}
		for ( int i = 0; i< 2; i++) {
			StudentFake s = new StudentFake();
			s.setValoareAreRestanta(true);
			grupa.adaugaStudent(s);
		}
		
		assertEquals(0.8, grupa.getPromovabilitate(), 0.01);
	}

}
