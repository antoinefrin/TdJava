package Td4Impots;

public class Habitation {
	
	protected String proprietaire = "";
	protected String adresse = "";
	protected double surface = 0.0;
	protected final double PRIXMETTRECARRE = 2.0;
	
	public Habitation(String p, String a, double s) {
		this.proprietaire = p;
		this.adresse = a;
		this.surface = s;
	}
	
	public String getProprietaire() {
		return this.proprietaire;
	}

	public String getAdresse() {
		return this.adresse;
	}

	public double getSurface() {
		return this.surface;
	}

	public double impots() {
		return this.surface * PRIXMETTRECARRE;
		//double ttImpots = 0.0;
		//ttImpots = this.surface * PRIXMETTRECARRE;
		//return ttImpots;
	}
	
	@Override
	public String toString() {
		return "Habitation [proprietaire = "
				+ proprietaire +", adresse = "
				+ adresse +", surface = "
				+ surface +"]";
	}
	
	
	
	public void afficher() {
		System.out.println("Propriétaire : "
				+ this.proprietaire +" Adresse : "
				+ this.adresse + " Surface : "
				+ this.surface );
	}
}
