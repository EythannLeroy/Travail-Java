import java.util.ArrayList;

public class Menagerie {
	
	private ArrayList<Animal> animaux; //mise en place d'une collection sous arrayList
	
	public Menagerie() {
		animaux = new ArrayList<>(); //? problème arraylist à voir
	}
	
	public void ajouterAnimal(Animal unAnimal) { // ajout animal
		animaux.add(unAnimal);
	}
	
	public void supprimerAnimal(Animal unAnimal) { //suppression animal
		animaux.remove(unAnimal);
	}
	
	public ArrayList<Animal> getAnimaux() { //consultation de tout les animaux
		return animaux;
	}
	
	public Animal rechercherAnimal(String nom) {
		for (Animal unAnimal : animaux) {
			if (unAnimal.getNom().equalsIgnoreCase(nom)) { //fail safe lors de la rentré du nom lors de recherche
				return unAnimal; //si animal trouvé
			}
		}
			
		
		return null; //Sinon renvoie un null (pas de string possible car doit retourner un obj de la méthode animal)
	}
}
