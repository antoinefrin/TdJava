package Td1PointRectangle;

public class Rectangle {

	private Point origine;
	private int largeur = 0;
	private int hauteur = 0;
	private int perimetre = 0;
	private int surface = 0;
	
	public Rectangle(Point p, int l, int h) {
		origine = p;
		largeur = l;
		hauteur = h;
		perimetre = (l*2) + (h*2);
		surface = l*h;
	}
	
	/** Cette methode permet de recuperer la largeur qui est en "private".
	 * @return	 */
	public int getLargeur(){
		return this.largeur;
	}
	
	/** Cette methode permet de recuperer la hauteur qui est en "private".
	 * @return	 */
	public int getHauteur(){
		return this.hauteur;
	}
	
	/** Cette methode permet de recuperer la largeur qui est en "private".
	 * @return	 */
	public int getAbscisse(){
		return origine.abscisse;
	}
	
	/** Cette methode permet de recuperer la hauteur qui est en "private".
	 * @return	 */
	public int getOrdonnee(){
		return origine.ordonnee;
	}
	
	/** Cette methode permet d'afficher le perimetre du rectangle.
	 * @return	 */
	public int getPerimetre(){
		return this.perimetre;
	}
	
	/** Cette methode permet d'afficher la surface du rectangle.
	 * @return	 */
	public int getSurface(){
		return this.surface;
	}

}
