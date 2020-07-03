package fr.em.Game;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import fr.em.modeChallenge.ChallengeMain;
import fr.em.modeDefenseur.DefenseurMain;
import fr.em.modeDuel.DuelMain;

public class Game {

	private static final Logger LOG = LogManager.getLogger(Game.class);

	Scanner sc = new Scanner(System.in);

	public void choixModeJeux() {
		LOG.info("Debut de jeu!!!!");
		System.out.println("Bienvenue dans le jeux Escape Game, vous pouvez choisir :");
		System.out.println(
				"le Numéro 1 pour le mode Challenger, le numéro 2 pour le mode Defenseur et le numéro 3 pour le mode Duel ");
		System.out.print("Choisissez un numéro SVP : ");

		int nbMode = 1;
		do {
			LOG.error("PAS D'error!!!!!");
			try {
				// System.out.println("Ce mode de jeu n'existe pas!!!.");
				// System.out.println("SVP Choisir le numéro 1 ou le numéro 2 ou le numéro 3");
				nbMode = sc.nextInt();
				if (nbMode == 1 || nbMode == 2 || nbMode == 3) {

					switch (nbMode) {

					case 1:
						System.out.println("Vous avez choisi le mode Challenger. ");
						LOG.info("Vous avez choisi le mode Challenger. ");
						ChallengeMain challenge = new ChallengeMain();
						challenge.afficherResultatChalleger();
						break;
					case 2:
						LOG.info("Vous avez choisi le mode Challenger. ");
						System.out.println("Vous avez choisi le mode Challenger.");
						DefenseurMain defenseur = new DefenseurMain();
						defenseur.afficherResultatDefenseur();
						break;
					case 3:
						LOG.info("Vous avez choisi le mode Duel. ");
						System.out.println("Vous avez choisi le mode Duel.");
						DuelMain duel = new DuelMain();
						duel.afficherResultatDuel();

						break;

					// case 4:
					// System.out.println("Ce mode de jeu n'existe pas!!!.");
					// System.out.println("SVP Choisir le numéro 1 ou le numéro 2 ou le numéro 3");
					// break;

					// default:
					// System.out.println("SVP Choisir le numéro 1 ou le numéro 2 ou le numéro 3");
					// break;
					}
				} else {
					System.out.println("Ce mode de jeu n'existe pas!!!.");
					System.out.print("SVP Choisir le numéro 1 ou le numéro 2 ou le numéro 3 : ");
				}

			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(" Saisir un numero maximum de 4 chiffres SVP!!!! ");
				LOG.error("Error de saisi !!!!!! ");
			} catch (NumberFormatException e) {
				System.out.println(" Saisir un numero de 4 chiffres et pas des caractères SVP!!!! ");
				LOG.error("Error de saisi !!!!!! ");
			} catch (IllegalArgumentException e) {
				System.out.println(" Saisir un numero de 4 chiffres SVP!!!! ");
				LOG.error("Error de saisi !!!!!! ");

			}

		} while (nbMode != 1 || nbMode != 2 || nbMode != 3);

		System.out.println("SVP Choisir le numéro 1 ou le numéro 2 ou le numéro 3 : ***********");

		System.out.println("Ce mode de jeu n'existe pas!!!.");

	}

	public static void main(String args[]) {
		Game game = new Game();
		game.choixModeJeux();
	}

}
