package Td4Impots;

import java.util.ArrayList;
import java.util.List;
//import java.util.Vector;

public class Commune {
	
	private List<Habitation> com = new ArrayList<Habitation>();
	//private Vector<Habitation> com = new Vector();

	public List<Habitation> getCom() {
		return com;
	}
	
	public double impotsCommune() {
		double total = 0.0;
		//for(int i = 0; i < com.size(); i++) Equivalent du for de la ligne suivante
		for(Habitation h : com) {
			total += h.impots();
		}
		return total;
	}
	
	public void ajoutHabitation(Habitation h) {
		this.com.add(h);
	}

	@Override
	public String toString() {
		return "Commune [com=" + com + "]";
	}
}
