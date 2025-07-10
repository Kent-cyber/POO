package Exercices;

public class Bottle {
    
    private String liquide; // Création des attributs
    private Integer quantity;
    private boolean isOpen;
    private boolean isEmpty;

    public Bottle(String liquide, int quantity) { // Constructeur pour la classe bouteille avec les variables
        this.liquide = liquide;
        this.quantity = quantity;
        this.isOpen = false; // Initialise la variable en false
        this.isEmpty = quantity == 0; // Initialise la variable vide si la quantité est égale à 0
    }

    public void open() { // Méthode pour ouvrir la bouteille
        if (!isOpen) {
            isOpen = true;
            System.out.println("La bouteille est ouverte");
        } else {
            System.out.println("La bouteille est déjà ouverte");
        }
    }

    public void boire(int quantityDrink) { // Méthode pour boire la bouteille
        if (quantityDrink > quantity) {
            System.out.println("Pas assez de liquide mais vous buvez le reste");
            quantity = 0;
            isEmpty = true;
        } else {
            quantity -= quantityDrink;
            System.out.println("Vous avez bu " + quantityDrink + " cl de " + liquide);
            if (quantity == 0) { // Affiche le message si la quantité est maintenant vide
                isEmpty = true;
                System.out.println("La bouteille est maintenant vide");
            }
        }
    }

    public void fermer() { // Méthode pour fermer la bouteille
        if (isOpen) {
            isOpen = false;
            System.out.println("La bouteille est fermée");
        } else {
            System.out.println("La bouteille est déjà fermée");
        }
    }

    public void vider() { // Méthode pour vider la bouteille accidentellement
        quantity = 0;
        isEmpty = true;
        System.out.println("Oups ! la bouteille s'est vidé accidentellement");
    }

    public int getQuantity() { // Méthode pour retourner la quantité du liquide
        return quantity;
    }

    public boolean estOuvert() {
        return isOpen;
    }

    public boolean estVide() {
        return isEmpty;
    }
/******************** Code à mettre dans le main *******************************************/

    /*Random random = new Random();

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
        } */
}
