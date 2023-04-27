package lordofrings;

public abstract class Personaje {
	
	private String nombre;
	private int vida;
	private int armadura;
	public Personaje(String nombre, int vida, int armadura) {
		super();
		this.nombre = nombre;
		this.vida = vida;
		this.armadura = armadura;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getArmadura() {
		return armadura;
	}
	public void setArmadura(int armadura) {
		this.armadura = armadura;
	}

	public abstract int dados();
}
