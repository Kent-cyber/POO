package Functions.Inventaire;

import java.util.ArrayList;

public class Inventory {
    
    private ArrayList<Product> products;

    public Inventory() {
        products = new ArrayList<Product>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public void checkLowInventory() {
        for (Product product : products) {
            if (product.getQuantityProduct() <= 100) {
                System.out.println("Il y a peu de " + product.getNameProduct() + " dans l'inventaire. La quantité actuelle : " + product.getQuantityProduct());
            }
        }
    }
}
