package ex3;

public class LivretA extends CompteBancaire {

	/** tauxRemuneration : taux de rémunération dans le cas d'un livret A */
	private double tauxRemuneration;
	
	/**
	 * Constructeur Livret A, fait appel à la classe mère avec decouvert = 0
	 * @param type : see TypeCompte
	 * @param solde : double
	 * @param tauxRemuneration : double
	 */
	public LivretA(TypeCompte type, double solde, double tauxRemuneration) {
		super(type, solde, 0);
		this.solde = solde;
		this.tauxRemuneration = tauxRemuneration;
	}
	
	
	public void appliquerRemuAnnuelle(){
		this.solde = solde + solde*tauxRemuneration/100;
	}

	
	/** Getter for tauxRemuneration
	 * @return the tauxRemuneration
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}
}
