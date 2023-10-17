package Td4Carburant;

public class CamoinCiterne extends Vehicule{
	
	protected final double POIDAMAXIMUM = 10.0;
	protected double charge = 0.0;
	
	public CamoinCiterne(String immatriculation, double poidsAVide, double charge) {
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
				if(this.charge <= 1.0) {
					vitesse = 110.0;
				}else {
					if((this.charge > 1.0) && (this.charge <= 4.0)) {
						vitesse = 90.0;
					}else {
						if ((this.charge > 4.0) && (this.charge <= POIDAMAXIMUM)) {
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
	*/
	
	@Override
	public String toString() {
		return "CamoinCiterne immatriculation="+ super.immatriculation +" [POIDAVIDE=" 
				+ super.poidsAVide + ", POIDAMAXIMUM=" 
				+ POIDAMAXIMUM + ", VITESSEMAX=" 
				+ this.getVitesseMax()
				+ "]";
	}

	@Override
	public void afficher() {
		System.out.println("Camion Citerne | L'immatriculation : "
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
