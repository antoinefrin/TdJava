package Td5Fleuriste;

import java.util.Vector;

public class Bouquet {
	
	private Vector<Fleurs> bq = new Vector<Fleurs>();
	private float prixBouquet;
	private String nom;
	private String prenom;
	
	public Bouquet(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}

	public Vector<Fleurs> getBq() {
		return bq;
	}

	public void setBq(Vector<Fleurs> bq) {
		this.bq = bq;
	}

	public float getPrixBouquet() {
		return prixBouquet;
	}

	public void setPrixBouquet(float prixBouquet) {
		this.prixBouquet += prixBouquet;
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}
}
