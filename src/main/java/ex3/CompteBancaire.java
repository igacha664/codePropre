package ex3;

/** Représente un compte bancaire de type compte courante (type=CC) ou livret A (type=LA)
 * @author DIGINAMIC
 */
public class CompteBancaire {

	/** solde : solde du compte */
	protected double solde;
	
	/** decouvert : un découvert est autorisé seulement pour les comptes courants */
	private double decouvert;
	

	/** Le type vaut soit CC=Compte courant, ou soit LA=Livret A */
	private TypeCompte type;
	
	/**
	 * @param solde
	 * @param decouvert
	 * @param type
	 */
	public CompteBancaire(TypeCompte type, double solde, double decouvert) {
		super();
		this.type = type;
		this.solde = solde;
		this.decouvert = decouvert;
	}
	
	/** Ajoute un montant au solde
	 * @param montant
	 */
	public void ajouterMontant(double montant){
		this.solde += montant;
	}
	
	/** Ajoute un montant au solde
	 * @param montant
	 */
	public void debiterMontant(double montant){
		if (type.equals(TypeCompte.CC)){
			if (this.solde - montant > decouvert){
				this.solde = solde - montant;
			}	
		}
		else if (type.equals(TypeCompte.LA)){
			if (this.solde - montant > 0){
				this.solde = solde - montant;
			}	
		}
	}
	

	
	/* Ce constructeur est utilisé pour créer un compte de type Livret A
	 * @param type = LA
	 * @param solde représente le solde du compte
	 * @param decouvert  représente le découvert autorisé
	 * @param tauxRemuneration  représente le taux de rémunération du livret A
	 *
	public CompteBancaire(String type, double solde, double decouvert, double tauxRemuneration) {
		super();
		this.type = type;
		this.solde = solde;
		this.decouvert = decouvert;
		this.tauxRemuneration = tauxRemuneration;
	}*/
	
	/** Getter for solde
	 * @return the solde
	 */
	public double getSolde() {
		return solde;
	}
	
	/** Setter
	 * @param solde the solde to set
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}
	/** Getter for decouvert
	 * @return the decouvert
	 */
	public double getDecouvert() {
		return decouvert;
	}
	/** Setter
	 * @param decouvert the decouvert to set
	 */
	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}

	/* Setter
	 * @param tauxRemuneration the tauxRemuneration to set
	 *
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}*/
	/** Getter for type
	 * @return the type
	 */
	public TypeCompte getType() {
		return type;
	}
	/** Setter
	 * @param type the type to set
	 */
	public void setType(TypeCompte type) {
		this.type = type;
	}
}
