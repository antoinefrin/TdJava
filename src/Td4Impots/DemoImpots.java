package Td4Impots;

import java.util.*;

public class DemoImpots {

	public static void main(String[] args) {
		
		Habitation h1 = new Habitation("Didier Dupont", "4 rue robert Lille", 25.6);
		HabitationIdividuelle h2 = new HabitationIdividuelle("Didier Dupont", "4 rue robert Lille", 25.6, 3);
		HabitationIdividuelle h3 = new HabitationIdividuelle("Didier Robert", "85 avenue robert La Madeleine", 10, 5);
		//HabitationIdividuelle h4 = new HabitationIdividuelle("Didier Robert", "85 avenue robert La Madeleine", 20, 5, true);
		HabitationIdividuelle h5 = new HabitationIdividuelle("Didier Robert", "85 avenue robert La Madeleine", 10, 1);
		
		//h1.afficher();
		//h2.afficher();
		//h3.afficher();
		//h4.afficher();
		h5.afficher();
		System.out.println();
		
	}

}
