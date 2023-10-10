package Td3BiblioBus;

import java.util.Scanner;

public class Livre {
	
	private String titre;
	private String auteur;
	private String editeur;
	private int nbExemplaire = 1;
	Genre genre = Genre.Non_specifie;
	
	 
	public Livre(String titre, String auteur, String editeur) {
		this.titre = titre;
		this.auteur = auteur;
		this.editeur = editeur;		 
	}
	
	public Livre(String titre, String auteur, String editeur, Genre genreA) {
		this.titre = titre;
		this.auteur = auteur;
		this.editeur = editeur;
		this.genre = genreA;
	}

	public String getTitre() {
		return this.titre;
	}
	
	public String getAuteur() {
		return this.auteur;
	}
	
	public String getEditeur() {
		return this.editeur;
	}

	public int getNbExemplaire() {
		return this.nbExemplaire;
	}
	
	public Genre getGenre() {
		return genre;
	}
	
	public String toString() {
		//return "Titre : "+ this.titre +", Auteur : "+ this.auteur +", Editeur : "
			//	+ this.editeur +", Nombre d'exemplaire : "+ this.nbExemplaire +", Genre :"+ genre;
		return "Livre [titre =" + titre + ",auteur=" + auteur + ",editeur=" + editeur + ",nbExemplaire=" + nbExemplaire + "]";
	}
	
	public void nouvelExemplaire() {
		this.nbExemplaire = nbExemplaire + 1;
	}
	
	public void nouvelExemplaire(int nombre) {
		this.nbExemplaire = nbExemplaire + nombre;
	}
	
	public void perteExemplaire() {
		if(nbExemplaire > 0) {
			this.nbExemplaire = nbExemplaire -1;
		}
	}
	
	public boolean exemplairePresent() {
		if(nbExemplaire > 0) {
			return true;
		}
		return false;
	}
	
	public boolean equals(Livre l) {
		if(this.auteur ==l.getAuteur() && this.titre == l.getTitre() && this.editeur == l.editeur) {
			return true;
		}
		return false;
	}
	public Livre nouvelEditeur(String newEditeur) {
		Livre nouveauLivre = new Livre(this.titre, this.auteur, newEditeur, this.genre);
		return nouveauLivre;
	}
}
