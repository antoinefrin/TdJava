package Td2Tri;

public class DemoTri {

	public static void main(String[] args) {
		Tri t = new Tri();
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
