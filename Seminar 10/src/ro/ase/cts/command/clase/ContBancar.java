package ro.ase.cts.command.clase;

public class ContBancar {
	private String destinatar;
	private float sold;
	
	public ContBancar(String destinatar) {
		super();
		this.destinatar = destinatar;
	}
	
	public void constituire(float suma) {
		this.sold = suma;
		System.out.println("S-a creat contul cu soldul " + suma);
	}
	
	public void retragere(float suma) {
		if(suma <= this.sold) {
			this.sold -= suma;
			System.out.println("S-au retras " + suma + " RON din cont.");
		} else {
			System.out.println("Fonduri insuficiente!");
		}

	}
	
	public void depunere(float suma) {
		this.sold += suma;
		System.out.println("S-au depus " + suma + " RON in cont.");
	}
	
}
