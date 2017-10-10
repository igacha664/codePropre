package ex2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Représente une compte
 * 
 * @author ISMAËL
 *
 */
public class ComptageStock {

	/**
	 * nb : int
	 */
	private int nb;
	/**
	 * resultat : int
	 */
	private int resultat;
	/**
	 * dateDebutComptage : Date
	 */
	private Date dateDebutComptage;
	/**
	 * dateFinComptage : String
	 */
	private String dateFinComptage;

	/**
	 * Permet d'ajouter un element
	 * 
	 * @param montant
	 */
	public void ajouterElement(int montant) {
		nb++;
		resultat += montant;
	}

	/**
	 * Affiche le status du compte
	 */
	public void afficheStatutComptage(TypeComptage type) {

		if (type != null && type.equals(TypeComptage.SOMME)) {
			afficheSomme();

		} else if (type != null && type.equals(TypeComptage.MOYENNE)) {
			afficherMoyenne();
		}

		if (dateDebutComptage != null) {
			SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			System.out.println(f.format(dateDebutComptage));
		}

		if (dateFinComptage != null) {
			System.out.println("Le comptage est clos depuis le " + dateFinComptage);
			if (nb == 0) {
				System.out.println("Le comptage est clos mais n'a pas d'éléments. Le comptage est en anomalie.");
			} else {
				System.out.println("Le comptage est clos et est OK.");
			}
		} else {
			System.out.println("Le compte est actif.");
		}
	}

	/**
	 * Affiche la moyenne
	 * 
	 */
	private void afficherMoyenne() {
		System.out.println("Ce compte est de type MOYENNE");
		System.out.println("Nombre d'élements "+nb);
		try{
			
			System.out.println("Résultat "+resultat/nb);
		}catch (ArithmeticException e) {
			e.getStackTrace();
		}
	}

	/**
	 * Affiche la somme
	 */
	private void afficheSomme() {
		// TODO Auto-generated method stub
		System.out.println("Ce comptage est de type SOMME");
		System.out.println("Nombre d'élements " + nb);

		System.out.println("Résultat " + resultat);
	}

	/**
	 * retourne la date du fin du compte
	 * 
	 * @return Date
	 */
	public Date getDateFinComptage() {
		SimpleDateFormat ff = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		if (dateFinComptage != null) {
			try {
				return ff.parse(dateFinComptage);
			} catch (ParseException e) {
				return null;
			}
		}
		return null;
	}
}
