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
	public void testAdaugaNotaIncorecta() {
		Student student = new Student();
		int nota = 14;
		try {
			student.adaugaNota(nota);
			fail("Nota incorecta");
		} catch (IllegalArgumentException err) {
			
		}
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testAdaugaNotaIncorectaJUnit4() {
		Student student = new Student();
		student.adaugaNota(14);
	}
	
	@Test
	public void testCalculeazaMedie() {
		Student student = new Student();
		student.adaugaNota(5);
		student.adaugaNota(7);
		float medie = 6.0f;
		assertEquals(medie, student.calculeazaMedie(), 0.01);
	}
	
	@Test
	public void testCalculeazaMedieFaraNote() {
		Student student = new Student();
		assertEquals(0, student.calculeazaMedie(), 0.01);
	}
	
	@Test
	public void testCalculeazaMedieONota() {
		Student student = new Student();
		int nota = 5;
		student.adaugaNota(nota);
		assertEquals(nota, student.calculeazaMedie(), 0.01);
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
