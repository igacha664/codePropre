package ex4;

public class Zoo {

	private String nom;
	private SavaneAfricaine savaneAfricaine;
	private ZoneCarnivore zoneCarnivore;
	private FermeReptile fermeReptile;
	private Aquarium aquarium;
	
	public Zoo(String nom){
		this.nom = nom;
		 savaneAfricaine = new SavaneAfricaine();
		 zoneCarnivore  = new ZoneCarnivore();
		 fermeReptile = new FermeReptile();
		 aquarium = new Aquarium();
	}
	
	public void addAnimal(String nomAnimal, TypeAnimal typeAnimal, String comportement){
		if (typeAnimal.equals(TypeAnimal.MAMMIFERE) && comportement.equals("CARNIVORE")){
			zoneCarnivore.addAnimal(typeAnimal, nomAnimal, comportement);
		}
		else if (typeAnimal.equals(TypeAnimal.MAMMIFERE) && comportement.equals("HERBIVORE")){
			savaneAfricaine.addAnimal(typeAnimal, nomAnimal, comportement);
		}
		else if (typeAnimal.equals(TypeAnimal.REPTILE)){
			fermeReptile.addAnimal(typeAnimal, nomAnimal, comportement);
		}
		else if (typeAnimal.equals(TypeAnimal.POISSON)){
			aquarium.addAnimal(typeAnimal, nomAnimal, comportement);
		}
	}
	
	public void afficherListeAnimaux(){
		savaneAfricaine.afficherListeAnimaux();
		zoneCarnivore.afficherListeAnimaux();
		fermeReptile.afficherListeAnimaux();
		aquarium.afficherListeAnimaux();
	}

	/** Getter for nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
}
