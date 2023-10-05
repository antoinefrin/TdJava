package Td1PointRectangle;

public class Point {
	
	/** Abscisse du point */
	public int abscisse = 0;
	
	/** Ordonnee du point */
	public int ordonnee = 0;
	
	/** On peut construire un point en donnant ses coordonnees.
	*@param x abscisse du point
	*@param y ordonnee du point	*/
	public Point(int unX, int unY) {
		abscisse = unX;
		ordonnee = unY;
	}
	
	/** Cette methode parametre par defaut, l’origine du point. */
	public Point() {
		this(0, 0);
	}
	
	/** Cette methode permet de modifier les valeur de point qui est déclarer en "private".
	 * @param origine	 */
	public void setOrigin(int deuxX, int deuxY) {
		this.abscisse = deuxX;
		this.ordonnee = deuxY;
	}
	
	/** Cette methode permet de recuperer l'abcisse du point qui est déclarer en "private".
	 * @return abcisse	 */
	public int getNewAbcisse() {
		return this.abscisse;
	}
	
	/** Cette methode permet de recuperer l'ordonnee du point qui est déclarer en "private".
	 * @return ordonnee	 */
	public int getNewOdonnee() {
		return this.ordonnee;
	}
	
}
