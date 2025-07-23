/*
     * Me créer en POO une classe Voiture :
     * 
     * 
     * Voiture :
     * 
     * Attribut :
     * Marque
     * Modele
     * Puissance (cv, la puissance aura une influence sur l'embrayage, plus la puissance est élevée, plus l'embrayage est sensible)
     * vitesse
     * 
     * Comportement :
     * 
     * Accelerer
     * Decelerer
     * Freiner
     * Marche arrière
     * Arreter
     * Embrayer
     * Débrayer
     * Virer à gauche
     * Virer à droite
     * Changer de voie à gauche
     * Changer de voie à droite
     * Contrôle visibilité (Intérieur, extérieur, angles morts)
     * Clignotant à gauche
     * Clignotant à droite
     * Feu de croisement
     * Essuie-glace
     * Feu warning
     * Klaxonner
     * Marche arrière (On ira du principe que le conducteur manipule le volant pendant la marche arrière)
     * 
     * 
     * A l'aide d'un menu d'action, vous allez conduire une voiture, suivre des instructions d'un moniteur pour simuler un test de conduite.
     * Vous roulez sur Paris, vous devez suivre les instructions suivantes, vous devez respecter les limitations de vitesse et le code de la route:
     * 
     * Notification : Vous êtes sur une route limité à 30 km/h
     * 1. Démarrer la voiture
     * 2. Continuer tout droit
     * 3. Ralentir puis tourner à gauche (vous êtes prioritaire)
     * 4. Continuer tout droit (Il y a une voiture sur l'intersection à droite, vous n'êtes pas prioritaire)
     * 5. Attention, il y a un dos d'âne !
     * 6. Continuer tout droit
     * 7. Il y a un feu rouge, quand il passera au vert, tourner à droite sur l'avenue des Champs-Élysées
     * Notification : Vous êtes sur une route limité à 50 km/h
     * 8. Continuer tout droit
     * 9. Au rond point tourner à gauche
     * 10. Continuer tout droit 
     * 11. Attention, des piétons traversent
     * 12. Continuer tout droit
     * 13. Il y a un feu orange, ralentir, attendre que le feu soit rouge et tourner à gauche sur la voie d'insertion du Périphérique
     * Notification : Vous êtes sur le Périphérique, limité à 70 km/h
     * 14. Continuer tout droit
     * 15. Vous êtes sur la voie de droite, une voiture devant vous est trop lente, dépasser la voiture
     * 16. Attention, il y a un bouchon, veuillez ralentir , prévenir les autres conducteurs à l'arrière, puis s'arrêter
     * 17. Insérer vous dans la voie de droite, pour prendre la sortie A6
     * 18. Continuer tout droit, vous rendrez dans un tunnel
     * Notification : Vous êtes sur une route limité à 110 km/h.
     * 19. Continuer tout droit sur 10 km
     * 20. Vous êtes sur la voie de droite, un véhicule de police cherche à vous dépasser, laisser passer le véhicule en vous débordant sur la gauche
     * 21. Continuer tout droit
     * 22. Prenez la sortie en direction de Orly
     * Notification : Vous êtes sur une route limité à 50 km/h
     * 23. Continuer tout droit 
     * 24. Tournez à droite en direction de l'aéroport d'Orly 
     * Notification : Vous êtes sur une route limité à 30 km/h
     * 25. Continuer tout droit après le rond-point
     * 26. Virer à droite pour entrer dans le parking
     * 27. Garez la voiture en marche arrière
     * 28. Couper le moteur
     * Vous êtes arrivé(e) !!!
     * 
     * Si vous ne respectez pas le code de la route & les limitations de vitesse, le test de conduite a échoué et s'arrête, 
     * le moniteur prendra la main.
     * 
     * Bonus : Rajouter un système de points pour évaluer votre conduite, certaines erreurs ne sont pas éliminatoires mais vous feront perdre des points.
     * par exemple :
     * - Faire un excès de vitesse +5 km/h : -2 points
     * - Ne pas céder le passage : -3 points
     * - Brûler un feu orange : -5 points
     * - Ne pas mettre son clignotant : -2 point
     * - Ne pas contrôler les angles morts lors d'un changement de voie : -3 points
     * - Ne pas mettre de feu de croisement dans un tunnel : -2 points
     * - Ne pas activer les essuie-glaces en cas de pluie : -5 points
     * - Ne pas ralentir avant un dos d'âne : -2 points
     * 
     * la pluie doit tomber aléatoirement pendant le test de conduite, si la pluie tombe, 
     * vous devez activer les essuie-glaces, et les limitations de vitesse sont réduites de 10 km/h.
     * 
     * Le test est sur 40 points, il faut au minimum 30 points pour réussir le test de conduite.
     * 
     */
package Exercices.Voiture;

import java.util.*;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static Random random  = new Random();
    public static void main(String[] args) {
        System.out.println("Bienvenue dans la simulation de conduite.");
        System.out.println("Le moniteur virtuel va vous donner des instructions.");
        System.out.print("Entrez la marque de votre véhicule : ");
        String marque = sc.nextLine();
        System.out.print("Entrez le modèle de votre véhicule : ");
        String modele = sc.nextLine();
        int puissance = 0;
        while (puissance <= 0) {
            try {
                System.out.print("Entrez la puissance de chevaux de votre véhicule : ");
                puissance = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Veuillez entrer un nombre valide");
            }
        }
        
        Vehicle voiture = new Vehicle(Methods.capitalize(marque), Methods.capitalize(modele), puissance);
        MoniteurVirtuel moniteur = new MoniteurVirtuel(voiture);

        voiture.vehicleDetails();

        String[] instructions = moniteur.getInstructions();
        int index = 0;

        while (index < instructions.length && voiture.getPoints() >= 30) {
            String instruction = instructions[index];
            System.out.println("\n" + instruction);
            if (instruction.contains("Notification")) {
                Methods.verifierNotification(instruction);
                index++; // Passe la notification
                continue; // Passe à la prochaine itération sans exécuter le reste
            }

            boolean pluie = random.nextBoolean();
            moniteur.setPluie(pluie);
            System.out.println(pluie ? "Il commence à pleuvoir !" : "La pluie s'est arrêtée !");

            Menu.executerMenu(voiture);
            moniteur.verifierAction(instruction);

            if (voiture.getPoints() < 30) {
                System.out.println("Test de conduite échoué ! Le moniteur prend la main");
                break;
            }
            index++;
        }
        
        System.out.println("\nTest terminé avec " + voiture.getPoints() + "/40 points.");
        if (voiture.getPoints() >= 30) {
            System.out.println("Félicitations, vous avez réussi le test de conduite !");
        }
    }
}
