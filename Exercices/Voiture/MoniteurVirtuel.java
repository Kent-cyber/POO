package Exercices.Voiture;

public class MoniteurVirtuel {
    private Vehicle voiture;
    private boolean pluie;
    
    private String[] instructions = {
        "Notification : Vous êtes sur une route limitée à 30 km/h",
        "1. Démarrer la voiture",
        "2. Continuer tout droit",
        "3. Ralentir puis tourner à gauche (vous êtes prioritaire)",
        "4. Continuer tout droit (Il y a une voiture sur l'intersection à droite, vous n'êtes pas prioritaire)",
        "5. Attention, il y a un dos d'âne !",
        "6. Continuer tout droit",
        "7. Il y a un feu rouge, quand il passera au vert, tourner à droite sur l'avenue des Champs-Élysées",
        "Notification : Vous êtes sur une route limitée à 50 km/h",
        "8. Continuer tout droit",
        "9. Au rond point tourner à gauche",
        "10. Continuer tout droit",
        "11. Attention, des piétons traversent",
        "12. Continuer tout droit",
        "13. Il y a un feu orange, ralentir, attendre que le feu soit rouge et tourner à gauche sur la voie d'insertion du Périphérique",
        "Notification : Vous êtes sur le Périphérique, limitée à 70 km/h",
        "14. Continuer tout droit",
        "15. Vous êtes sur la voie de droite, une voiture devant vous est trop lente, dépasser la voiture",
        "16. Attention, il y a un bouchon, veuillez ralentir , prévenir les autres conducteurs à l'arrière, puis s'arrêter",
        "17. Insérer vous dans la voie de droite, pour prendre la sortie A6",
        "18. Continuer tout droit, vous rendrez dans un tunnel",
        "Notification : Vous êtes sur une route limitée à 110 km/h.",
        "19. Continuer tout droit sur 10 km",
        "20. Vous êtes sur la voie de droite, un véhicule de police cherche à vous dépasser, laisser passer le véhicule en vous débordant sur la gauche",
        "21. Continuer tout droit",
        "22. Prenez la sortie en direction de Orly",
        "Notification : Vous êtes sur une route limitée à 50 km/h",
        "23. Continuer tout droit",
        "24. Tournez à droite en direction de l'aéroport d'Orly",
        "Notification : Vous êtes sur une route limitée à 30 km/h",
        "25. Continuer tout droit après le rond-point",
        "26. Virer à droite pour entrer dans le parking",
        "27. Garez la voiture en marche arrière",
        "28. Couper le moteur",
        "Vous êtes arrivé(e) et avez terminé le test !"
    };

    public MoniteurVirtuel(Vehicle voiture) {
        this.voiture = voiture;
    }

    /****************************************************** Getters et setters ************************************************************/

    public String[] getInstructions() {
        return instructions;
    }

    public void setPluie(boolean pluie) {
        this.pluie = pluie;
    }

    /****************************************************** Comportements (Méthodes) **********************************************************/

    public void verifierAction(String instruction) { // Méthode pour vérifier les actions de l'utilisateur/conducteur
        boolean penaliteAppliquee = false;
        penaliteAppliquee |= verifierPenalitesGenerales(instruction);
        penaliteAppliquee |= verifierLimitationVitesse(instruction);

        if (!penaliteAppliquee) {
            System.out.println("Bonne action !");
        }
    }

    private boolean verifierPenalitesGenerales(String instruction) { // Gestion de pénalités générales
        boolean penalite = false;
        if (instruction.contains("dos d'âne")) {
            voiture.verifierDosDane();
            penalite = true;
        }
        if (instruction.contains("tunnel") && !voiture.isFeuCroisement()) {
            voiture.penalite("Vous n'avez pas activé les feux de croisement dans le tunnel.", 2);
            penalite = true;
        }
        if (pluie && !voiture.isEssuieGlace()) {
            voiture.penalite("Vous n'avez pas activé les essuie-glaces sous la pluie.", 5);
            penalite = true;
        }
        if ((instruction.contains("tourner") || instruction.contains("Tournez") || instruction.contains("virer")) && !voiture.isClignotantActif()) {
            voiture.penalite("Vous avez oublié le clignotant.", 2);
            penalite = true;
        }
        if ((instruction.contains("voie") || instruction.contains("sortie")) && !voiture.isClignotantActif()) {
            voiture.penalite("Changement de voie sans clignotant.", 2);
            penalite = true;
        }
        return penalite;
    }

    private boolean verifierLimitationVitesse(String instruction) { // Gestion de limitation de vitesse
        if (instruction.contains("limitée à 30")) {
            voiture.verifierVitesse(30, pluie);
            return true;
        } else if (instruction.contains("limitée à 50")) {
            voiture.verifierVitesse(50, pluie);
            return true;
        } else if (instruction.contains("limitée à 70")) {
            voiture.verifierVitesse(70, pluie);
            return true;
        } else if (instruction.contains("limitée à 110")) {
            voiture.verifierVitesse(110, pluie);
            return true;
        }
        return false;
    }
}
