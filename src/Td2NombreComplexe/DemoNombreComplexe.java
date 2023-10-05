package Td2NombreComplexe;

public class DemoNombreComplexe {
	
	public static void main(String[] args) {
		NombreComplexe c1 = new NombreComplexe(22.0, 36.0);
		NombreComplexe c2 = new NombreComplexe(12.0, 15.0);
		NombreComplexe c = new NombreComplexe();
		
		
		c1.getReel();
		System.out.println("Le reel du nombre complexe est de "+ c1.getReel() +".");
		c1.getImaginaire();
		System.out.println("La valeur imaginaire du nombre complexe est de  "+ c1.getImaginaire() +".");
		c1.module();
		System.out.println("Le module du nombre complexe est de "+ c1.module() +".");
		
		c2.getReel();
		System.out.println("Le reel du nombre complexe est de "+ c2.getReel() +".");
		c2.getImaginaire();
		System.out.println("La valeur imaginaire du nombre complexe est de  "+ c2.getImaginaire() +".");
		c2.module();
		System.out.println("Le module du nombre complexe est de "+ c2.module() +".");
		
		c1.module();
		System.out.println("La somme partie reel :"+ c.sommeComplexe(c1, c2).getReel());
		System.out.println("La somme partie imaginaire :"+ c.sommeComplexe(c1, c2).getImaginaire());
		System.out.println("Partie reel du produit :"+ c.produitComplexe(c1, c2).getReel());
		System.out.println("Partie imaginaire du produit :"+ c.produitComplexe(c1, c2).getImaginaire());
	}

}
