package Td4Carburant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Convoi extends Vehicule{
	
	protected int taille = 0;
	protected int limite = 4;
		
	List<Vehicule> convoiA = new ArrayList<Vehicule>();
	List<Vehicule> convoiB = new ArrayList<Vehicule>();
	
	public Convoi(String immatriculation, List convoiA) {
		super(immatriculation);
	}

	public List<Vehicule> getConvoiA() {
		return convoiA;
	}
	
	public List<Vehicule> getConvoiB() {
		return convoiB;
	}
	
	private void add() {
		
	}
	
	@Override
	public String toString() {
		return "Convoi [taille=" 
				+ taille + ", limite=" 
				+ limite + ", convoiA=" 
				+ convoiA + ", convoiB="
				+ convoiB + ", getConvoiA()="
				+ getConvoiA() + ", getConvoiB()="
				+ getConvoiB() + "]";
	}
	
	@Override
	public void afficher() {
		
	}
	
	public static void main(String[] args) {
		
		Convoi c1 = new Convoi("BG-673-LG", 6, convoiA);
		Convoi c2 = new Convoi("DI-3319-BY", 4600);
		
		c1.add();
		convoiA.add(new vehicule());
		
		/*
		ArrayList<B> array = new ArrayList<B>();
		//On ajoute du contenu
		array.add(new B());
		
		//On appel la classe A
		A classe = new A("nom", array);
		*/
	}

	
}
