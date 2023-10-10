package Td3BiblioBus;

import java.util.Iterator;

public class BiblioBus {
	private String nom;
	private int taille = 100;
	private int limite = 0;
	Livre[] catalogue = new Livre[taille];
	
	public BiblioBus(String nom) {
		this.nom = nom;
	}
	
	public BiblioBus(String nom, int taille) {
		this.nom = nom;
		this.taille = taille;
	}
	
	public void ajoutLivre(String titre, String auteur, String editeur) {
		Livre l = new Livre(titre, auteur, editeur);
		
		if(limite < taille) {
			catalogue[limite] = l;
			limite++;
		}else {
			System.out.println("Plus de place dans le tableau.");
		}
	}
	
	public void afficheCatalogue() {
		for (int i = 0; i < limite; i++) {
			System.out.println(catalogue[i]);
			
		}
	}	
	
	public String getTitre(int id) {
		return catalogue[id].getTitre();
	}
	
	public String getAuteur(int id) {
		return catalogue[id].getAuteur();
	}
	
	public String getEditeur(int id) {
		return catalogue[id].getEditeur();
	}
	
	public int getNbExemplaire(int id) {
		return catalogue[id].getNbExemplaire();
	}
	
	public Genre getGenre(int id) {
		return catalogue[id].getGenre();
	}
	
	public void afficheLivre(int id) {
		String ch = "["+ id +"]"+ this.getTitre(id) 
		+" "+ this.getAuteur(id) 
		+" "+ this.getEditeur(id) 
		+" "+ this.getGenre(id) 
		+". Nombre d'exemplaires : " 
		+ this.getNbExemplaire(id);
		System.out.println(ch);
		//return ch;
	}
	
	public void affficheListLivrePresent() {
		for(int i = 0; i < limite; i++) {
			if(catalogue[i].exemplairePresent()) {
				this.afficheLivre(i);
			}
		}		
	}
	
	public void affficheLivreParGenre(Genre g) {
		for(int i = 0; i < limite; i++) {
			if(getGenre(i) == g) {
				this.afficheLivre(i);
			}
		}		
	}
	
	public boolean estConnu(Livre l1) {
		for(int i = 0; i < limite; i++) {
			if(catalogue[i].equals(l1)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean reellementPresent(int id) {
		if(catalogue[id].exemplairePresent()) {
			return true;
		}
		return false;
	}
	
	public boolean reellementPresent(Livre l1) {
		if(l1.exemplairePresent()) {
			return true;
		}
		return false;
	}
	
	public int nombreExemplaire(int id) {
		return this.getNbExemplaire(id);
	}

	public int nombreExemplaire(Livre l1) {
		return l1.getNbExemplaire();
	}
	
	//on ecrase la case d'indice id
	//avec la derniere case du catalogue
	public void sortirLivre(int id) {
		if(id < limite) {
			catalogue[id] = catalogue[limite-1];
			limite--;
		}
	}
	
	/////////////////////////////////////
	//2eme methode : avec un decalage a gauche
	public void sortirLivre2(int id) {
		if(id < limite) {
			for(int i = id; i <limite-1; i++) {
				catalogue[i] = catalogue[i+1];
			}
			limite--;
		}
	}
}
