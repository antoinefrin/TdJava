package Td4Carburant;

public class DemoCarburant {

	public static void main(String[] args) {
		
		PetitBus pb1 = new PetitBus("AD-4.6-GR");
		
		
		CamoinCiterne cc1 = new CamoinCiterne("BG-673-LG");
														//Poid en KG
		CamoinCiterne cc2 = new CamoinCiterne("BG-673-LG", 0);
		CamoinCiterne cc3 = new CamoinCiterne("BG-673-LG", 800);
		CamoinCiterne cc4 = new CamoinCiterne("BG-673-LG", 3000);
		CamoinCiterne cc5 = new CamoinCiterne("BG-673-LG", 5000);
		CamoinCiterne cc6 = new CamoinCiterne("BG-673-LG", 11000);
		
		CamionBacher cb1 = new CamionBacher("DI-3319-BY") ;
														//Poid en KG
		CamionBacher cb2 = new CamionBacher("DI-3319-BY", 0) ;
		CamionBacher cb3 = new CamionBacher("DI-3319-BY", 2500) ;
		CamionBacher cb4 = new CamionBacher("DI-3319-BY", 4600) ;
		CamionBacher cb5 = new CamionBacher("DI-3319-BY", 8000) ;
		CamionBacher cb6 = new CamionBacher("DI-3319-BY", 20100) ;
		
		System.out.println("************* pb1 *************");
		pb1.afficher();
		
		System.out.println("");
		System.out.println("************* cc1 *************");
		cc1.afficher();
		System.out.println("");
		System.out.println("************* cc2 *************");
		cc2.afficher();		
		cc2.charge();
		System.out.println("");
		System.out.println("************* cc3 *************");
		cc3.afficher();
		cc3.charge();
		System.out.println("");
		System.out.println("************* cc4 *************");
		cc4.afficher();
		cc4.charge();
		System.out.println("");
		System.out.println("************* cc5 *************");
		cc5.afficher();
		cc5.charge();
		System.out.println("");
		System.out.println("************* cc6 *************");
		cc6.afficher();
		cc6.charge();
		
		System.out.println("");
		System.out.println("************* cb1 *************");
		cb1.afficher();
		System.out.println("");
		System.out.println("************* cb2 *************");
		cc2.afficher();		
		cb2.charge();
		System.out.println("");
		System.out.println("************* cb3 *************");
		cc3.afficher();
		cb3.charge();
		System.out.println("");
		System.out.println("************* cb4 *************");
		cc4.afficher();
		cb4.charge();
		System.out.println("");
		System.out.println("************* cb5 *************");
		cc5.afficher();
		cb5.charge();
		System.out.println("");
		System.out.println("************* cb6 *************");
		cc6.afficher();
		cb6.charge();
	}

}
