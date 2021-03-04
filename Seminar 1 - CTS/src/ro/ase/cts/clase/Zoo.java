package ro.ase.cts.clase;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
	private Zookeeper zookeeper;
	private List<Animal> animals;
	
	public Zoo() {
		super();
		this.zookeeper = new Zookeeper("Gigel");
		this.animals = new ArrayList<>();
	}
	
	public Zoo(Zookeeper zookeeper, List<Animal> animals) {
		super();
		this.zookeeper = zookeeper;
		this.animals = animals;
	}

	public Zookeeper getZookeeper() {
		return zookeeper;
	}

	public void setZookeeper(Zookeeper zookeeper) {
		this.zookeeper = zookeeper;
	}

	public List<Animal> getAnimals() {
		return animals;
	}

	public void setAnimalList(List<Animal> animals) {
		this.animals = animals;
	}
	
	public void addAnimal(Animal animal) {
		if (animal != null) this.animals.add(animal);
	}
	
	public void feedAllAnimals() {
		for (Animal animal : this.animals) {
			this.zookeeper.feed(animal);
		}
	}
	
}
