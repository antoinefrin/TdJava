package Td5Fleuriste;

public class Fleuriste implements InterfaceFleuriste{

	protected String nomFleur;
	protected int quantiterFleur;
	protected double prixFleur;
	
	public Fleuriste(String nomFleur, int quantiterFleur, double prixFleur) {
		this.nomFleur = nomFleur;
		this.quantiterFleur = quantiterFleur;
		this.prixFleur = prixFleur;
	}

	@Override
	public void facturation() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public int quantiterEnStock(String nomFleur) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double prixDUneFleur(String nomFleur) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void ajoutFleur(String nomFleur, int qte) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void ajoutFleur(String nomFleur, int qte, double prixFleur) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void creationBouquet(String nom, String prenom) {
		// TODO Auto-generated method stub
		
	}
	
	public void afficher() {
		
	}
	
}
