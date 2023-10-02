package personnages;

import java.util.Random;
public class Druide {
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	private int forcePotion = 1;
	
	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		parler("Bonjour, je suis le druide " + nom + " et ma potion peut aller d'une force " + effetPotionMin + " à " + effetPotionMax + ".");
	}
		
		
	public String getNom() {
		return nom;	
	}
	
	
	public void parler(String texte) {
		// TODO Auto-generated method stub
		System.out.println(prendreParole() + "<< " + texte + " >>");
	}

	private String prendreParole() {
		// TODO Auto-generated method stub
		return "Le druide " + nom + " : ";
	}
	
	public int preparePotion() {
		Random random = new Random();
		return random.nextInt(effetPotionMin, effetPotionMax);
		
	}
	
	public void statut_potion(int force) {
		if (force >= 7) {
			parler("J'ai préparer une super potion de force");
		}
		else{
			parler("Je n'ai pas trouvé tous les ingrédients, ma potion est seulement de force " + force + "...");
		}
		forcePotion = force;
	}
	
	public void booster(Gaulois nomG) {
		if (nomG.getNom() == "Obélix") {
				parler("Non Obélix !... Tu n'auras pas de potion magique !");
				nomG.parler("Par Bénélos, ce n'est pas juste !");
		}
		else nomG.boirePotion(forcePotion);
		
		
	}
	
	
	public static void main(String[] args) {
		Druide panoramix = new Druide("Panoramix", 5, 10);
		panoramix.parler("Salut c'est moi");
		panoramix.statut_potion(panoramix.preparePotion());
	}
	
	
	
	
}
