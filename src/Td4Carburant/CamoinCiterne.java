package Td4Carburant;

public class CamoinCiterne extends Vehicule{
	
	
	protected final int POIDAVIDE = 3;
	protected final int POIDAMAXIMUM = 10;
	protected final int VITESSEMAX = 130;
	
	public CamoinCiterne(String immatriculation) {
		super(immatriculation);
	}

	@Override
	public String toString() {
		return "CamoinCiterne [POIDAVIDE=" + POIDAVIDE + ", POIDAMAXIMUM=" + POIDAMAXIMUM + ", VITESSEMAX=" + VITESSEMAX
				+ "]";
	}
	
	

}
