package Td4Carburant;

public class DemoCarburant {

	public static void main(String[] args) {
		
		System.out.println("************* pb1 *************");
		PetitBus pb1 = new PetitBus("AD-4.6-GR", 4.0);
		System.out.println(pb1);
		pb1.afficher();
		
		System.out.println("");
		System.out.println("************* cc1 *************");
		CamoinCiterne cc1 = new CamoinCiterne("BG-673-LG", 3.0, 0);
		System.out.println(cc1);
		cc1.afficher();
		System.out.println(cc1.getVitesseMax());
		
		System.out.println("");
		System.out.println("************* cc2 *************");
		CamoinCiterne cc2 = new CamoinCiterne("BG-673-LG", 3.0, 0.8);
		cc2.afficher();
		System.out.println(cc2.getVitesseMax());
		
		System.out.println("");
		System.out.println("************* cc3 *************");
		CamoinCiterne cc3 = new CamoinCiterne("BG-673-LG", 3.0, 3.0);
		cc3.afficher();
		System.out.println(cc3.getVitesseMax());
		
		System.out.println("");
		System.out.println("************* cc4 *************");
		CamoinCiterne cc4 = new CamoinCiterne("BG-673-LG", 3.0, 5.0);
		cc4.afficher();
		System.out.println(cc4.getVitesseMax());
		
		System.out.println("");
		System.out.println("************* cc5 *************");
		CamoinCiterne cc5 = new CamoinCiterne("BG-673-LG", 3.0, 11.0);
		cc5.afficher();
		System.out.println(cc5.getVitesseMax());
		
		
		System.out.println("");
		System.out.println("************* cb1 *************");
		CamionBacher cb1 = new CamionBacher("DI-3319-BY", 4.0, 0);
		cb1.afficher();
		System.out.println(cb1.getVitesseMax());
		
		System.out.println("");
		System.out.println("************* cb2 *************");
		CamionBacher cb2 = new CamionBacher("DI-3319-BY", 4.0, 2.5);
		cc2.afficher();
		System.out.println(cb2.getVitesseMax());
		
		System.out.println("");
		System.out.println("************* cb3 *************");
		CamionBacher cb3 = new CamionBacher("DI-3319-BY", 4.0, 4.6);
		cc3.afficher();
		System.out.println(cb3.getVitesseMax());
		
		System.out.println("");
		System.out.println("************* cb4 *************");
		CamionBacher cb4 = new CamionBacher("DI-3319-BY", 4.0, 8.0);
		cc4.afficher();
		System.out.println(cb4.getVitesseMax());
		
		System.out.println("");
		System.out.println("************* cb5 *************");
		CamionBacher cb5 = new CamionBacher("DI-3319-BY", 4.0, 20.1);
		cc5.afficher();
		System.out.println(cb5.getVitesseMax());
				
		System.out.println("");
		System.out.println("************* CONVOI *************");		
		System.out.println("************* Début ajout Véhicule *************");
		Convoi c = new Convoi();
		c.ajoutVehicule(cb3);
		c.ajoutVehicule(cc4);
		c.ajoutVehicule(cb5);
		c.ajoutVehicule(cc3);
		c.getVitesseMaxConvoi();
		System.out.println(c);
		System.out.println("************* Fin ajout Véhicule *************");
	
		System.out.println("");
		System.out.println("************* CONVOI Consommation *************");
		System.out.println("Consommation total du convoi "+ c.consommationConvoi(c.vitesseMaxConvoi));
		
		System.out.println("");
		System.out.println("************* VEHICULE Consommation *************");
		System.out.println("Consommation camion citerne "+ cc3.consommation(cc3.getVitesseMax(), cc3.getPoidsTotal()));
		System.out.println("Consommation camion bâche "+ cb3.consommation(cb3.getVitesseMax(), cb3.getPoidsTotal()));
		System.out.println("Consommation petit bus "+ pb1.consommation(pb1.getVitesseMax(), pb1.getPoidsTotal()));
	}

}
