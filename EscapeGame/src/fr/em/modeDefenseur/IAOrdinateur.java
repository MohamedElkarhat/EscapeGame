package fr.em.modeDefenseur;

import java.util.Random;

import fr.em.Game.Game;

public class IAOrdinateur extends Game {

	int numOrdi[] = new int[getSize()];
	int reponse[] = new int[getSize()];
	String[] repFournit;

	public int[] propositionAleatoir() {
		Random random = new Random();
		int numOrdi2 = (int) (random.nextInt(9000)) + 1000;

		String str = String.valueOf(numOrdi2);
		for (int i = 0; i < str.length(); i++) {
			numOrdi[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
		}
		return numOrdi;
	}
}