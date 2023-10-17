package Td4Carburant;

public class PetitBus extends Vehicule{
	
	public PetitBus(String immatriculation, double poidsAVide) {
		super(immatriculation, poidsAVide);
		super.vitesseMax = 150;
	}

	@Override
	public String toString() {
		return "PetitBus [immatriculation="
				+ immatriculation + ", poidsAVide=" 
				+ poidsAVide + ", vitesseMax="
				+ vitesseMax + "]";
	}

	@Override
	public void afficher() {
		System.out.println("Petit Bus | L'immatriculation : "
				+ super.immatriculation +" | Poid à vide : "
				+ super.poidsAVide +" Tonnes | Ne possède pas de charge maximale |" );
	}

	@Override
	public double getVitesseMax() {
		return 0;
	}
	
	@Override
	public double getPoidsTotal() {
		return super.getPoidsTotal();
	}	
}
