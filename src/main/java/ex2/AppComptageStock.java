package ex2;

public class AppComptageStock {

	public static void main(String[] args) {
		ComptageStock cs = new ComptageStock();
		
		//cs.ajouterElement(150);
		//cs.ajouterElement(50);
		cs.afficheStatutComptage(TypeComptage.SOMME);
		System.out.println("*******************************************");
		cs.afficheStatutComptage(TypeComptage.MOYENNE);

	}

}
