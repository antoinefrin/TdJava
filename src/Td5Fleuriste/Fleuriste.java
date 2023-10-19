package Td5Fleuriste;

import java.util.Vector;

public class Fleuriste implements InterfaceFleuriste {
	
	private Vector<Bouquet> tabBouquet = new Vector<Bouquet>();
	
	// tabFleur permet de servir comme temporaire pour composer le bouquet
	private Vector<Fleurs> tabFleurs = new Vector<Fleurs>();
	
	public Vector<Bouquet> getTabBouquet() {
		return tabBouquet;
	}
	

	public Vector<Fleurs> getTabFleurs() {
		return tabFleurs;
	}

	public void setTabFleurs(Vector<Fleurs> tabFleurs) {
		this.tabFleurs = tabFleurs;
	}
	@Override
	public void creationBouquet(String nom, String prenom) {
		Bouquet b = new Bouquet(nom, prenom);
		tabBouquet.add(b);
	}

	@Override
	public int quantiteEnStock(String nomFleur) {
		for(Fleurs f : tabFleurs) {
			if(f.getNomFleur().equals(nomFleur)) {
				return f.getQuantiteStock();
			}
		}
		return 0;
	}

	@Override
	public float prixDUneFleur(String nomFleur) {
		for(Fleurs f : tabFleurs) {
			if(f.getNomFleur().equals(nomFleur)) {
				return f.getPrixUnitaire();
			}
		}
		return 0;
	}

	@Override
	public void ajoutFleur(String nomFleur, int qte) {
		boolean flag = false;
		for(Fleurs f : tabFleurs) {
			if(f.getNomFleur().equals(nomFleur)) {
				f.setQuantiteStock(qte);
				flag = true;
			}
		}if(flag == false) {
				Fleurs ff = new Fleurs(nomFleur, qte);
				tabFleurs.add(ff);
			}
	}
	
	public void diminuerQuantite(String nomFleur, int qte) {
		for(Fleurs f : tabFleurs) {
			if(f.getNomFleur().equals(nomFleur)) {
				f.diminuerQuantiteStock(qte);
			}
		}
	}
	
	public float  choisirFleurs(String nomFleur, int qte) {
		
		int dernierBouquet = tabBouquet.size()-1;
		int dernierFleur = tabBouquet.elementAt(dernierBouquet).getBq().size()-1;
		
		if(qte <= quantiteEnStock(nomFleur)) {
			diminuerQuantite(nomFleur, qte);
			tabBouquet.elementAt(dernierBouquet).getBq().elementAt(dernierFleur).setQteCommander(qte);
			//qte.setQteCommander(qte);
		return qte * prixDUneFleur(nomFleur);
		}else {
			diminuerQuantite(nomFleur, quantiteEnStock(nomFleur));
			tabBouquet.elementAt(dernierBouquet).getBq().elementAt(dernierFleur).setQteCommander(quantiteEnStock(nomFleur));
			return quantiteEnStock(nomFleur) * prixDUneFleur(nomFleur);
		}
	}

	public void ajouterAuBouquet(String nomFleur, int qte) {
		Fleurs f = new Fleurs(nomFleur, prixDUneFleur(nomFleur), qte);
		// il faut cibler le bouqueten cours du client qu'on a déjà créer
		// elementAt : la case dont l'indice doit être mis comme paramètres
		tabBouquet.elementAt(tabBouquet.size()-1).getBq().add(f);
		facturation();
	}
	
	@Override
	public void facturation() {
		float price = 0;
		int dernierBouquet = tabBouquet.size()-1;
		int dernierFleur = tabBouquet.elementAt(dernierBouquet).getBq().size()-1;
		price = choisirFleurs(tabBouquet.elementAt(dernierBouquet).getBq().elementAt(dernierFleur).getNomFleur(), 
				tabBouquet.elementAt(dernierBouquet).getBq().elementAt(dernierFleur).getQteCommander());
		tabBouquet.elementAt(dernierBouquet).setPrixBouquet(price);
	}
	
	public void afficheDetails() {
		int dernierBouquet = tabBouquet.size()-1;
		int dernierFleur = tabBouquet.elementAt(dernierBouquet).getBq().size()-1;
		
		// Parcourir les bouquets
		for(Bouquet b : getTabBouquet()) {
			System.out.println("Client : "+ b.getPrenom() +" "+ b.getNom());
			for(Fleurs f : b.getBq()) {
				System.out.println(" | "+ f.getNomFleur() +" | "
										+ f.getPrixUnitaire() +" | "
										+ f.getQuantiteStock() +" | "
										+ choisirFleurs(f.getNomFleur(), tabBouquet.elementAt(dernierBouquet).getBq().elementAt(dernierFleur).getQteCommander()) +" | ");

				b.setPrixBouquet(choisirFleurs(f.getNomFleur(), tabBouquet.elementAt(dernierBouquet).getBq().elementAt(dernierFleur).getQteCommander()));
			}
			System.out.println("Le total à payer pour ce bouquet : " + b.getPrixBouquet());
		}
	}
	
}
