package Td4Impots;

public class DemoHabitation {

	public static void main(String[] args) {
		
		Habitation h1 = new Habitation("Didier Dupont", "4 rue robert Lille", 25.6);
		HabitationIdividuelle h2 = new HabitationIdividuelle("Didier Robert", "85 avenue robert La Madeleine", 10, 2, false);
		
		System.out.println(h1);
		System.out.println(h1.impots());
		
		System.out.println(h2);
		System.out.println(h2.impots());
		h2.afficher();
		
		HabitationProfessionnelle hp1 = new HabitationProfessionnelle(" Afpa", " Roubaix ", 25.6, 25);
		System.out.println(hp1);
		System.out.println("Impôts pro "+ hp1.impots() +"€");
	
		Commune c = new Commune();
		c.ajoutHabitation(hp1);
		c.ajoutHabitation(hp1);
		
		
	}
}
