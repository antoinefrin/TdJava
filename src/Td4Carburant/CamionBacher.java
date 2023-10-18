package Td4Carburant;

public class CamionBacher extends Vehicule{

	protected final double POIDAMAXIMUM = 20.0;
	protected double charge = 0.0;
	//protected double chargeTotal = 0.0;
	
	public CamionBacher(String immatriculation, double poidsAVide, double charge) {
		super(immatriculation, poidsAVide);
		this.charge = charge;
	}
	
	@Override
	public double getVitesseMax() {
		double vitesse = 0.0;
		if(charge > POIDAMAXIMUM) {
			return vitesse;
		}else {
			if(this.charge == 0) {
				vitesse = 130.0;
			}else {
				if(this.charge <= 3.0) {
					vitesse = 110.0;
				}else {
					if((this.charge > 3.0) && (this.charge <= 7.0)) {
						vitesse = 90.0;
					}else {
						if ((this.charge > 7.0) && (this.charge <= POIDAMAXIMUM)) {
							vitesse = 80.0;
						}
					}
				}
			}
		}
		return vitesse ;
	}
	
	/*Ce que j'avais fais avant correction
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
	*/
	
	@Override
	public String toString() {
		return "CamionBacher immatriculation="+ super.immatriculation +" [POIDAVIDE=" 
				+ super.poidsAVide + ", POIDAMAXIMUM=" 
				+ POIDAMAXIMUM + ", VITESSEMAX=" 
				+ this.getVitesseMax()
				+ "]";
	}
	
	@Override
	public void afficher() {
		System.out.println("Camion Bâcher | L'immatriculation : "
				+ super.immatriculation +" | Poid à vide : "
				+ super.poidsAVide +" Tonnes | Charge maximale : "
				+ POIDAMAXIMUM +" Tonnes | Charge du véhicule : "
				+ this.charge +" Tonne |");
	}

	@Override
	public double getPoidsTotal() {
		return super.getPoidsTotal() + this.charge;
	}	
}
