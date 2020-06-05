package fr.em.modeDefenseur;

import java.util.Scanner;

public class Joueur {

	int[] numJoueur = new int[4];
	Scanner sc = new Scanner(System.in);
	String str2;

	public int[] definireUneCombinaison() {

		do {

			try {
				System.out.print("Combinaison secrète de 4 chiffres:");

				str2 = String.valueOf(sc.nextLine());
				for (int i = 0; i < str2.length(); i++) {
					numJoueur[i] = Integer.parseInt(String.valueOf(str2.charAt(i)));

				}

			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(" Saisir un numero maximum de 4 chiffres  SVP!!!! ");

			} catch (NumberFormatException e) {
				System.out.println("Saisir un nombre de 4 chiffres au maximun et pas des caractères SVP !!!");

			}

		} while (str2.length() != 4);

		return numJoueur;

	}

	public int[] getNumJoueur() {
		return numJoueur;
	}

	public void setNumJoueur(int[] numJoueur) {
		this.numJoueur = numJoueur;
	}

}
