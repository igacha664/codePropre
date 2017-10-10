package ex4;

import java.util.ArrayList;
import java.util.List;

public abstract class Zone implements KgNouritureParJour {
	
	protected List<TypeAnimal> types;
	protected List<String> noms;
	protected List<String> comportements;
	
	public Zone() {
		super();
		this.types = new ArrayList<>();
		this.comportements = new ArrayList<>();
		this.noms = new ArrayList<>();
	}

	public void addAnimal(TypeAnimal typeAnimal, String nomAnimal, String comportement) {
		types.add(typeAnimal);
		noms.add(nomAnimal);
		comportements.add(comportement);
	}
	
	public void afficherListeAnimaux(){
		for (String nom: noms){
			System.out.println(nom);
		}
	}
	

}
