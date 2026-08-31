
public class Chat extends Animal { // héritage de animal
	
	private String couleur;
	
	public Chat(String nom, int age, String uneCouleur) { //héritage via super
		super(nom, age);
		this.couleur = uneCouleur;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String uneCouleur) {
		this.couleur = uneCouleur;
	}
	
	public String getType() { //obligatoire à cause de héritage + polymorphisme avec Chien (2 meme méthode)
		return "Chat";
	}
	
	public String getInformation() {
		return couleur;
	}

	
}