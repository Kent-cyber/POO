package Functions.Inventaire;

public class Product {
    
    private String name; // Création des attributs du produit
    private int quantity;

    public Product(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getNameProduct() { // Méthode pour retourner le nom du produit
        return name;
    }

    public void setNameProduct(String name) { // Méthode pour entrer le nom du produit
        this.name = name;
    }

    public int getQuantityProduct() { // Méthode pour retourner la quantité du produit
        return quantity;
    }

    public void setQuantityProduct(int quantity) { // Méthode pour entrer la quantité du produit
        this.quantity = quantity;
    }
}
