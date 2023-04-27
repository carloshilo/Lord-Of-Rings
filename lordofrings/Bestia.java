package lordofrings;

public abstract class Bestia extends Personaje {

	public Bestia(String nombre, int vida, int armadura) {
		super(nombre, vida, armadura);
	}

	@Override
	public int dados() {
		int dado = (int) (Math.random() * 90);
		return dado;
	}
}

