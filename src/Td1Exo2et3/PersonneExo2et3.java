package Td1Exo2et3;

class Personne{
	
	/** Declaration de nom et prenom en private ne peut etre lu ou modifier qu'avec get (getters) set (setters).*/
	private String nom;
	private String prenom;
	
	/** Cette methode permet de recuperer le nom qui est en private.
	 * @return	 */
	public String getNom() {
		return nom;
	}
	public String getPrenom() {
		return prenom;
	}
	
	/** Cette methode permet de modifier le nom qui est déclarer en private.
	 * @param nouveau	 */
	public void setNom(String nouveau) {
		nom = nouveau;
	}
	public void setPrenom(String nouveau) {
		prenom = nouveau;
	}
	
}

public class PersonneExo2et3 {
	
	
	private String message = "Bonjour le monde!";
	
	/** On utilise le constructeur par defaut*/
	public PersonneExo2et3(String d) {
		
	}
	
	public String getMsg() {
		return this.message;
	}
	
	public void setMsg(String newMsg) {
		message = newMsg;
	}
	
	/** Cette methode affiche le contenu de l'attribut private message a l'ecran.	 */
	public void affiche() {
		System.out.println(message);
	}
	
	/** Methode principale de mon premier programme.
	 * @param args	 */
	public static void main(String[] args) {
		PersonneExo2et3 prem = new PersonneExo2et3("");
		prem.affiche();
	}

}
