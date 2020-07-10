package fr.em.modeDefenseur;

import java.util.Scanner;

import fr.em.Game.Game;

public class Joueur extends Game {

	int[] numJoueur = new int[getSize()];
	Scanner input = new Scanner(System.in);
	String str;
	boolean isNumber;

	public int[] definireUneCombinaison() {
		do {
			try {
				do {
					System.out.print("Saisir la combinaison secrète de 4 chiffres:");
					if (input.hasNextInt()) {
						str = String.valueOf(input.nextLine());
						if (str.length() == 4) {
							isNumber = true;
						}
						isNumber = true;
					} else {
						System.out.println("Erreur de saisi!!!! ");
						isNumber = false;
						input.next();
					}
				} while (!(isNumber));

				for (int i = 0; i < str.length(); i++) {
					numJoueur[i] = Integer.parseInt(String.valueOf(str.charAt(i)));

				}
				if (str.length() < 4) {
					throw new ArrayIndexOutOfBoundsException();
				}
				// } catch (Exception e) {
				// // LOG.error("Erreur de saisie");
				// System.out.println(
				// "Saisir uniquement des valeurs, aucun caractère spécial ni aucunes chaines de
				// caractères "
				// + "ne sont valables");
				// System.out.println("Veuillez entrer une combinaison valide à 4 chiffres.");
				// }

			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(" Saisir un numero maximum de 4 chiffres SVP!!!! ");

			} catch (NumberFormatException e) {
				System.out.println("Saisir un nombre de 4 chiffres au maximun et pas des caractères SVP !!!");

			}

		} while (str.length() != 4);

		return numJoueur;

	}

	public int[] getNumJoueur() {
		return numJoueur;
	}

	public void setNumJoueur(int[] numJoueur) {
		this.numJoueur = numJoueur;
	}

}
