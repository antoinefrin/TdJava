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
	
	public void triRechMin(int[] t, int n) {
		int minValeur;
		// int indiceMin = 0;
		for(int j = 0; j < n; j++) {
			minValeur = Integer.MAX_VALUE;
			for(int i = j; i < n; i++) {
				if(t[i] < minValeur) {
					// A chaque minimum trouver je dois faire une permutation
					minValeur = t[i];
					t[i] = t[j];
					t[j] = minValeur;					
				}
			}
		}
	}

}