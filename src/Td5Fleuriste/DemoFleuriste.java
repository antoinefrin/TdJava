package Td5Fleuriste;

public class DemoFleuriste {

	public static void main(String[] args) {

		//Fleur fleur = new Fleur(null, 0, 0);
		
		Fleur f1 = new Fleur("Rose", 20, 3.1);
		Fleur f2 = new Fleur("Lilas", 4, 6);
		//Fleur f3 = new Fleur("Rose", 20);
		
		f1.ajoutFleur(f1);
		f2.ajoutFleur(f2);
		System.out.println(f1);
		//fleur.ajoutFleur(f3);
	}

}
