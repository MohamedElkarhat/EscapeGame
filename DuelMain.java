package fr.em.modeDuel;

import java.util.Arrays;

public class DuelMain {

	int[] cmbOrdi = new int[4];
	int[] cmbJouer = new int[4];
	int[] propOrdi = new int[4];
	int[] propJoeur = new int[4];

	// int[] prop = new int[4];
	boolean reponse = false;
	int count = 0;

	public void afficherResultatDuel() {
		IAOrdinateur ordi = new IAOrdinateur();
		Joueur jou = new Joueur();

		while (!reponse) {
			count++;
			cmbOrdi = ordi.ordiCombinaisonSecrete();
			propJoeur = jou.joueurProposition();
			reponse = Arrays.equals(cmbOrdi, propJoeur);

			System.out.println("R�ponse :" + reponse);

			if (reponse == true) {
				System.out.println("Bravo Joueur vous avez trouver la bonne r�ponse en " + count
						+ " essai(s) et vous avez gangne !!!!!");
				System.out.println("Vous voulez rejouer ?  ");
				System.out.println("SVP Choisir le num�ro 1 ou le num�ro 2 ou le num�ro 3");

				break;
			} else {
				System.out.println(" D�soler c'est pas la bonne r�ponse");
				System.out.println("---------------------------------");
			}
			cmbJouer = jou.joueurCombinaisonSecrete();
			propOrdi = ordi.ordiProposition();
			reponse = Arrays.equals(cmbJouer, propOrdi);

			if (reponse == true) {

				System.out.println("---------------------------------");
				System.out.println("Bravo ORDI vous avez trouver la bonne r�ponse en " + count
						+ " essai(s)  et vous avez gangne !!!!!");
				System.out.println("Vous voulez rejouer ?  ");
				System.out.println("SVP Choisir le num�ro 1 ou le num�ro 2 ou le num�ro 3");

			} else {
				System.out.println(" D�soler c'est pas la bonne r�ponse");
				System.out.println("---------------------------------");
			}

		}
	}

	public static void main(String[] args) {

		DuelMain duel = new DuelMain();
		duel.afficherResultatDuel();

	}

	// do {
	// cmbJouer = jou.joueurCombinaisonSecrete();
	// // System.out.println("voici la combinaison de joeur : " + cmbJouer);

	// propOrdi = ordi.ordiProposition();
	//
	// // System.out.println("Voici la combinaison secr�te de joueur :");
	// cmbJouer = jou.joueurCombinaisonSecrete();
	// propOrdi = ordi.ordiProposition();
	// reponse = Arrays.equals(cmbJouer, propOrdi);
	//
	// System.out.println("R�ponse :" + reponse);
	//
	// if (reponse == true) {
	// System.out.println("Bravo IA vous avez trouver la bonne r�ponse et vous avez
	// gangne !!!!!");
	// //
	// } else {
	// System.out.println(" D�soler c'est pas la bonnne r�ponse");
	// System.out.println("---------------------------------");
	//
	// }
	// } while (reponse != true);
	// }
	// reponse = Arrays.equals(cmbJouer, propOrdi);
	// System.out.println("R�ponse :" + reponse);
	// if (reponse == true) {
	// System.out.println("Bravo IA vous avez gangne !!!!!");
	//
	// } else {
	// System.out.println(" D�soler c'est pas la bonnne r�ponse");
	// }
	// } while (reponse != true);

	// public String[] compare(int[] combinaison, int[] proposition) {
	//
	// int i = 0;
	// do {
	// if (combinaison[i] < proposition[i]) {
	// reponse[i] = "-";
	// } else if (combinaison[i] > proposition[i]) {
	// reponse[i] = "+";
	// } else {
	// reponse[i] = "=";
	// }
	//
	// } while (i < 4);
	//
	// System.out.println("Reponse :" + reponse);
	// return reponse;
	// }

	// }
	// public static void main(String[] args) {
	//
	// DuelMain duel = new DuelMain();
	//
	// }

	// public String[] compare(int[] combination, int[] proposition) {
	// int i = 0;
	// do {
	// if (combination[i] < proposition[i]) {
	// response[i] = "-";
	// } else if (combination[i] > proposition[i]) {
	// response[i] = "+";
	// } else {
	// response[i] = "=";
	// }
	//
	// i++;
	// } while (i < 4);
	// return response;

}