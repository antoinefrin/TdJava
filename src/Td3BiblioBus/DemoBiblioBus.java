package Td3BiblioBus;

public class DemoBiblioBus {
	
	public static void main(String[] args) {
		BiblioBus b1 = new BiblioBus("Veleda");
		b1.ajoutLivre("Les misérables", "Victor Hugo","Eyrolls");
		b1.afficheCatalogue();
		b1.afficheLivre(0);		
	}
}
