package Td5Fleuriste;

public interface InterfaceFleuriste {

	public void creationBouquet(String nom, String prenom);
	public int quantiteEnStock(String nomFleur);
	public double prixDUneFleur(String nomFleur);
	public void ajoutFleur(String nomFleur, int quantiteFleur, double prixUnitaire);
	public void facturation();
}
