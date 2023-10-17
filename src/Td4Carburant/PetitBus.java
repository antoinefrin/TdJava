package Td4Carburant;

public class PetitBus extends Vehicule{
	
	protected final int POIDAVIDE = 4000;
	protected final int VITESSEMAX = 150;
	
	public PetitBus(String immatriculation) {
		super(immatriculation);
	}

	@Override
	public String toString() {
		return " PetitBus immatriculation="+ super.immatriculation +" [POIDAVIDE=" 
				+ POIDAVIDE + ", VITESSEMAX=" 
				+ VITESSEMAX
				+ "]";
	}

	@Override
	public void afficher() {
		System.out.println("Petit Bus | L'immatriculation : "
				+ super.immatriculation +" | Poid à vide : "
				+ POIDAVIDE +" Tonnes | Ne possède pas de charge maximale |" );
	}
}
