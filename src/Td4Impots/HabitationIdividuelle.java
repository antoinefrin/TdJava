package Td4Impots;

public class HabitationIdividuelle extends Habitation{
	
	private int nbPieces;
	private boolean piscine;
	protected final double PRIXPARPIECES = 100;
	private final double TAXEPISCINE = 500;

	public HabitationIdividuelle(String p, String a, double s, int nbP) {
		super(p, a, s);
		this.nbPieces = nbP ;
	}
	
	public HabitationIdividuelle(String p, String a, double s, int nbP, boolean pisc) {
		super(p, a, s);
		this.nbPieces = nbP ;
		this.piscine = pisc;
	}
	
	/*public double taxePieces() {
		return impots() + (100 * this.nbPieces);
		//double taxeEtImpots;
		//taxeEtImpots = impots() + (100 * this.nbPieces);
		//return taxeEtImpots;
	}*/	
	
	@Override
	public double impots() {
		if(this.piscine) {
			return super.impots() + TAXEPISCINE + (this.nbPieces * PRIXPARPIECES);
		}return super.impots() + (this.nbPieces * PRIXPARPIECES);
		
	}
	
	@Override
	public String toString() {
		return super.toString() + " HabitationIdividuelle [nbPieces="
				+ nbPieces +", piscine="
				+ piscine +", PRIXPARPIECES="
				+ PRIXPARPIECES +", TAXEPISCINE="
				+ TAXEPISCINE +"]";
	}

	public void afficher() {
		System.out.println(super.toString() + " Nombre de pièces : "
				+ this.nbPieces +" Piscine : "
				+ this.piscine);
	}
}