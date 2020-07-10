package fr.em.modeChallenge;

import java.util.Random;

import fr.em.Game.Game;

public class IAOrdinateur extends Game {

	private int[] numOrdi = new int[getSize()];
	private Random rand = new Random();
	private int combSecrete = rand.nextInt(9000) + 1000;

	// Constructeur de default
	public IAOrdinateur() {
	}

	// Method generer un numero Aleatoir
	public int[] GenererNumeroAleatoir() {

		System.out.println("Combinaison Secrète : " + combSecrete);

		String str = String.valueOf(combSecrete);

		for (int i = 0; i < str.length(); i++) {
			numOrdi[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
		}
		return numOrdi;

	}

	public int[] getNumOrdi() {
		return numOrdi;
	}

	public int getNumRand() {
		return combSecrete;
	}

}
