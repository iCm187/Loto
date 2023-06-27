package fr.hb.loto;

import java.util.Random;
import java.util.Scanner;

public class App {

	// Attributs
	private static final int NB_CASES_DE_LA_GRILLE = 5;
	private static int[] tirage = new int[NB_CASES_DE_LA_GRILLE];
	private static int[] grilleDuJoueur = new int[NB_CASES_DE_LA_GRILLE];
	private static Random random = new Random();
	private static Scanner scanner = new Scanner(System.in);
	private static int nbBonsNumeros = 0;

	public static void main(String[] args) {

		System.out.println("Bienvenue sur le loto ! Veuillez saisir votre grille de 5 numeros entre 1 et 49");

		// Saisie de la grille du joueur
		saisirGrilleDuJoueur();

		// Génération du tirage
		//genererTirage();

		// Vérification des numéros gagnants
		//verifierNumerosGagnants();

		// Affichage des résultats
		System.out.println("Votre grille :");
		//afficherGrille(grilleDuJoueur);

		System.out.println("Tirage gagnant :");
		//afficherGrille(tirage);

		System.out.println("Nombre de bons numéros : " + nbBonsNumeros);
	}

	private static void saisirGrilleDuJoueur() {
		for (int i = 0; i < NB_CASES_DE_LA_GRILLE; i++) {
			boolean estNumeroValide = false;

			while (!estNumeroValide) {
				System.out.print("Numéro " + (i + 1) + ": ");
				int numero = scanner.nextInt();

				if (numero >= 1 && numero <= 49) {
					boolean estDejaSaisi = false;

					for (int j = 0; j < i; j++) {
						if (grilleDuJoueur[j] == numero) {
							estDejaSaisi = true;
							break;
						}
					}

					if (!estDejaSaisi) {
						grilleDuJoueur[i] = numero;
						estNumeroValide = true;
					} else {
						System.out.println("Numéro déjà saisi. Veuillez saisir un autre numéro.");
					}
				} else {
					System.out.println("Veuillez saisir un nombre compris entre 1 et 49");
				}
			}
		}
	}

	/*private static void genererTirage() {
		for (int i = 0; i < NB_CASES_DE_LA_GRILLE; i++) {
			tirage[i] = random.nextInt(49) + 1;
		}
	}

	private static void verifierNumerosGagnants() {
		for (int i = 0; i < NB_CASES_DE_LA_GRILLE; i++) {
			if (contains(grilleDuJoueur, tirage[i])) {
				nbBonsNumeros++;
			}
		}
	}

	private static boolean contains(int[] array, int number) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == number) {
				return true;
			}
		}
		return false;
	}

	private static void afficherGrille(int[] grille) {
		for (int i = 0; i < grille.length; i++) {
			System.out.print(grille[i] + " ");
		}
		System.out.println();
	}*/
}
