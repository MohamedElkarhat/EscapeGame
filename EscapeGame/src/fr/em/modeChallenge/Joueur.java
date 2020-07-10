package fr.em.modeChallenge;

import java.util.Scanner;

import fr.em.Game.Game;

public class Joueur extends Game {

	private int[] proposition;

	String str;
	boolean isNumber;
	Scanner input = new Scanner(System.in);

	// constructeur de default
	public Joueur() {
		proposition = new int[getSize()];

	}

	// Method proposer un numéro
	public int[] ProposerUnNumero() {

		try {
			do {
				System.out.print("Entrer un numero de 4 chiffres : ");
				if (input.hasNextInt()) {
					str = input.nextLine();
					if (str.length() == 4) {
						isNumber = true;
					}

				} else {
					System.out.println("Erreur de saisi!!!! ");
					isNumber = false;
					input.next();
				}
			} while (!(isNumber));

			// if (str.length() < 4) {
			// throw new IllegalArgumentException("Saisire un numèro de 4 chiffres SVP ");

			// }

			for (int i = 0; i < str.length(); i++) {

				proposition[i] = Integer.parseInt(String.valueOf(str.charAt(i)));

				if (proposition.length < 4) {
					System.out.println("saisire un numèro de 4 chiffres SVP!!!!!! ");
				}
			}
			// }// while (proposition.length != 4);
		} catch (Exception e) {
			// System.out.println("Saisire un numèro de 4 chiffres SVP ");

		}

		return proposition;

	}

	public int[] getProposition() {
		return proposition;
	}

	public void setProposition(int[] proposition) {
		this.proposition = proposition;
	}

	public static void main(String str[]) {
		Joueur j = new Joueur();
		j.ProposerUnNumero();
	}

}
