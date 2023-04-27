package lordofrings;

import java.util.List;

public class LordOfRings {

	public static void batalla(List<Heroe> heroes, List<Bestia> bestias) {
		int ronda = 1;

		while (heroes.size() > 0 && bestias.size() > 0) {
			ataqueHeroe(heroes, bestias, ronda);
			ronda++;
		}

		if (heroes.size() == 0) {
			System.out.println("¡Las bestias ganas! La era oscura ha comenzado.");
		} else {
			System.out.println("¡Los héroes ganan! El mundo volverá a ver el amanecer.");
		}
	}

	private static void ataqueHeroe(List<Heroe> heroesLista, List<Bestia> bestiasLista, int ronda) {

		int pos = 0;

		System.out.println("Ronda " + ronda);

		while (pos < heroesLista.size() && pos < bestiasLista.size()) {

			Heroe heroes = heroesLista.get(pos);
			Bestia bestias = bestiasLista.get(pos);

			int vidaHeroe = heroes.getVida();
			int vidaBestia = bestias.getVida();

			System.out.println("  Lucha: " + heroes.getNombre() + " (" + heroes.getVida() + ") contra "
					+ bestias.getNombre() + " (" + bestias.getVida() + ")");
			
			int ataqueHeroe = heroes.dados();
			int ataqueBestia = bestias.dados();

			if (ataqueHeroe > bestias.getArmadura()) {
				int resto = 0;
				resto = ataqueHeroe - bestias.getArmadura();
				
				if (heroes instanceof Elfo && bestias instanceof Orco) {
					resto += 10;
				}
				if (heroes instanceof Hobbit && bestias instanceof Trasgo) {
					resto -= 5;
					
					if (resto > bestias.getArmadura()) {
						System.out.println("    " + heroes.getNombre() + " inflinge " + ataqueHeroe
								+ " puntos de daño y le quita " + resto + " puntos de vida a " + bestias.getNombre()
								+ " (" + bestias.getVida() + ")");
					}
				}
				System.out.println("    " + heroes.getNombre() + " inflinge " + ataqueHeroe
						+ " puntos de daño y le quita " + resto + " puntos de vida a " + bestias.getNombre()
						+ " (" + bestias.getVida() + ")");
				vidaBestia -= resto;
				bestias.setVida(vidaBestia);
			} else {
				System.out.println("    " + heroes.getNombre() + " inflinge " + ataqueHeroe
						+ " puntos de daño y le quita 0 puntos de vida a " + bestias.getNombre()
						+ " (" + bestias.getVida() + ")");
			}
			
			if (ataqueBestia < heroes.getArmadura()) {
				int resto = 0;
				int armadura = heroes.getArmadura();
						
				if (bestias instanceof Orco) {
					armadura *= 90;
					armadura /= 100;
				}
				
				resto = ataqueBestia - armadura; 
				System.out.println("    " + bestias.getNombre() + " inflinge " + ataqueBestia
						+ " puntos de daño y le quita " + resto + " puntos de vida a " + heroes.getNombre()
						+ " (" + heroes.getVida() + ")");
				vidaHeroe -= resto;
				heroes.setVida(vidaHeroe);
			} else {
				System.out.println("    " + bestias.getNombre() + " inflinge " + ataqueBestia
						+ " puntos de daño y le quita 0 puntos de vida a " + heroes.getNombre()
						+ " (" + heroes.getVida() + ")");
			}
			if (vidaBestia <=0) {
				System.out.println("    *" + bestias.getNombre() + " ha muerto.*");
				bestiasLista.remove(pos);
			}
			if (vidaHeroe <=0) {
				System.out.println("    *" + heroes.getNombre() + " ha muerto.*");
				heroesLista.remove(pos);
			}
			pos++;
		}
	}
}
