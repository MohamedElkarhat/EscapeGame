package fr.em.modeDefenseur;

import java.util.Random;
import java.util.Scanner;

public class DefenseurMain {

	int[] combSecrete = new int[4]; // contient la combinaison secrete
	int[] proposition = new int[4]; // contient la proposition de IAOrdinateur
	int[] resulta = new int[4]; // contient le resultat finale
	int[] min = { 0, 0, 0, 0 }; // contient la valeur minimal de chaque chiffre
	int[] max = { 9, 9, 9, 9 }; // contient la valeur maximum de chaque chiffre
	// int[] controleReponse = new int[4];
	boolean[] chiffreTrouve = new boolean[4]; // contient le statut de chaque chiffre trouvé ou non
	// trouvé.

	String reponse;
	int count = 0;

	public DefenseurMain() {

	}

	IAOrdinateur ordi = new IAOrdinateur();
	Joueur jou = new Joueur();
	Random random = new Random();

	public void afficherResultat() {

		combSecrete = jou.definireUneCombinaison();
		proposition = ordi.propositionAleatoir();

		while (chiffreTrouve[0] == false || chiffreTrouve[1] == false || chiffreTrouve[2] == false
				|| chiffreTrouve[3] == false) {

			count++;
			if (count > 4) {
				System.out.println("Dèsolé vous avez fait 4 essai, vous avez perdu!!");
				break;
			}
			try {

				for (int i = 0; i < 4; i++) {
					if (chiffreTrouve[i] == false) {
						proposition[i] = (int) random.nextInt(max[i] - min[i] + 1) + min[i];
					}

				}

			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(" Saisir un numero maximum de 4 chiffres SVP!!!! ");
			} catch (NumberFormatException e) {
				System.out.println(" Saisir un numeros de 4 chiffres et pas des caractères SVP!!!! ");
			} catch (IllegalArgumentException e) {
				System.out.println(" Saisir un numeros de 4 chiffres et pas des caractères SVP!!!! ");
			}

			System.out.println("Proposition IA " + proposition[0] + "" + proposition[1] + "" + proposition[2] + ""
					+ proposition[3]);

			System.out.print("-> Réponse :");

			Scanner sc = new Scanner(System.in);
			reponse = sc.nextLine();

			for (int i = 0; i < reponse.length(); i++) {

			}

			// test de la reponse saisie pour 4 chiffres,
			// plus grand (+), plus petit (-) Ok (=).
			for (int i = 0; i < 4; i++) {

				// si la proposition est petite on met la valeur "+"
				if (reponse.substring(i, i + 1).equals("+")) {
					min[i] = proposition[i] + 1;
				}
				// si la proposition est grande on met la valeur "-"
				if (reponse.substring(i, i + 1).equals("-")) {
					max[i] = proposition[i] - 1;
				}
				// si la proposition est égale a la combinaison secrete
				if (reponse.substring(i, i + 1).equals("=")) {
					resulta[i] = proposition[i];
					chiffreTrouve[i] = true;

					// on fixe les min et max pour ne pas génerer des aleatoires inutile
					min[i] = proposition[i];
					max[i] = proposition[i];
				}
			}
			if (chiffreTrouve[0] == true && chiffreTrouve[1] == true && chiffreTrouve[2] == true
					&& chiffreTrouve[3] == true) {
				System.out.println(" Bravo vous avez trouvé la combinaison : " + resulta[0] + "" + resulta[1] + ""
						+ resulta[2] + "" + resulta[3] + " en  " + count + "   essais");
			}

		}

	}

	public String getReponse() {
		return reponse;
	}

	public void setReponse(String reponse) {
		this.reponse = reponse;
	}

	public static void main(String[] str) {

		DefenseurMain cont = new DefenseurMain();
		cont.afficherResultat();

	}

}
