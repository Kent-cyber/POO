package Exercices.Bottle;

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
}
