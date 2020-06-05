package fr.em.modeDefenseur;

import java.util.Random;

public class IAOrdinateur {

	int numOrdi[] = new int[4];
	int reponse[] = new int[4];
	String[] repFournit;

	public int[] propositionAleatoir() {
		Random random = new Random();
		int numOrdi2 = (int) (random.nextInt(9000)) + 1000;

		String str = String.valueOf(numOrdi2);
		for (int i = 0; i < str.length(); i++) {
			numOrdi[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
			// System.out.println("Proposition : " + numOrdi2);
			// numOrdi = numOrdi2;

		}
		return numOrdi;
	}
}