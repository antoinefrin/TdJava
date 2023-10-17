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
		System.out.println("test" + vitesseMaxConvoi);
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
}
