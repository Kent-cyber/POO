package Exercices.Voiture;

public class Vehicle {
    private String marque; // Création des attributs
    private String modele;
    private int puissance;
    private int vitesse;
    private boolean moteurAllume;
    private boolean feuCroisement;
    private boolean essuieGlace;
    private boolean clignotantGauche;
    private boolean clignotantDroit;
    private boolean warning;
    private int points;

    public Vehicle(String marque, String modele, int puissance) { // Création du constructeur avec la marque le modèle et la puissance du véhicule
        this.marque = marque;
        this.modele = modele;
        this.puissance = puissance;
        this.vitesse = 0; // Initialise la vitesse à 0
        this.moteurAllume = false; // Initialise le moteur éteint
        this.feuCroisement = false;
        this.essuieGlace = false;
        this.clignotantGauche = false;
        this.clignotantDroit = false;
        this.warning = false;
        this.points = 40; // Initialise les points d'évaluation à 40
    }

    public void vehicleDetails() { // Méthode pour afficher les détails sur le véhicule
        System.out.println("\nDétails du véhicule :");
        System.out.println("Marque : " + marque);
        System.out.println("Modèle : " + modele);
        System.out.println("Puissance : " + puissance + " chevaux");
    }

    public void etatVehicle() { // Méthode pour montrer l'état du véhicule durant le test
        System.out.println("--- Etat du véhicule ---");
        System.out.println("Moteur : " + (moteurAllume ? "Allumé" : "Coupé"));
        System.out.println("Vitesse : " + vitesse + " km/h");
        System.out.println("Points : " + points);
        System.out.println("Feux de croisement : " + (feuCroisement ? "Allumés" : "Eteints"));
        System.out.println("Essuie-glaces : " + (essuieGlace ? "Activés" : "Désactivés"));
        System.out.println("Clignotant gauche : " + (clignotantGauche ? "Activé" : "Eteint"));
        System.out.println("Clignotant droit : " + (clignotantDroit ? "Activé" : "Eteint"));
        System.out.println("Warning : " + (warning ? "Activé" : "Eteint"));
        System.out.println();
    }

    /**************************************** Getters **********************************************************************************************/
    
    public int getPoints() { // Méthode pour retourner les points totaux
        return points;
    }

    public boolean isDemarre() {
        return moteurAllume;
    }

    public boolean isFeuCroisement() {
        return feuCroisement;
    }

    public boolean isEssuieGlace() {
        return essuieGlace;
    }

    public boolean isClignotantActif() {
        return clignotantGauche || clignotantDroit;
    }

    /**************************************** Comportement (Méthodes) ******************************************************************************/

    public boolean demarrerArreter() { // Méthode pour démarrer et arrêter le véhicule
        if (!moteurAllume) {
            System.out.println("Vous démarrez le véhicule.");
            moteurAllume = true;
        } else {
            System.out.println("Vous arrêtez le véhicule et coupez le moteur");
            moteurAllume = false;
        }
        return moteurAllume;
    }

    public void accelerer(int accelerer) { // Méthode pour accélerer le véhicule
        if (!moteurAllume) {
            System.out.println("Le moteur est éteint, impossible d'accélérer.");
            return;
        }
        vitesse += accelerer;
        if (vitesse > 200) vitesse = 200; // limite arbitraire
        System.out.println("Vous accélérez. Vitesse actuelle : " + vitesse + " km/h.");
    }

    public void decelerer(int decelerer) { // Méthode pour décélerer le véhicule
        if (!moteurAllume) {
            System.out.println("Le moteur est éteint, impossible de décélérer.");
            return;
        }
        vitesse = Math.max(0, vitesse - decelerer);
        if (vitesse == 0) {
            System.out.println("Vous ralentissez et vous êtes à l'arrêt.");
        } else {
            System.out.println("Vous ralentissez. Vitesse actuelle : " + vitesse + " km/h.");
        }
    }

    public void freiner() { // Méthode pour freiner le véhicule
        if (!moteurAllume) {
            System.out.println("Vous êtes déjà à l'arrêt et le moteur est coupé, impossible de freiner.");
            return;
        }
        vitesse = 0;
        System.out.println("Vous freinez et vous êtes à l'arrêt.");
    }
    
    public void tourner(String dir) { // Méthode pour tourner dans une direction choisie
        if ("gauche".equalsIgnoreCase(dir)) {
            System.out.println("Vous tournez à gauche.");
        } else if ("droite".equalsIgnoreCase(dir)) {
            System.out.println("Vous tournez à droite.");
        } else {
            System.out.println("Choix invalide.");
        }
    }

    public void changerVoie(String dir) { // Méthode pour changer de voie
        if ("gauche".equalsIgnoreCase(dir)) {
            System.out.println("Vous tournez à gauche.");
        } else if ("droite".equalsIgnoreCase(dir)) {
            System.out.println("Vous tournez à droite.");
        } else {
            System.out.println("Choix invalide.");
        }
    }
    
    public void marcheArriere() { // Méthode pour la marche arrière
        System.out.println("Vous passez la marche arrière et manœuvrez.");
    }

    public void activerClignotant(String type) { // Méthode pour mettre le clignotant ou les feux de détresse
        clignotantGauche = clignotantDroit = warning = false;
        switch (type.toLowerCase()) {
            case "gauche": clignotantGauche = true; break;
            case "droit" : clignotantDroit = true; break;
            case "warning":
                warning = true;
                clignotantGauche = true;
                clignotantDroit = true;
                break;
            default: System.out.println("Aucun clignotant activé"); break;
        }
        System.out.println("Clignotant mis à jour.");
    }

    public boolean activerFeuCroisement() { // Méthode pour mettre les feux de croisement
        if (!feuCroisement) {
            System.out.println("Vous allumez les feux de croisement.");
            feuCroisement = true;
        } else {
            System.out.println("Vous éteignez les feux de croisement.");
            feuCroisement = false;
        }
        return feuCroisement;
    }

    public boolean activerEssuieGlace() { // Méthode pour mettre les essuie-glaces
        if (!essuieGlace) {
            System.out.println("Vous activez les essuie-glaces.");
            essuieGlace = true;
        } else {
            System.out.println("Vous désactivez les essuie-glaces.");
            essuieGlace = false;
        }
        return essuieGlace;
    }
    
    public void verifierVitesse(int limitation, boolean pluie) { // Méthode pour vérifier la vitesse
        int limite = limitation;
        if (pluie) limite -= 10;
        if (vitesse > limite + 15) {
            System.out.println("Excès de vitesse majeur ! Le moniteur prend la main.");
            points = 0;
        } else if (vitesse > limite + 5) {
            penalite("Excès de vitesse (+5 km/h).", 2);
        }
    }

    public void verifierDosDane() {
        if (vitesse > 30) {
            System.out.println("Vous êtes arrivé trop vite sur le dos d'âne. Vous perdez 2 points");
            points -= 2;
        }
    }

    public void penalite(String motif, int malus) { // Méthode pour les pénalités
        System.out.println(motif + " Vous perdez " + malus + " points.");
        points -= malus;
    }
}
