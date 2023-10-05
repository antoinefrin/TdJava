package Td1Velo;

/**
 * Class de tests pour la class @class velo.
 */
public class DemoVelo {

	public static void main(String[] args) {
		// Genere deuc objets differents du type Velo.
		Velo velo1 = new Velo();
		Velo velo2 = new Velo();
		
		// Invoque les methodes.
		velo1.accelerer(10);
		velo1.imprimeEtat();
		velo2.accelerer(20);
		velo2.imprimeEtat();
		
		Velo vitesse = new Velo();
		//vitesse.accelerer();
		System.out.println(vitesse.getVitesse());
		vitesse.afficheVitesse();
		System.out.println(""+velo1.getVitesse());
		
		while(velo1.getVitesse()<=40) {
			velo1.accelerer(3);
			velo1.imprimeEtat();
		}
		
		for(int i = 0; i < 20; i++) {
			velo1.freiner(5);
			velo1.imprimeEtat();
		}
	}

}
