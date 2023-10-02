package LieuHabitants;
import personnages.Chef;
import personnages.Gaulois;

public class Village {
	private String nom;
	private Chef chef;
	private Gaulois[] villageois;
	private int nbVillageois = 0;
	
	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		this.villageois = new Gaulois[nbVillageoisMaximum];

	}
	
	public void setChef(Chef chef) {
		this.chef = chef;
	}	

	
	public String getNom() {
		return nom;
	}
	
	public void ajouterHabitant(Gaulois nomG) {
		villageois[nbVillageois] = nomG;
		nbVillageois += 1;
		
	}
	
	public Gaulois trouverHabitant(int numVillageois) {
		if (villageois[numVillageois] != null) {
			return villageois[numVillageois];
		}
		System.out.println("Il n'y a pas de Gaulois de numéro " + numVillageois + "...");
		return null;
		
	}
	
	public static void main(String[] args) {
		Village vGaulois = new Village("Village des irréductibles", 30);
		Chef abrara = new Chef("Abraracourcix",6, vGaulois);
		Gaulois asterix = new Gaulois("Astérix", 8);
		vGaulois.ajouterHabitant(asterix);	
	}
	
	
	
}


