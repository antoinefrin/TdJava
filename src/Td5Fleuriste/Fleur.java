package Td5Fleuriste;

import java.util.Vector;

import Td4Carburant.Vehicule;

public class Fleur extends Fleuriste {
	
	private Vector<Fleuriste> fleur = new Vector<Fleuriste>();
	
	/*public Fleur(String nomFleur, int quantiterFleur) {
		super(nomFleur, quantiterFleur);
	}*/
	
	
	public Fleur(String nomFleur, int quantiterFleur, double prixFleur) {
		super(nomFleur, quantiterFleur, prixFleur);
	}
	

	public void ajoutFleur(Fleuriste fle) {
		fleur.add(fle);
	}
}
