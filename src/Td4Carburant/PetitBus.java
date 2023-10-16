package Td4Carburant;

public class PetitBus extends Vehicule{
	
	protected final int POIDAVIDE = 4;
	protected final int VITESSEMAX = 150;
	
	public PetitBus(String immatriculation) {
		super(immatriculation);
	}

	@Override
	public String toString() {
		return super.immatriculation +"PetitBus [POIDAVIDE=" + POIDAVIDE + ", VITESSEMAX=" + VITESSEMAX + "]";
	}
	
	
	
}
