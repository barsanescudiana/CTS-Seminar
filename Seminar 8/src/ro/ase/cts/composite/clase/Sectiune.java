package ro.ase.cts.composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Sectiune implements ComponentaMeniu{

	private String numeSectiune;
	private List<ComponentaMeniu> lista;
	
	public Sectiune(String numeSectiune) {
		super();
		this.numeSectiune=numeSectiune;
		this.lista=new ArrayList<ComponentaMeniu>();
	}
	@Override
	public void adaugareNod(ComponentaMeniu componenta) {
		lista.add(componenta);
		
	}
	@Override
	public void stergereNod(ComponentaMeniu componenta) {
		lista.remove(componenta);
		
	}
	@Override
	public void afiseazaInformatii() {
		System.out.println("Sectiunea " + numeSectiune);
		for(ComponentaMeniu c:lista) {
			c.afiseazaInformatii();
		}
		
	}
	@Override
	public ComponentaMeniu getComponenta(int index) throws Exception {
		if(index >=0 && index < lista.size()) 
			return lista.get(index);
		else
			throw new Exception("Index-ul nu exista!");
	}
}
