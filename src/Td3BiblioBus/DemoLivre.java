package Td3BiblioBus;

public class DemoLivre {

	public static void main(String[] args) {
		
		Genre genreFrançaise = new Genre("Littérature Française");
		
		Livre livre1 = new Livre("Psychopompe", "Amélie Nothomb", "Albin Michel");
		System.out.println(livre1.toStringLivre() + genreFrançaise.toStringGenre());
		
		Livre livre2 = new Livre("Psychopompe", "Amélie Nothomb", "Albin Michel", 3);
		System.out.println(livre2.toStringLivre() + genreFrançaise.toStringGenre());
		
		Livre livre3 = new Livre("Panaroma", "Lilia Hassaine", "Gallimard");
		System.out.println(livre3.toStringLivre() + genreFrançaise.toStringGenre());
		
		Livre livre4 = new Livre("Panaroma", "Lilia Hassaine", "Gallimard", 6);
		System.out.println(livre4.toStringLivre() + genreFrançaise.toStringGenre());

	}

}
