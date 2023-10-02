package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;
	
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	public String getNom() {
		return nom;
	}
	
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}
	
	public void parler(String texte) {
		System.out.print(prendreParole());
		System.out.println(texte);
	}
	private String prendreParole() {
		return "Le gaulois " + nom + " : "; 
		
	}
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom() + " !");
		force = (force/3)*effetPotion;
		romain.recevoirCoup(force);
		

	}
	
	public void boirePotion(int forcePotion) {
		effetPotion = forcePotion;
		parler("Merci Druide ! Je sens que ma force est " + effetPotion +" fois décuplée !");
	}
	
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 8);
		Romain minus = new Romain("Minus",6);
		System.out.println(asterix);
		asterix.boirePotion(5);
		asterix.frapper(minus);
		
	}
	
	
	
	
	
}


