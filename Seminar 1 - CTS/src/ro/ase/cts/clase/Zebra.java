package ro.ase.cts.clase;

public class Zebra extends Animal{
	private boolean cuDungi;

	public Zebra(String name) {
		super(name);
		cuDungi = true;
	}

	public Zebra(String name, boolean cuDungi) {
		super(name);
		this.cuDungi = cuDungi;
	}
}
