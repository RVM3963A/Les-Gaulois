package histoire;

import personnages.Gaulois;
import personnages.Romain;

public class Scénario {
	
	public static void main(String[] args) {
		Romain minus = new Romain("Minus",6);
		Gaulois asterix = new Gaulois("Astérix", 8);
		asterix.parler("Bonjour à tous !");
		minus.parler("UN GAU... UN GAUGAU...");
		asterix.frapper(minus);
		minus.recevoirCoup(2);
		asterix.frapper(minus);
		minus.recevoirCoup(2);
		asterix.frapper(minus);
		minus.recevoirCoup(2);
		
		
		
	}

}
