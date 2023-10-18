package Td5Fleuriste;

public interface InterfaceFleuriste {

	public void creationBouquet(String nom, String prenom);
	public int quantiterEnStock(String nomFleur);
	public double prixDUneFleur(String nomFleur);
	public void ajoutFleur(String nomFleur, int qte);
	public void ajoutFleur(String nomFleur, int qte, double prixFleur);
	public void facturation();
}
