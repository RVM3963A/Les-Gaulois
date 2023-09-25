package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion;
	
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
		return "Le gaulois " + nom + ": "; 
		
	}
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la m�choire de " + romain.getNom() + " !");
		//romain.recevoirCoup(force / 3);

	}
	
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Ast�rix", 8);
		Romain minus = new Romain("Minus",6);
		System.out.println(asterix);
		
		asterix.frapper(minus);
		
	}
	
	
	
}


