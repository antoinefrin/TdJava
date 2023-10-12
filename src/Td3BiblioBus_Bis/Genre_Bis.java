package Td3BiblioBus_Bis;

public enum Genre_Bis {
	Non_specifie(0),
	littératureFrancaise(1),
	Jeunnesse(1),
	Policier(1),
	BandeDessinee(1),
	Doccumentaire(1),
	Classique(2),
	Jazz(2),
	MusiqueDuMonde(2),
	Rock(2),
	Pop(2),
	ChasonFrancaise(2);
	
	int support;
	
	Genre_Bis(int g){
		support = g;
	}
	
	int getSupport() {
		return support;
	}
	
}
