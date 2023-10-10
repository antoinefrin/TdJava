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
	}
}
