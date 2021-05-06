package ro.ase.cts.command.clase;

public abstract class Command {
	protected ContBancar cont;
	protected float suma;
	
	public Command(ContBancar cont, float suma) {
		super();
		this.cont = cont;
		this.suma = suma;
	}

	public abstract void executa();
}
