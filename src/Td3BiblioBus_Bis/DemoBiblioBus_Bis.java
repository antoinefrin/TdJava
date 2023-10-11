package Td3BiblioBus_Bis;

public class DemoBiblioBus_Bis {
	
	public static void main(String[] args) {
		
		Livre_Bis l1 = new Livre_Bis("Notre dame de Paris", "Victor Hugo", " Gallimard", Genre_Bis.littératureFrancaise);
		Livre_Bis l2 = new Livre_Bis("Les Forges", "Victor", " Gallimard", Genre_Bis.littératureFrancaise);
		Livre_Bis l3 = new Livre_Bis("Silence ça pousse", " Stéphane Marie", " Falliard", Genre_Bis.Non_specifie);
		
		BiblioBus_Bis b1 = new BiblioBus_Bis("Veleda");			
		BiblioBus_Bis b2 = new BiblioBus_Bis("LIBERTE", 200);	//TP3-Bis exercice 1 utilisation du deuxieme constructeur en
																//lui donnant la valeur de 200 pour la taille
		
		b1.ajoutLivre("Les miserables", "Victor Hugo","Eyrolls");
		b1.ajoutLivre("Pomme", "Victor Hugo","Lune");
		b1.ajoutLivre("Fraise", "Victor Hugo","Soleil");
		
		b1.ajoutLivre(l1.getTitre(), l1.getAuteur(), l1.getEditeur());
		b1.ajoutLivre(l2.getTitre(), l2.getAuteur(), l2.getEditeur());
		b1.ajoutLivre(l3.getTitre(), l3.getAuteur(), l3.getEditeur());
		b1.ajoutLivreGenre(l1.getTitre(), l1.getAuteur(), l1.getEditeur(), l1.getGenre());	//Rajout d'une methode qui prend
																				//en compte la valeur genre pour le td3-bis 
																				//exercice 5 afin de recuperer le nombre 
																				//d'exemplaire par genre
		
		///////////////////////////////////////
		//////// Rajout pour Td3-Bis //////////
		///////////////////////////////////////
		System.out.println("Saisir la taille voulu pour BiblioBus : ");
		//b1.lireTaille();
		
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
		System.out.println("****************** Recherche par Titre ***************************************");
		b1.affficheLivreParTitre("NOTRE DAME DE PARIS");	//Pour le test mettre la valeurs en majuscule du au toUpperCase mis dans le getTitre
		

		System.out.println("");
		System.out.println("****************** Recherche par Auteur **************************************");
		b1.affficheLivreParaAuteur("VICTOR");	//Pour le test mettre la valeurs en majuscule du au toUpperCase mis dans le getAuteur
		
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
		
		System.out.println("");
		System.out.println("****************** Compare Genre Correct *************************************");
		System.out.println(l1.correct(Genre_Bis.Policier));
		
		System.out.println("");
		System.out.println("****************** Nb Ewemplaire auteur **************************************");
		System.out.println(b1.nbExemplaireAuteur("VICTOR HUGO"));	//Pour le test mettre la valeurs en majuscule du au toUpperCase mis dans le getAuteur
		
		System.out.println("");
		System.out.println("****************** Nb Ewemplaire genre ***************************************");
		System.out.println(b1.nbExemplaireGenre(Genre_Bis.littératureFrancaise));	//Pour le test mettre la valeurs en majuscule du au toUpperCase mis dans le getAuteur
	
		
	}
}