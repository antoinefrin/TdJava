package Td4Carburant;

public class CamionBacher extends Vehicule{

	protected final int POIDAVIDE = 4;
	protected final int POIDAMAXIMUM = 20;
	protected final int VITESSEMAX = 130;
	
	public CamionBacher(String immatriculation) {
		super(immatriculation);
	}

	@Override
	public String toString() {
		return "CamionBacher [POIDAVIDE=" + POIDAVIDE + ", POIDAMAXIMUM=" + POIDAMAXIMUM + ", VITESSEMAX=" + VITESSEMAX
				+ "]";
	}
	
	
	
}
