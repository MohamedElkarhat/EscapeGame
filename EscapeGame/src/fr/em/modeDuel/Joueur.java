package fr.em.modeDuel;

import java.util.Random;
import java.util.Scanner;

import fr.em.Game.Game;

public class Joueur extends Game {

	private int[] proposition = new int[getSize()];
	String prop;
	String combSecrete;
	private int[] numSecret = new int[getSize()];
	private Random rand = new Random();

	Scanner sc = new Scanner(System.in);

	public int[] joueurProposition() {

		do {
			try {

				System.out.print("proposition joueur: ");

				prop = sc.nextLine();
				if (prop.length() < 4) {
					throw new ArrayIndexOutOfBoundsException();
				}

				System.out.println("Votre proposition est: " + prop);

				for (int i = 0; i < prop.length(); i++) {

					proposition[i] = Integer.parseInt(String.valueOf(prop.charAt(i)));
				}
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Saisir un numero Max de 4 chiffres SVP ??????");

			}
		} while (prop.length() != 4);
		// String str = String.valueOf(prop);
		// for (int i = 0; i < str.length(); i++) {
		//
		// proposition[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
		// System.out.println("numero Ordi :" + numOrdi[i]);

		return proposition;

	}

	public int[] joueurCombinaisonSecrete() {

		System.out.print("Saisir votre combinaison secrète....");
		try {
			combSecrete = sc.nextLine();

			System.out.println("Voici la combinaison secrète de joueur : " + combSecrete);

			String str = String.valueOf(combSecrete);
			for (int i = 0; i < str.length(); i++) {

				numSecret[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
				// System.out.println("numero Secret :" + numSecret[i]);
			}
		} catch (Exception e) {
			System.out.println("Saisir un numero de 4 chiffres SVP°°°°°°");
		}
		return numSecret;
	}

	public int[] getProposition() {
		return proposition;
	}

	public void setProposition(int[] proposition) {
		this.proposition = proposition;
	}

}