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
	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole());
	}
	private String prendreParole() {
		return "Le romain" + nom + ":"; 
		
	}
	public void frapper(Romain romain) {
		System.out.println(nom + "envoie un grand coup dans la m�achoire de " + romain.getNom());
		romain.recevoirCoup(force / 3);

	}
	
	public static void main(String[] args) {
		
	}
	
}


