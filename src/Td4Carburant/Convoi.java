package Td4Carburant;

import java.util.List;
import java.util.Vector;

public class Convoi {
	
	private Vector<Vehicule> convoiA = new Vector<Vehicule>();
	
	protected double vitesseMaxConvoi;	
	
	
	
	public void getVitesseMaxConvoi() {
		double min = Double.MAX_VALUE;
		for (Vehicule veh : convoiA) {
			if(veh.getVitesseMax() < min) {
				min = veh.getVitesseMax();						
			}
		}
		this.vitesseMaxConvoi = min;
	}
	
	@Override
	public String toString() {
		String ch = "";
		for(Vehicule veh : convoiA) {
			ch += veh.toString();
			ch +="\n";
		}
		return ch + this.vitesseMaxConvoi;
	}

	public void ajoutVehicule(Vehicule veh) {
		convoiA.add(veh);
	}
	
	public double consommationConvoi(double vitesseConvoi ) {
		double consommationTotal = 0.0;
		for(Vehicule veh : convoiA){
			consommationTotal += veh.consommation(vitesseConvoi, veh.getPoidsTotal());
		}
		return consommationTotal;
	}
}
