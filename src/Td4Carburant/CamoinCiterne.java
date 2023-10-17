package Td4Carburant;

public class CamoinCiterne extends Vehicule{
	
	
	protected final int POIDAVIDE = 3000;
	protected final int POIDAMAXIMUM = 10000;
	protected final int VITESSEMAX = 130;
	protected int charge = 0;
	protected int chargeTotal = 0;
	
	public CamoinCiterne(String immatriculation) {
		super(immatriculation);
	}
	
	public CamoinCiterne(String immatriculation, int charge) {
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
		}else if(this.charge <= 1000) {
			System.out.println("La charge de "+ super.immatriculation +" est inférieur ou égale a 1 Tonne la vitesse est limité à 110/km");
		}else if((this.charge > 1000) && (this.charge <= 4000)) {
			System.out.println("La charge de "+ super.immatriculation +" est supérieur a 1 Tonne et inférieur ou égale a 4 tonnes la vitesse est limité à 90/km");
		}else if((this.charge > 4000) && (this.charge <= POIDAMAXIMUM)) {
			System.out.println("La charge de "+ super.immatriculation +" est supérieur a 4 Tonnes la vitesse est limité à 80/km");
		}else if(this.charge > POIDAMAXIMUM) {
			System.out.println("La charge de "+ super.immatriculation +" est supérieur a "+ POIDAMAXIMUM +" Tonnes le camion citerne ne peut pas rouler");
		}
	}
	
	public int chargeTotal() {
		return this.chargeTotal = this.charge + POIDAVIDE;
	}
	
	@Override
	public String toString() {
		return " CamoinCiterne immatriculation="+ super.immatriculation +" [POIDAVIDE=" 
				+ POIDAVIDE + ", POIDAMAXIMUM=" 
				+ POIDAMAXIMUM + ", VITESSEMAX=" 
				+ VITESSEMAX
				+ "]";
	}

	@Override
	public void afficher() {
		System.out.println("Camion Citerne | L'immatriculation : "
				+ super.immatriculation +" | Poid à vide : "
				+ POIDAVIDE +" Tonnes | Charge maximale : "
				+ POIDAMAXIMUM +" Tonnes | Charge du véhicule : "
				+ this.charge +" Tonne | Charge TOTAL du véhicule : "
				+ chargeTotal() +" |");
	}
}
