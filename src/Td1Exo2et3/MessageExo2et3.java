package Td1Exo2et3;

class Message{
	
	/**
	 * Declaration d'un  message en "private" ne peut etre lu ou modifier
	 * qu'avec "get" (getters) "set" (setters).
	 */
	private String msg;
	
	public  Message(String ch) {
		msg = "Bonjour";
	}
	
	/**
	 * Cette methode permet de recuperer le message qui est en "private".
	 * @return
	 */
	public String getMsg(){
		return msg;
	}
	
	/**
	 * Cette methode permet de modifier le message qui est déclarer en "private".
	 * @param message
	 */
	public void setMsg(String newMsg) {
		this.msg = newMsg;
	}
	
	/**
	 * Cette methode affiche le contenu de l'attribut prive message a l'ecran.
	 */
	public void affiche() {
		System.out.println(msg);
	}
	
}
