package fr.em.modeChallenge;

import java.io.IOException;

public class ChallengeMain {

	int[] numAleatoir = new int[4];
	int[] numJoueur = new int[4];
	int count = 0;

	IAOrdinateur ordi = new IAOrdinateur();
	Joueur jou = new Joueur();

	// Constructeur de default
	public ChallengeMain() {
	}

	// Method afficher le resultat de la combinaison secrete.
	public void afficherResultat() {

		numAleatoir = ordi.GenererNumeroAleatoir();
		do {
			count++;
			if (count > 4) {
				break;
			}
			for (int i = 0; i < numAleatoir.length; i++) {
			}
			try {
				numJoueur = jou.ProposerUnNumero();
				// if (numJoueur.length != 4 && numJoueur.length < 4)
				if (numJoueur.length < 4) {
					System.out.println("Saisire un num�ro de 4 chiffres SVP ");
				}

				for (int i = 0; i < numJoueur.length; i++) {
				}
				if (numAleatoir[0] == numJoueur[0]) {
					System.out.print("-> R�ponse:" + " =");
				} else if (numAleatoir[0] < (numJoueur[0])) {
					System.out.print("-> R�ponse:" + " -");
				} else {
					System.out.print("-> R�ponse:" + " +");
				}

				if (numAleatoir[1] == numJoueur[1]) {
					System.out.print("=");
				} else if ((numAleatoir[1] < numJoueur[1])) {
					System.out.print("-");
				} else {
					System.out.print("+");
				}

				if (numAleatoir[2] == numJoueur[2]) {
					System.out.print("=");
				} else if ((numAleatoir[2] < numJoueur[2])) {
					System.out.print("-");
				} else {
					System.out.print("+");
				}

				if (numAleatoir[3] == numJoueur[3]) {
					System.out.println("=");
				} else if ((numAleatoir[3] < numJoueur[3])) {
					System.out.println("-");
				} else {
					System.out.println("+");
				}
				if (numJoueur.length < 4) {
					throw new IllegalArgumentException("Saisire un num�ro de 4 chiffres SVP ");
					// System.out.println("Saisire un num�ro de 4 chiffres SVP ");
				}
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(" Saisir un numero maximum de 4 chiffres SVP!!!! ");
			} catch (NumberFormatException e) {
				System.out.println(" Saisir un numeros de 4 chiffres et pas des caract�res SVP!!!! ");
			} catch (IllegalArgumentException e) {
				System.out.println(" Saisir un numeros de 4 chiffres et pas des caract�res SVP!!!! ");
			}

		} while (numAleatoir[0] != numJoueur[0] || numAleatoir[1] != numJoueur[1] || numAleatoir[2] != numJoueur[2]
				|| numAleatoir[3] != numJoueur[3]);
		if (count > 4) {
			System.out.println("Le nombre d'essais est 4, D�sol� vous l'avez d�pass� et vous avez perdu! ");
		} else {
			System.out.println("Bravo vous avez gagn�, vous avez trouvez la combinaison secr�te :" + ordi.getNumRand()
					+ " en " + count + " essai(s) ");
		}
	}

	public static void main(String[] str) throws IOException {

		ChallengeMain cont = new ChallengeMain();
		cont.afficherResultat();

	}

}
