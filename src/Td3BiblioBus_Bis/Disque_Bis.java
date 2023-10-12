package Td3BiblioBus_Bis;

import java.util.*;

public class Disque_Bis extends Media_Bis{
	
	List<String> pistes = new ArrayList<String>();	
	
	public Disque_Bis(String titre, String auteur) {
		super(titre, auteur); 
	}
	
	public Disque_Bis(String titre, String auteur, Genre_Bis genreM) {
		super(titre, auteur, Genre_Bis.Non_specifie);
	}
	
	public Disque_Bis(String titre, String auteur, int nbExemplaire) {
		super(titre, auteur, nbExemplaire); 
	}
	
	
	public String getTitre() {
		return this.titre;
	}

	public String getAuteur() {
		return this.auteur;
	}
	
	public Genre_Bis getGenre() {
		return genre;
	}
	
	public int getNbExemplaire() {
		return this.nbExemplaire;
	}
	
	public List<String> getPistes() {
		return pistes;
	}
	
	public void setPistes(List<String> pistes) {
		this.pistes = pistes;
	}

	public String toString() {
		return "Disque [Titre = "+ titre +
				", Auteur = "+ auteur +
				", NbExemplaire = "+ nbExemplaire +"]";
	}
	
	public void nouvelExemplaire() {
		this.nbExemplaire = nbExemplaire + 1;
	}
	
	public void nouvelExemplaire(int nombre) {
		this.nbExemplaire = nbExemplaire + nombre;
	}
	
	public boolean genreCorrectDisque(Genre_Bis g)	{
		for(Genre_Bis e: Genre_Bis.values()) {
			if((g == e) && (e.getSupport() !=1)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void afficher() {
		// TODO Auto-generated method stub
		
	}
	
}
