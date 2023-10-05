package Td2NombreComplexe;

public class NombreComplexe {
	
	private double reel = 0;
	private double imaginaire = 0;
	private double cosTeta = 0.0;
	private double sinTeta = 0.0;

	/** NombreComplexe est le constructeur par defaut.
	 * @param unX
	 * @param unY	 */
	public NombreComplexe() {
		this.reel = 0.0;
		this.imaginaire = 0.0;
	}
	
	/** On peut construire un nombre complexe en donnant ses coordonnees.
	*@param x reel du point
	*@param y imaginaire du point	*/
	public NombreComplexe(double unX, double unY) {
		this.reel = unX;
		this.imaginaire = unY;
	}
	
	/**
	 * Cette methode permet d'afficher le reel d'un nombre complexe.
	 */
	public double getReel() {
		return this.reel;
	}
	
	/**
	 * Cette methode permet d'afficher l'imaginaire d'un nombre complexe.
	 */
	public double getImaginaire() {
		return this.imaginaire;
	}
	
	/**
	 * Cette methode permet de calculer le module d'un nombre complexe.
	 */
	public double module() {
		return (this.reel*this.reel +
				this.imaginaire*this.imaginaire);
		// return Math.pow(this.imaginaire, 2) +
		//	Math.pow(this.reel,  2);
	}
	
	/** Cette methode permet calculer l'argumet d'un nombre complexe.*/
	public void argument() {
		this.cosTeta = this.reel / module();
		this.sinTeta = this.imaginaire / module();
	}
	
	public NombreComplexe sommeComplexe(NombreComplexe c1, NombreComplexe c2) {
		NombreComplexe c3 = new NombreComplexe();
		c3.reel = c1.reel + c2.reel;
		c3.imaginaire = c1.imaginaire + c2.imaginaire;
		return c3;
	}
	
	public NombreComplexe produitComplexe(NombreComplexe c1, NombreComplexe c2) {
		NombreComplexe c3 = new NombreComplexe();
		c3.reel = (c1.reel * c2.reel) -
				(c1.imaginaire * c2.imaginaire);
		c3.imaginaire = (c1.reel * c2.imaginaire) +
				(c1.imaginaire * c2.reel);		
		return c3;
	}
	
}
