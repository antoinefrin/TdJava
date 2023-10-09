package Td3BiblioBus;

public class Livre implements TypeGenre{
	
	private String titre;
	private String auteur;
	private String editeur;
	private int nbExemplaire = 0;
	 
	public Livre(String titre, String auteur, String editeur) {
		this.titre = titre;
		this.auteur = auteur;
		this.editeur = editeur;		 
	}
	 
	public Livre(String titre, String auteur, String editeur, int nbExemplaire) {
		this.titre = titre;
		this.auteur = auteur;
		this.editeur = editeur;
		this.nbExemplaire = nbExemplaire;
	}
	
	public String toStringLivre() {
		return "Titre : "+ this.titre +", Auteur : "+ this.auteur +", Editeur : "
				+ this.editeur +", Nombre d'exemplaire : "+ this.nbExemplaire +",";
	}

	public String getLivre() {
		return (this.titre + this.auteur + this.editeur);
	}
	
	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public int getNbExemplaire() {
		return nbExemplaire;
	}

	public void setNbExemplaire(int nbExemplaire) {
		this.nbExemplaire = nbExemplaire;
	}
	
}
