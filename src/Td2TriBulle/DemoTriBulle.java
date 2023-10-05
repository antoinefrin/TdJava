package Td2TriBulle;

public class DemoTriBulle {

	public static void main(String[] args) {
		TriBulle t = new TriBulle();
		int taille = t.lireTaille();
		//Instanciation du tableau
		int[] tab = new int[taille];
		
		//System.out.println("La taille choisie "+ t.lireTaille());
		t.remplirTableau(tab, taille);
		System.out.println("Tableau avant tri :");		
		t.afficherTableau(tab, taille);
		t.triBulle(tab, taille);
		System.out.println("Tableau apres tri :");		
		t.afficherTableau(tab, taille);
	}

}
