package personnages;

public class Druide {
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	
	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		parler("Bonjour, je suis le druide " + nom + " et ma potion peut aller d'une force " + effetPotionMin + " � " + effetPotionMax + ".");
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
	
	
	
	

}
