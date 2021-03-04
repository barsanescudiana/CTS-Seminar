package ro.ase.cts.clase;

public class Zookeeper {
	private String name;
	
	public void feed(Animal animal) {
		System.out.println(this.name + " hraneste animalul " + animal.getName());
	}

	public Zookeeper(String name) {
		super();
		this.name = name;
	}
}
