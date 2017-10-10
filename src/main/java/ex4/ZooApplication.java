package ex4;

public class ZooApplication {

	public static void main(String[] args) {
		Zoo zoo = new Zoo("Thoiry");
		
		zoo.addAnimal("Gazelle", TypeAnimal.MAMMIFERE, "HERBIVORE");
		zoo.addAnimal("Zèbre", TypeAnimal.MAMMIFERE, "HERBIVORE");
		zoo.addAnimal("Lion", TypeAnimal.MAMMIFERE, "HERBIVORE");
		zoo.addAnimal("Panthère", TypeAnimal.MAMMIFERE, "CARNIVORE");
		zoo.addAnimal("Requin blanc", TypeAnimal.POISSON, "HERBIVORE");
		zoo.addAnimal("Truite dorée", TypeAnimal.POISSON, "HERBIVORE");
		zoo.addAnimal("Boa constrictor", TypeAnimal.SERPENT, "CARNIVORE");
		zoo.addAnimal("Python", TypeAnimal.SERPENT, "CARNIVORE");
		
		zoo.afficherListeAnimaux();
		System.out.println("OK ! ");
	}

}
