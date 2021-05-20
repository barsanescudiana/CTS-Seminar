package ro.ase.cts.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import ro.ase.cts.clase.Student;

public class StudentTests {

	@Test
	public void testConstructorParametru() {
		String nume = "Gigel";
		Student student = new Student(nume);
		assertEquals(nume, student.getNume());
	}
	
	@Test
	public void testConstructorDefault() {
		Student student = new Student();
		assertEquals("Student", student.getNume());
	}
	
	@Test
	public void testAdaugaNota() {
		Student student = new Student();
		student.adaugaNota(5);
		assertEquals(1, student.getNote().size());
	}
	
	@Test
	public void testAdaugaNotaValoare() {
		Student student = new Student();
		int nota = 10;
		student.adaugaNota(nota);
		assertEquals(nota, student.getNota(0));
	}
	
	@Test
	public void testAreRestante() {
		Student student = new Student();
		student.adaugaNota(8);
		student.adaugaNota(3);
		assertTrue("Studentul ar trebui sa aiba restanta", student.areRestante());
				
	}
	
	@Test
	public void testNuAreRestante() {
		Student student = new Student();
		student.adaugaNota(8);
		student.adaugaNota(7);
		assertFalse("Studentul nu ar trebui sa aiba restanta", student.areRestante());
	}

}
