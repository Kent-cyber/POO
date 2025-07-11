package Exercices.Bottle;

import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Random random = new Random();

        String liquide = "";
        while (liquide.isEmpty()) {
            System.out.print("Choisissez un liquide (Eau, Coca, Jus d'orange) : ");
            liquide = sc.nextLine();
            if (liquide.isEmpty()) {
                System.out.println("Liquide invalide. Veuillez saisir à nouveau");
            }
        }

        int quantity = 0;
        while (quantity <= 0) {
            try {
                System.out.print("Indiquez la quantité (en cl) : ");
                quantity = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Veuillez entrer un nombre");
            }
        }
        
        Bottle bouteille = new Bottle(liquide, quantity);

        int choice = 0;
        while (choice != 4) {
            System.out.println("\n=== Menu ===");
            System.out.println("1 : Ouvrir la bouteille");
            System.out.println("2 : Fermer la bouteille");
            System.out.println("3 : Boire");
            System.out.println("4 : Quitter");
            System.out.print("Entrez votre choix : ");

            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Veuillez entrer un nombre entier valide");
                continue;
            }

            switch (choice) {
                case 1:
                    bouteille.open();
                    break;

                case 2:
                    bouteille.fermer();
                    break;

                case 3:
                    if (!bouteille.estOuvert()) {
                        System.out.println("Vous devez d'abord ouvrir la bouteille");
                    } else if (bouteille.estVide()) {
                        System.out.println("La bouteille est vide !");
                    } else {
                        System.out.print("Combien de cl voulez-vous boire : ");
                        int quantityDrink = Integer.parseInt(sc.nextLine());
                        bouteille.boire(quantityDrink);
                    }
                    break;

                case 4:
                    System.out.println("Au revoir !");
                    break;

                default:
                    System.out.println("Option invalide, réessayez");
            }

            if (bouteille.estOuvert() && !bouteille.estVide() && random.nextBoolean()) {
                bouteille.vider();
            }

            System.out.println("\nQuantité restante : " + bouteille.getQuantity() + " cl");
            System.out.println("Bouteille ouverte : " + (bouteille.estOuvert() ? "Oui" : "Non"));
        }
    }
}
