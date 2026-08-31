
public abstract class Animal { //Partie abstract pour héritage
	
	private String nom; //Encapsulation 
	private int age;
	
	public Animal(String unNom, int unAge) {
		this.nom = unNom;
		this.age = unAge;
	}

	public String getNom() { //Getter
		return nom;
	}

	public void setNom(String unNom) { //Setter
		this.nom = unNom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int unAge) {
		this.age = unAge;
	}
	
	
	public abstract String getType(); //Méthode abstract 
	
	public abstract String getInformation(); //méthode abstrete pour panel consultation
	

	public String toString() { //toString
		return getType() + " / " + nom + " / " + age + " ans ";
	}
	
}
