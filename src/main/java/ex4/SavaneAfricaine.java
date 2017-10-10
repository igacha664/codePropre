package ex4;

import java.util.List;

public class SavaneAfricaine extends Zone {

	public SavaneAfricaine(){
		super();
	}
	public void addAnimal(TypeAnimal typeAnimal, String nomAnimal, String comportement) {
		types.add(typeAnimal);
		noms.add(nomAnimal);
		comportements.add(comportement);
	}
	
	
	public int compterAnimaux(){
		return noms.size();
	}
	
	/**
	 * return int mais à caster au moment de l'appel
	 */
	@Override
	public double calculerKgsNourritureParJour(){
		return noms.size() * 10;
	}
}
