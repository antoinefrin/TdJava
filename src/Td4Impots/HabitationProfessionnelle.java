package Td4Impots;

public class HabitationProfessionnelle extends Habitation{
	
	private int nbEmployes;
	

	public HabitationProfessionnelle(String proprietaire, String adresse, double surface, int nbEmployes) {
		super(proprietaire, adresse, surface);
		this.nbEmployes = nbEmployes;
	}

	@Override
	public double impots() {
		int tranche = this.nbEmployes / 10;
		return super.impots() + (tranche * 1000);
	}
	
	@Override
	public String toString() {
		return "HabitationProfessionnelle [nbEmployes=" + nbEmployes + ", toString()=" + super.toString() + "]";
	}

	@Override
	public void afficher() {
		super.afficher();
		System.out.println(" Nombre d'employés : "+ this.nbEmployes);
	}
}
