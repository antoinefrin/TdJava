package Td3BiblioBus_Bis;

public class Livre_Bis extends Media_Bis{
	
	private String editeur;
	
	// Constructeur
	public Livre_Bis(String titre, String auteur, String editeur) {
		super(titre, auteur);
		this.editeur = editeur;		 
	}
	
	// Constructeur avec Parametre different
	public Livre_Bis(String titre, String auteur, String editeur, Genre_Bis genreA) {
		super(titre, auteur, genreA);
		this.editeur = editeur;
	}
	
	// Constructeur avec Parametre different
	public Livre_Bis(String titre, String auteur, String editeur, Genre_Bis genreA, int nbExemplaire) {
		super(titre, auteur, genreA, nbExemplaire);
		this.editeur = editeur;
	}
	public String getEditeur() {
		return this.editeur;
	}
	
	public String toString() {
		return "Livre [Titre = "+ titre +
				", Auteur = "+ auteur +
				", Editeur = "+ editeur +
				", NbExemplaire = "+ nbExemplaire +
				", Genre = "+ genre +"]";
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

	@Override
	public void afficher() {
		// TODO Auto-generated method stub
		
	}
}
