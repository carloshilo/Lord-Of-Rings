package proyectojava;

import lordofrings.*;
import java.util.*;

public class Main {
 public static void main(String[] args) {
	 List<Heroe> ejercitoHeroes = new ArrayList<>();
	 List<Bestia> ejercitoBestias = new ArrayList<>();

	 //Ejército de héroes
	 ejercitoHeroes.add(new Elfo("Légolas", 150, 30));
	 ejercitoHeroes.add(new Humano("Aragorn", 150, 50));
	 ejercitoHeroes.add(new Humano("Boromir", 100, 60));
	 ejercitoHeroes.add(new Humano("Gandalf", 300, 30));
	 ejercitoHeroes.add(new Hobbit("Frodo", 20, 10));
	 
	 //Ejército de bestias
	 ejercitoBestias.add(new Orco("Lurtz", 200, 60));
	 ejercitoBestias.add(new Orco("Shagrat", 220, 50));
	 ejercitoBestias.add(new Trasgo("Uglúk", 120, 30));
	 ejercitoBestias.add(new Trasgo("Mauhúr", 100, 30));
	 
	 //Batalla
	 LordOfRings.batalla(ejercitoHeroes, ejercitoBestias);
 }
}
