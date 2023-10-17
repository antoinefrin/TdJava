package Td4Carburant;

public class CamionBacher extends Vehicule{

	protected final int POIDAVIDE = 4000;
	protected final int POIDAMAXIMUM = 20000;
	protected final int VITESSEMAX = 130;
	protected int charge = 0;
	protected int chargeTotal = 0;
	
	public CamionBacher(String immatriculation) {
		super(immatriculation);
	}
	
	public CamionBacher(String immatriculation, int charge) {
		super(immatriculation);
		this.charge = charge;
	}
	
	public int getCharge() {
		return charge;
	}
	
	public int getChargeTotal() {
		return chargeTotal;
	}

	public void charge() {
		if(this.charge == 0) {
			System.out.println("La charge de "+ super.immatriculation +" est de 0 tonne la vitesse est limité à 130/km");
		}else if(this.charge <= 3000) {
			System.out.println("La charge de "+ super.immatriculation +" est inférieur ou égale a 3 Tonne la vitesse est limité à 110/km");
		}else if((this.charge > 3000) && (this.charge <= 7000)) {
			System.out.println("La charge de "+ super.immatriculation +" est supérieur a 3 Tonnes et inférieur ou égale a 7 tonnes la vitesse est limité à 90/km");
		}else if((this.charge > 7000) && (this.charge <= POIDAMAXIMUM)) {
			System.out.println("La charge de "+ super.immatriculation +" est supérieur a 7 Tonnes la vitesse est limité à 80/km");
		}else if(this.charge > POIDAMAXIMUM) {
			System.out.println("La charge de "+ super.immatriculation +" est supérieur a "+ POIDAMAXIMUM +" Tonnes le camion bâche ne peut pas rouler");
		}
	}
	
	public int chargeTotal() {
		return this.chargeTotal = this.charge + POIDAVIDE;
	}
	
	@Override
	public String toString() {
		return " CamionBacher immatriculation="+ super.immatriculation +" [POIDAVIDE=" 
				+ POIDAVIDE + ", POIDAMAXIMUM=" 
				+ POIDAMAXIMUM + ", VITESSEMAX=" 
				+ VITESSEMAX
				+ "]";
	}

	@Override
	public void afficher() {
		System.out.println("Camion Bâcher | L'immatriculation : "
				+ super.immatriculation +" | Poid à vide : "
				+ POIDAVIDE +" Tonnes | Charge maximale : "
				+ POIDAMAXIMUM +" Tonnes | Charge du véhicule : "
				+ this.charge +" Tonne | Charge TOTAL du véhicule : "
				+ chargeTotal() +" |");
	}
}
