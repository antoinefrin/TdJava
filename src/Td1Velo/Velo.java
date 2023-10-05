package Td1Velo;

/*
 * Cette class modelise l'etat du velo d'un
 * cycliste qui roule.
 */
public class Velo {

/**
 * La vitesse actuelle du velo.
 */
protected int vitesse = 0;
	
/**
 * Le cycliste accelere.
 * @param increment indique de combien
 * la vitesse du velo augmente.
 */
public void accelerer(int increment) {
	this.vitesse = this.vitesse + increment;
}

/**
 * Le cycliste freine.
 * @param decrement indique de combien la vitesse du velo baisse.
 */
public void freiner(int decrement) {
	//this.vitesse = this.vitesse - decrement;
	//Si la vitesse est inférieur a decrement alors
	//on va avoir un vitesse negative
	if(this.vitesse > decrement) {
		this.vitesse -= decrement;
	}else {
		this.vitesse =0;
	}
	
}

/**
 * Affiche l'etat du velo, i.e. sa vitesse
 */
public void imprimeEtat() {
	System.out.println("vitesse: "+ vitesse);
}

/**
 * Cette methode permet de recuperer la vitesse qui est en "private".
 * @return
 */
public int getVitesse(){
	return this.vitesse;
}

/**
 * Cette methode permet d'afficher la vitesse du velo.
 */
public void afficheVitesse() {
	System.out.println("Le velo roule a "+ vitesse +"km.");
}

}
