package Exercices.Voiture;

import java.util.*;

public class Menu {
    
    private static Scanner sc = new Scanner(System.in);

    private static void afficherMenu(Vehicle voiture) {
        System.out.println("\n=== MENU D'ACTION (Options disponibles) ===");
        System.out.println("1. Démarrer / Couper le moteur");

        if (voiture.isDemarre()) {
            System.out.println("2. Accélérer / Décélérer");
            System.out.println("3. Freiner");
            System.out.println("4. Marche arrière");
            System.out.println("5. Tourner");
            System.out.println("6. Changer de voie");
            System.out.println("7. Clignotant / Warning");
            System.out.println("8. Activer / Désactiver feux de croisement");
            System.out.println("9. Activer / Désactiver essuie-glaces");
        }
        
        System.out.println("10. Votre état du véhicule");
        System.out.println("11. Valider et continuer");
    }

    public static void executerMenu(Vehicle voiture) {
        boolean continuer = true;

        while (continuer) {
            afficherMenu(voiture);

            int choix = demanderChoix();

            switch (choix) {
                case 1: voiture.demarrerArreter(); break;
                case 2: {
                    if (!voiture.isDemarre()) {
                        System.out.println("Le moteur est éteint. Vous ne pouvez pas accélérer ou décélérer");
                    }
                    System.out.print("Accélérer (1) ou Décélérer (2) ? ");
                    try {
                        int option = Integer.parseInt(sc.nextLine());
                        if (option == 1) voiture.accelerer(10);
                        else if (option == 2) voiture.decelerer(10);
                        else System.out.println("Option invalide.");
                    } catch (NumberFormatException e) {
                        System.out.println("Entrée invalide.");
                    }
                } break;
                case 3: voiture.freiner(); break;
                case 4: voiture.marcheArriere(); break;
                case 5: {
                    System.out.print("Tourner à (gauche/droite) ? ");
                    String dir = sc.nextLine();
                    voiture.tourner(dir);
                } break;
                case 6: {
                    System.out.print("Changer de voie à (gauche/droite) ? ");
                    String dir = sc.nextLine();
                    voiture.changerVoie(dir);
                } break;
                case 7: {
                    System.out.print("Clignotant (gauche/droit/warning) ? ");
                    String type = sc.nextLine();
                    voiture.activerClignotant(type);
                } break;
                case 8: voiture.activerFeuCroisement(); break;
                case 9: voiture.activerEssuieGlace(); break;
                case 10: voiture.etatVehicle(); break;
                case 11: continuer = false; break;
                default: System.out.println("Choix invalide. Veuillez réessayer.");
            }
        }
    }

    public static int demanderChoix() {
        System.out.print("Choisissez une action : ");
        try {
            return Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Entrée invalide. Veuillez entrer un nombre.");
            return -1;
        }
    }
}
