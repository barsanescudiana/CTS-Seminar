package ro.ase.cts.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ro.ase.cts.clase.Grupa;
import ro.ase.cts.clase.Student;

public class GrupaTests {

	
	
	@Test
	public void testConstructorRight() {
		Grupa grupa = new Grupa(1076);
		assertEquals(1076, grupa.getNrGrupa());
	}

	@Test
	public void testConstructorBoundaryInf() {
		Grupa grupa = new Grupa(1000);
		assertEquals(1000, grupa.getNrGrupa());

	}

	@Test
	public void testConstructorBoundarySup() {
		Grupa grupa = new Grupa(1100);
		assertEquals(1100, grupa.getNrGrupa());

	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testConstructorError() {
		Grupa grupa = new Grupa(1110);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testConstructorErrorSubOMie() {
		Grupa grupa = new Grupa(999);
	}

	@Test(timeout = 500)
	public void testConstructorPerformance() {
		Grupa grupa = new Grupa(1076);
	}
	
	//correct
	@Test
	public void testConstructorLista() {
		Grupa grupa = new Grupa(1076);
		assertNotNull(grupa.getStudenti());
	}
	
	@Test
	public void testPromovabilitateRight() {
		Grupa grupa = new Grupa(1076);
		for(int i = 0; i<=7; i++) {
			Student student = new Student("Diana");
			student.adaugaNota(4);
			student.adaugaNota(7);
			student.adaugaNota(3);
			grupa.adaugaStudent(student);
		}
		for(int i = 0; i<=5; i++) {
			Student student = new Student("Anca");
			student.adaugaNota(9);
			student.adaugaNota(8);
			student.adaugaNota(10);
			grupa.adaugaStudent(student);
		}
		assertEquals(0.42, grupa.getPromovabilitate(), 0.01);
	}
	
	@Test
	public void testPromovabilitateBoundaryInf() {
		Grupa grupa = new Grupa(1076);
		for(int i = 0; i<=7; i++) {
			Student student = new Student("Diana");
			student.adaugaNota(4);
			student.adaugaNota(7);
			student.adaugaNota(3);
			grupa.adaugaStudent(student);
		}
		assertEquals(0.0, grupa.getPromovabilitate(), 0.01);
	}
	
	@Test
	public void testPromovabilitateBoundarySup() {
		Grupa grupa = new Grupa(1076);
		for(int i = 0; i<=5; i++) {
			Student student = new Student("Anca");
			student.adaugaNota(9);
			student.adaugaNota(8);
			student.adaugaNota(10);
			grupa.adaugaStudent(student);
		}
		assertEquals(1.0, grupa.getPromovabilitate(), 0.01);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testPromovabilitateError() {
		Grupa grupa = new Grupa(1075);
		grupa.getPromovabilitate();
	}

}