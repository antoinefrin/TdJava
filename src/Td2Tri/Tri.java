package Td2Tri;

import java.util.Scanner;

public class Tri {
	
	//private String ch = "";
	
	public int lireTaille(){
		int taille = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter la taille du tableau : ");
		// Pour lire un numerique
		taille = sc.nextInt();
		return taille;
		
		// Pour lire une chaine de caractere
		//ch = sc.next();		
		// Retour pour String
		//return ch;
	}
	
	public void remplirTableau(int[] t, int n) {
		for(int i = 0; i < n; i++ ) {
			t[i] = (int) Math.ceil(Math.random() * 100);
		}
	}
	
	public void afficherTableau(int[] t, int n) {
		for(int i = 0; i < n; i++) {
			System.out.println(t[i]);
		}
	}
	
	public void triBulle(int[] t, int n) {
		int tmp;
		boolean trier = false;
		while(!trier) { //Equivalent trier == false
			trier = true;
			for(int i =0; i < n-1; i++) {
				if(t[i] > t[i+1]) {
					tmp = t[i];
					t[i] = t[i+1];
					t[i+1] = tmp;
					// Le tableau n'estr pas encore trier
					trier = false;
				}
			}
		}
	}

}