package ex4;

import java.util.List;

public class Aquarium extends Zone{

	
	public Aquarium() {
		super();
	}

	@Override
	public double calculerKgsNourritureParJour(){
		return noms.size() * 0.2;
	}
}
