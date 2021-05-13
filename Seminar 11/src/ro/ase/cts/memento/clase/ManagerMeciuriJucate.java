package ro.ase.cts.memento.clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerMeciuriJucate {
	private List<Memento> backup;
	
	
	
	public ManagerMeciuriJucate() {
		super();
		this.backup = new ArrayList<Memento>();
	}

	public void adaugaMemento(Memento m) {
		backup.add(m);
	}
	
	public Memento getMemento(int index) {
		if(index < backup.size())
			return backup.get(index);
		else
			throw new IndexOutOfBoundsException();
	}
}
