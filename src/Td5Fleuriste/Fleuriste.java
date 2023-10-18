package Td5Fleuriste;

import java.util.List;
import java.util.ArrayList;


public class Fleuriste implements InterfaceFleuriste{
	
	protected String nom;
	protected String prenom;
	protected String nomFleur;
	protected int quantiteFleur;
	protected double prixUnitaire;
	protected int quantiteStock;
	
	//Fleur[] catalogue = new Fleur[taille];
	
	private List<Fleur> fleur = new ArrayList<Fleur>();
	private List<Bouquet> bouquet = new ArrayList<Bouquet>();
	
	public List<Fleur> getFleur() {
		return fleur;
	}	
	public Fleuriste(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}
	
	@Override
	public void facturation() {
		
	}
	
	@Override
	public int quantiteEnStock(String nomFleur) {		
		
		return quantiteStock;
	}

	@Override
	public double prixDUneFleur(String nomFleur) {
		//faire une boucle pour comparer le nom de la fleur avec la liste pour en sortir son prix unitairel
		return prixUnitaire;
	}

	@Override
	public void ajoutFleur(String nomFleur, int quantiteFleur, double prixUnitaire) {
		ArrayList<Fleur> fleur = new ArrayList<Fleur>();
		System.out.println("test ajout fleur "+ fleur);
	}
	
	
	
	@Override
	public void creationBouquet(String nom, String prenom) {
		
	}

	
	
	
}
