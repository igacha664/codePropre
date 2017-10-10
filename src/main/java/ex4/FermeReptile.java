package ex4;

import java.util.List;

public class FermeReptile extends Zone{

	public FermeReptile(){
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
	
	@Override
	public double calculerKgsNourritureParJour(){
		return noms.size() * 0.1;
	}
}
