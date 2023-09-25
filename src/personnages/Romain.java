package personnages;

public class Romain {
	private String nom;
	private int force;
	public Romain(String nom, int force) {
		super();
		this.nom = nom;
		this.force = force;
	}
	public String getNom() {
		return nom;
	}
	private void parler(String texte) {
		System.out.println(prendreParole() + "<< "+ texte + " >>");

	}
	private String prendreParole() {
		return "Le Romain " + nom + " : ";
	}
	
	private void recevoirCoup(int forceCoup) {
		force -= forceCoup;
		if (force > 0) {
			parler("A�e !");
		} else {
			parler("J'abandonne...");
		}

	}
	
	public static void main(String[] args) {
		Romain minus = new Romain("Minus",6);
		
	}
	

}
