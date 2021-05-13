package ro.ase.cts.template.program;

import ro.ase.cts.template.clase.SpectatorHandicap;
import ro.ase.cts.template.clase.SpectatorUzual;
import ro.ase.cts.template.clase.TemplateIntrareStadion;

public class Program {

	public static void main(String[] args) {
		TemplateIntrareStadion spectatorU = new SpectatorUzual("Ion");
		TemplateIntrareStadion spectatorH = new SpectatorHandicap("Mihai");
		
		spectatorU.intrareStadion();
		spectatorH.intrareStadion();
		
		

	}

}
