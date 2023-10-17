package Td4Carburant;

public abstract class Vehicule {
	
	protected String immatriculation;
	protected double poidsAVide;
	protected double vitesseMax;
	
	public Vehicule(String immatriculation, double poidsAVide) {
		this.immatriculation = immatriculation;
		this.poidsAVide = poidsAVide;
	}
	
	public abstract void afficher();
	
	public abstract double getVitesseMax();

	@Override
	public String toString() {
		return "Vehicule [immatriculation=" 
				+ immatriculation + ", poidsAVide=" 
				+ poidsAVide + ", vitesse=" 
				+ vitesseMax
				+ "]";
	}

	public double getPoidsTotal() {
		return poidsAVide;
	}
	
	public double consommation(double v, double p) {
		return v/10 + p;
	}
}
