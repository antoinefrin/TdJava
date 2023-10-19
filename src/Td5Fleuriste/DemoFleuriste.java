package Td5Fleuriste;

import java.util.Vector;

public class DemoFleuriste {

	public static void main(String[] args) {
		
		Fleurs tulipe = new Fleurs("Tulipe", 5, 30);
		Fleurs rose = new Fleurs("Rose", 3, 45);
		Fleurs lilas = new Fleurs("Lilas", 8, 25);
		Fleuriste fl = new Fleuriste();
		
		Vector<Fleurs> vFleur = new Vector<Fleurs>();
		
		vFleur.add(tulipe);
		vFleur.add(rose);
		
		fl.setTabFleurs(vFleur);
		
		fl.creationBouquet("AAA", "bb");
		fl.ajouterAuBouquet("Tulipe", 10);
		fl.ajouterAuBouquet("Rose", 10);
		
		System.out.println("Quantité en stock : "+ fl.quantiteEnStock("Rose"));
		
		System.out.println("Prix unitaire : "+ fl.prixDUneFleur("Rose"));
		
		System.out.println("Prix par type de fleurs : "+ fl.choisirFleurs("Rose", 5));
		
		System.out.println("Quantité restante : "+ fl.quantiteEnStock("Rose"));
		
		System.out.println(fl.getTabBouquet().elementAt(0).getBq().elementAt(0).getNomFleur());
		
		fl.afficheDetails();
	}
}
