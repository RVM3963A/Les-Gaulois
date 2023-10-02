package histoire;

import personnages.Gaulois;
import personnages.Druide;
import personnages.Romain;

public class Scénario {
	
	public static void main(String[] args) {
		Druide panoramix = new Druide("Panoramix",5,10);
		Romain minus = new Romain("Minus",6);
		Gaulois asterix = new Gaulois("Astérix", 8);
		Gaulois obelix = new Gaulois("Obélix", 25);
		panoramix.parler("Je vais aller préparer une petite potion...");
		panoramix.statut_potion(panoramix.preparePotion());
		panoramix.booster(obelix);
		panoramix.booster(asterix);
		asterix.parler("Bonjour !");
		minus.parler("UN GAU... UN GAUGAU...");
		asterix.frapper(minus);

		
		
		
	}

}
