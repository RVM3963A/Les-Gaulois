package histoire;

import personnages.Gaulois;
import personnages.Romain;

public class Sc�nario {
	
	public static void main(String[] args) {
		Romain minus = new Romain("Minus",6);
		Gaulois asterix = new Gaulois("Ast�rix", 8);
		asterix.parler("Bonjour � tous !");
		minus.parler("UN GAU... UN GAUGAU...");
		asterix.frapper(minus);
		minus.recevoirCoup(2);
		asterix.frapper(minus);
		minus.recevoirCoup(2);
		asterix.frapper(minus);
		minus.recevoirCoup(2);
		
		
		
	}

}
