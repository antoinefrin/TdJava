package Td4Carburant;

public abstract class Vehicule {
	
	protected String immatriculation = "";
	
	public abstract void afficher();
	
	public Vehicule(String immatriculation) {
		this.immatriculation = immatriculation;
	}

	public String getImmatriculation() {
		return immatriculation;
	}
}
