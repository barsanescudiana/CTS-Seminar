package ro.ase.cts.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import ro.ase.cts.clase.Grupa;
import ro.ase.cts.clase.IStudent;
import ro.ase.cts.clase.dubluri.StudentDummy;
import ro.ase.cts.clase.dubluri.StudentStub;

public class StubTests {

	@Test
	public void testGetPromovabilitateStub() {
		IStudent s1 = new StudentStub();
		Grupa grupa = new Grupa(1076);
		grupa.adaugaStudent(s1);
		assertEquals(1, grupa.getPromovabilitate(), 0.01);
	}

}
