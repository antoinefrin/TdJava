package Td3BiblioBus;

public class Genre {
	/*
	private String genre;
	private String littératureFrancaise;
	private String littératureJeunnesse;
	private String littératurePolicier;
	
	public Genre() {
		
	}
	public Genre(String genre) {
		this.genre = genre;
	}
	*/
	
	public String genre;
	
	public void genre() {
		enum typeGenre{
			littératureFrancaise,
			Jeunnesse,
			Policier,
			Non_specifie;
			
			private String genre;
		}
	}
	
	/*
	public String toStringGenre() {
		return " Genre : "+ this.genre +".";
	}
	
	public String getLittératureFrancaise() {
		return littératureFrancaise;
	}

	public void setLittératureFrancaise(String littératureFrancaise) {
		this.littératureFrancaise = littératureFrancaise;
	}

	public String getLittératureJeunnesse() {
		return littératureJeunnesse;
	}

	public void setLittératureJeunnesse(String littératureJeunnesse) {
		this.littératureJeunnesse = littératureJeunnesse;
	}

	public String getLittératurePolicier() {
		return littératurePolicier;
	}

	public void setLittératurePolicier(String littératurePolicier) {
		this.littératurePolicier = littératurePolicier;
	}
	*/
	
}
