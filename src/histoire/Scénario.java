package histoire;

import personnages.Gaulois;
import personnages.Druide;
import personnages.Romain;

public class Sc�nario {
	
	public static void main(String[] args) {
		Druide panoramix = new Druide("Panoramix",5,10);
		Romain minus = new Romain("Minus",6);
		Gaulois asterix = new Gaulois("Ast�rix", 8);
		Gaulois obelix = new Gaulois("Ob�lix", 25);
		panoramix.parler("Je vais aller pr�parer une petite potion...");
		panoramix.statut_potion(panoramix.preparePotion());
		panoramix.booster(obelix);
		panoramix.booster(asterix);
		asterix.parler("Bonjour !");
		minus.parler("UN GAU... UN GAUGAU...");
		asterix.frapper(minus);

		
		
		
	}

}
