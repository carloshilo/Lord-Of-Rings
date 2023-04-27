package proyectojava;

import lordofrings.*;
import java.util.*;

public class Main {
 public static void main(String[] args) {
	 List<Heroe> ejercitoHeroes = new ArrayList<>();
	 List<Bestia> ejercitoBestias = new ArrayList<>();

	 //Ej�rcito de h�roes
	 ejercitoHeroes.add(new Elfo("L�golas", 150, 30));
	 ejercitoHeroes.add(new Humano("Aragorn", 150, 50));
	 ejercitoHeroes.add(new Humano("Boromir", 100, 60));
	 ejercitoHeroes.add(new Humano("Gandalf", 300, 30));
	 ejercitoHeroes.add(new Hobbit("Frodo", 20, 10));
	 
	 //Ej�rcito de bestias
	 ejercitoBestias.add(new Orco("Lurtz", 200, 60));
	 ejercitoBestias.add(new Orco("Shagrat", 220, 50));
	 ejercitoBestias.add(new Trasgo("Ugl�k", 120, 30));
	 ejercitoBestias.add(new Trasgo("Mauh�r", 100, 30));
	 
	 //Batalla
	 LordOfRings.batalla(ejercitoHeroes, ejercitoBestias);
 }
}
