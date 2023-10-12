package Td3BiblioBus_Bis;

public abstract class Media_Bis {
	protected String titre;
	protected String auteur;
	protected int nbExemplaire = 1;
	protected Genre_Bis genre;
	
	// Methode abstraite
	public abstract void afficher();
	
	// Constructeur
	public Media_Bis(String titre, String auteur) {
		this.titre = titre;
		this.auteur = auteur;
	}
	
	// Constructeur avec Parametre different
	public Media_Bis(String titre, String auteur, Genre_Bis genre) {
		this.titre = titre;
		this.auteur = auteur;
		this.genre = Genre_Bis.Non_specifie;
	}
	
	// Constructeur avec Parametre different
	public Media_Bis(String titre, String auteur, int nbExemplaire) {
		this.titre = titre;
		this.auteur = auteur;
		this.nbExemplaire = nbExemplaire;		
	}
	
	// Constructeur avec Parametre different
	public Media_Bis(String titre, String auteur, Genre_Bis Non_specifie, int nbExemplaire) {
		this.titre = titre;
		this.auteur = auteur;
		this.genre = Genre_Bis.Non_specifie;
		this.nbExemplaire = nbExemplaire;
	}

	public String getTitre() {
		return titre;
	}
	
	public String getAuteur() {
		return auteur;
	}
	
	public int getNbExemplaire() {
		return nbExemplaire;
	}
	
	public void setNbExemplaire(int nbExemplaire) {
		this.nbExemplaire = nbExemplaire;
	}
	
	public Genre_Bis getGenre() {
		return genre;
	}
	
	public void setGenre(Genre_Bis genre) {
		this.genre = genre;
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
	
	//////// Rajout pour Td3-Bis //////////
	public boolean correct(Genre_Bis g)	{
		for(Genre_Bis e: Genre_Bis.values()) {
			if(g == e) {
				return true;
			}
		}
		return false;
	}
	
	public boolean genreCorrect(String ch)	{
		Genre_Bis g;
		try {
			g = Genre_Bis.valueOf(ch);
		}catch(Exception ex) {
			return false;
		}
		return true;		
	}
	
	//////// Td3-Bis Exercice 8.3  ////////
	public boolean genreCorrectLivre(Genre_Bis g)	{
		for(Genre_Bis e: Genre_Bis.values()) {
			if((g == e) && (e.getSupport() !=2)) {
				return true;
			}
		}
		return false;
	}

	public boolean equals(Livre_Bis l) {
		if((this.titre.equals(l.titre)) &&
				(this.auteur.equals(l.auteur))) {
			return true;
		}
		return false;
	}
	
}
