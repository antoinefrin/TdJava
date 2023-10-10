package Td3BiblioBus;

public class DemoLivre {

	public static void main(String[] args) {
		
		Livre livre1 = new Livre("Psychopompe", "Amélie Nothomb", "Albin Michel", Genre.littératureFrancaise);
		Livre livre2 = new Livre("Psycho", "Nothomb", "Albin Michel");
		Livre livre3 = new Livre("Panaroma", "Lilia Hassaine", "Gallimard");
		Livre livre4 = new Livre("Panaroma", "Lilia Hassaine", "Gallimard");
		
		System.out.println(livre1.toString());
		System.out.println("Quel est le genre : ");
		livre1.getGenre();
		System.out.println("Quel est le genre : "+ livre1.getGenre());
		
		
		System.out.println();
		System.out.println(livre2.toString());
		System.out.println(livre3.toString());
		
		// Ajouts d'exemplaires
		livre1.nouvelExemplaire(3);
		System.out.println(livre1.toString());
		
		// Perte de 1 exemplaire
		livre1.perteExemplaire();
		System.out.println("Perte exemplaire livre 1 : "+ livre1.toString());
		
		// Le livre 1 est il présent
		livre1.exemplairePresent();
		System.out.println("Le livre 1 est présent la réponse est : "+ livre1.exemplairePresent());
		
		// Le livre 2 est il présent
		livre2.exemplairePresent();
		System.out.println("Le livre 2 est présent : "+ livre2.exemplairePresent());
		
		// La comparaison doit retourner FALSE au vue des infos que j'ai mise 
		livre1.equals(livre2);
		System.out.println("Le livre 1 est il représentatif de livre 2 (même titre, auteur, éditeur) la réponse est : "+ livre1.equals(livre2));
		
		// La comparaison doit retourner TRUE au vue des infos que j'ai mise 
		livre3.equals(livre4);
		System.out.println("Le livre 3 est il représentatif de livre 4 (même titre, auteur, éditeur) la réponse est : "+ livre3.equals(livre4));
		
		System.out.println(livre1.nouvelEditeur("Banane"));
		
	}
}
