package Td3BiblioBus_Bis;

public class Livre_Bis {
	
	private String titre;
	private String auteur;
	private String editeur;
	private int nbExemplaire = 1;
	Genre_Bis genre = Genre_Bis.Non_specifie;
	
	 
	public Livre_Bis(String titre, String auteur, String editeur) {
		this.titre = titre;
		this.auteur = auteur;
		this.editeur = editeur;		 
	}
	
	public Livre_Bis(String titre, String auteur, String editeur, Genre_Bis genreA) {
		this.titre = titre;
		this.auteur = auteur;
		this.editeur = editeur;
		this.genre = genreA;
	}

	public String getTitre() {
		return this.titre.toUpperCase();	//Rajout du toUpperCase TP3-Bis exercice 3
	}

	public String getAuteur() {
		return this.auteur.toUpperCase();	//Rajout du toUpperCase TP3-Bis exercice 3
	}
	
	public String getEditeur() {
		return this.editeur;
	}

	public int getNbExemplaire() {
		return this.nbExemplaire;
	}
	
	public Genre_Bis getGenre() {
		return genre;
	}
	
	public String toString() {
		return "Livre [Titre = "+ titre +
				", Auteur = "+ auteur +
				", Editeur = "+ editeur +
				", NbExemplaire = "+ nbExemplaire +"]";
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
	
	public boolean equals(Livre_Bis l) {
		if((this.titre.equals(l.titre)) &&
				(this.auteur.equals(l.auteur)) &&
				(this.editeur.equals(l.editeur))) {
			return true;
		}
		return false;
	}
	public Livre_Bis nouvelEditeur(String newEditeur) {
		Livre_Bis nouveauLivre = new Livre_Bis(this.titre, this.auteur, newEditeur, this.genre);
		return nouveauLivre;
	}
	
	///////////////////////////////////////
	//////// Rajout pour Td3-Bis //////////
	///////////////////////////////////////
	public boolean correct(Genre_Bis g)	{
		for(Genre_Bis e: Genre_Bis.values()) {
			if(g == e) {
			}
		}
		return true;
	}
}
