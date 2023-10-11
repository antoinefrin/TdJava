package Td3BiblioBus_Bis;

import java.util.Iterator;
import java.util.Scanner;

import Td3BiblioBus.Genre;

public class BiblioBus_Bis {
	private String nom;
	private int taille = 200;
	private int limite = 0;
	Livre_Bis[] catalogue = new Livre_Bis[taille];
	
	public BiblioBus_Bis(String nom) {
		this.nom = nom;
	}
	
	public BiblioBus_Bis(String nom, int taille) {
		this.nom = nom;
		this.taille = taille;
	}
	
	public void ajoutLivre(String titre, String auteur, String editeur) {
		Livre_Bis l = new Livre_Bis(titre.toUpperCase(),
									auteur.toUpperCase(),
									editeur);
		if(limite < taille) {
			catalogue[limite] = l;
			limite++;
		}else {
			System.out.println("Plus de place dans le tableau.");
		}
	}
	
	///////////////////////////////////////
	////// Rajout pour Td3-Bis Exo4 ///////
	///////////////////////////////////////
	public void ajoutLivreVersion(String titre, String auteur, String editeur) {
		Livre_Bis l = new Livre_Bis(titre.toUpperCase(),
									auteur.toUpperCase(),
									editeur);
		if(limite < taille) {
			for(int i = 0; i < limite; i++) {
				if(catalogue[i].equals(l)) {
					catalogue[i].nouvelExemplaire();
					return;
				}
			}
			catalogue[limite] = l;
			limite++;
		}else {
			System.out.println("Plus de place dans le tableau.");
		}
	}
	
	///////////////////////////////////////
	////// Rajout pour Td3-Bis Exo5 ///////
	///////////////////////////////////////
	public void ajoutLivreGenre(String titre, String auteur, String editeur, Genre_Bis genre) {
		Livre_Bis l = new Livre_Bis(titre, auteur, editeur, genre);
		
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
	
	public Genre_Bis getGenre(int id) {
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
	
	public void affficheLivreParGenre(Genre_Bis g) {
		for(int i = 0; i < limite; i++) {
			if(getGenre(i) == g) {
				this.afficheLivre(i);
			}
		}		
	}
	
	public void affficheLivreParTitre(String t) {
		for(int i = 0; i < limite; i++) {
			if(getTitre(i).equals(t)) {
				this.afficheLivre(i);
			}
		}		
	}
	
	public void affficheLivreParaAuteur(String a) {
		for(int i = 0; i < limite; i++) {
			if(getAuteur(i).equals(a)) {
				this.afficheLivre(i);
			}
		}		
	}
	
	public boolean estConnu(Livre_Bis l1) {
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
	
	public boolean reellementPresent(Livre_Bis l1) {
		if(l1.exemplairePresent()) {
			return true;
		}
		return false;
	}
	
	public int nombreExemplaire(int id) {
		return this.getNbExemplaire(id);
	}

	public int nombreExemplaire(Livre_Bis l1) {
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
	
	///////////////////////////////////////
	//////// Rajout pour Td3-Bis //////////
	///////////////////////////////////////
	public boolean correct(Genre_Bis g)	{
		for(Genre_Bis e: Genre_Bis.values()) {
			if(g == e) {
				return true;
			}
		}return false;
	}
	
	///////////////////////////////////////
	/////////// Td3-Bis Exo 5 /////////////
	////// Nb Exemplaire par Auteur ///////
	///////////////////////////////////////
	public int nbExemplaireAuteur(String auteur) {
		int nb = 0;
		for(int i = 0; i < limite; i++) {
			if(getAuteur(i).equals(auteur)) {
				nb = nb + getNbExemplaire(i);
			}
		}
		return nb;
	}
	
	public int nbExemplaireGenre(Genre_Bis genre) {
		int nb = 0;
		for(int i = 0; i < limite; i++) {
			if(getGenre(i).equals(genre) ) {
				nb = nb + getNbExemplaire(i);
			}
		}
		return nb;
	}
}
