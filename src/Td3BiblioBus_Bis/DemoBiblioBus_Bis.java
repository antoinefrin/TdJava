package Td3BiblioBus_Bis;

public class DemoBiblioBus_Bis {
	
	public static void main(String[] args) {
		
		Livre_Bis l1 = new Livre_Bis("Notre dame de Paris", " Victor Hugo", " Gallimard", Genre_Bis.littératureFrancaise);
		Livre_Bis l2 = new Livre_Bis("Les Forges", " Victor ", " Gallimard", Genre_Bis.littératureFrancaise);
		Livre_Bis l3 = new Livre_Bis("Silence ça pousse", " Stéphane Marie", " Falliard", Genre_Bis.Nature);
		
		BiblioBus_Bis b1 = new BiblioBus_Bis("Veleda");
		BiblioBus_Bis b2 = new BiblioBus_Bis("LIBERTE", 200);
		
		b1.ajoutLivre("Les misérables", "Victor Hugo","Eyrolls");
		b1.ajoutLivre("Pomme", "Victor Hugo","Lune");
		b1.ajoutLivre("Fraise", "Victor Hugo","Soleil");
		
		b1.ajoutLivre(l1.getTitre(), l1.getAuteur(), l1.getEditeur());
		b1.ajoutLivre(l2.getTitre(), l2.getAuteur(), l2.getEditeur());
		b1.ajoutLivre(l3.getTitre(), l3.getAuteur(), l3.getEditeur());
		
		System.out.println("");
		System.out.println("****************** Affiche le Catalogue **************************************");
		b1.afficheCatalogue();
		
		System.out.println("");
		System.out.println("****************** Affiche Livre par l'Indice ********************************");
		b1.afficheLivre(0);
		
		System.out.println("");
		System.out.println("****************** Affiche les Livre Present *********************************");	
		b1.affficheListLivrePresent();
		
		System.out.println("");
		System.out.println("****************** Affiche les Livres Present Apres la Perte d'un Livre ******");		
		b1.catalogue[1].perteExemplaire();
		b1.affficheListLivrePresent();
		
		System.out.println("");
		System.out.println("****************** Recherche par Genre ***************************************");
		b1.affficheLivreParGenre(Genre_Bis.Non_specifie);
		
		System.out.println("");
		System.out.println("****************** Est Connu *************************************************");
		b1.ajoutLivre(l2.getTitre(), l2.getAuteur(), l2.getEditeur());
		b1.afficheCatalogue();
		
		System.out.println("");
		System.out.println("****************** Traitement ************************************************");
		//System.out.println(b1.estConnu(l1));
		//System.out.println(b1.estConnu(l2));
		System.out.println(b1.estConnu(l3));
		
		System.out.println("");
		System.out.println("****************** Reellement Present ****************************************");
		System.out.println(b1.reellementPresent(1));
		
		System.out.println("");
		System.out.println("****************** Nb Exemplaire *********************************************");
		System.out.println(b1.nombreExemplaire(l1));
		
		System.out.println("");
		System.out.println("****************** Sortir Livre **********************************************");
		b1.sortirLivre2(1);
		b1.afficheCatalogue();
	}
}