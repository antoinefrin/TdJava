package Td1PointRectangle;

public class DemoRectangle {

	public static void main(String[] args){
		
		Point unPoint = new Point(23, 94);
		Rectangle unRectangle = new Rectangle(unPoint, 100, 200);
		
		// Invoque les methodes.
		unRectangle.getLargeur();
		System.out.println("La largeur du rectangle est de "+ unRectangle.getLargeur() +".");
		
		unRectangle.getHauteur();
		System.out.println("La hauteur du rectangle est de "+ unRectangle.getHauteur() +".");
		
		System.out.println("La abscisse du rectangle est de "+ unPoint.abscisse +".");
		
		System.out.println("L'ordonnee du rectangle est de "+ unPoint.ordonnee +".");
		
		unRectangle.getPerimetre();
		System.out.println("Le perimetre du rectangle est de "+ unRectangle.getPerimetre() +".");
		
		unRectangle.getSurface();
		System.out.println("La surface du rectangle est de "+ unRectangle.getSurface() +".");
		
		Point deuxPoint = new Point();
		deuxPoint.setOrigin(50, 83);
		System.out.println("Les nouvelles valeur du point sont "+ deuxPoint.abscisse +", "+ deuxPoint.ordonnee +".");
		
		deuxPoint.getNewAbcisse();
		deuxPoint.getNewOdonnee();
		System.out.println("Les valeurs de l'origine du rectangle sont "+ deuxPoint.getNewAbcisse() +", "+ deuxPoint.ordonnee +".");
	}
}
