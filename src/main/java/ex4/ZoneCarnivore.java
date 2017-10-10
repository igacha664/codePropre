package ex4;

import java.util.List;

public class ZoneCarnivore extends Zone {

	
	public ZoneCarnivore() {
		super();
	}

	@Override
	public double calculerKgsNourritureParJour() {
		return noms.size() * 10;
	}
	
	public void addAnimal(TypeAnimal typeAnimal, String nomAnimal, String comportement) {
		types.add(typeAnimal);
		noms.add(nomAnimal);
		comportements.add(comportement);
	}
	/*
	public void afficherListeAnimaux(){
		for (String nom: noms){
			System.out.println(nom);
		}
	}
	
	public double calculerKgsNourritureParJour(){
		return noms.size() * 10;
	}*/
}
