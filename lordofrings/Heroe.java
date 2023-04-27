package lordofrings;

public abstract class Heroe extends Personaje {

	public Heroe(String nombre, int vida, int armadura) {
		super(nombre, vida, armadura);
	}

	@Override
	public int dados() {
		int dado1 = (int) (Math.random() * 100);
		int dado2 = (int) (Math.random() * 100);
		
		if (dado1 < dado2) {
			return dado2;
		}
		return dado1;
	}
}
