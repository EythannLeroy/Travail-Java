
public class Chien extends Animal { //Héritage de Animal pour Chien

	private String race;
	
	public Chien(String nom, int age, String uneRace) {
		super(nom, age); //appel de l'héritage 
		this.race = uneRace;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String uneRace) {
		this.race = uneRace;
	}
	
	public String getType() { //héritage de animal OBLIGATOIRE + polymorphisme avec Chat (les 2 ont la meme méthode)
		return "Chien";
	}
	
	public String getInformation() {
		return race;
	}

}
