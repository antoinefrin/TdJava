package Td5Fleuriste;

public class Fleurs {
	
	private String nomFleur;
	private float prixUnitaire;
	private int quantiteStock;
	private int qteCommander;
	
	public Fleurs(String nomFleur, float prixUnitaire, int quantiteStock) {
		this.nomFleur = nomFleur;
		this.prixUnitaire = prixUnitaire;
		this.quantiteStock = quantiteStock;
	}
	
	public Fleurs(String nomFleur, int quantiteStock) {
		this.nomFleur = nomFleur;
		this.quantiteStock = quantiteStock;
	}

	public String getNomFleur() {
		return nomFleur;
	}

	public float getPrixUnitaire() {
		return prixUnitaire;
	}
	
	public int getQuantiteStock() {
		return quantiteStock;
	}

	public void setQuantiteStock(int qte) {
		//this.quantiteStock += quantiteStock;
		this.quantiteStock = this.quantiteStock + qte;
	}
	
	public int getQteCommander() {
		return qteCommander;
	}

	public void setQteCommander(int qteCommander) {
		this.qteCommander = qteCommander;
	}

	public void diminuerQuantiteStock(int qte) {
		//this.quantiteStock -= quantiteStock;
		this.quantiteStock = this.quantiteStock -  qte;		
	}
}
