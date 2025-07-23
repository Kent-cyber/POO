package Functions.Inventaire;

public class MainIP {

    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        Product product1 = new Product("LED TV", 200);
        Product product2 = new Product("Tablette", 80);
        Product product3 = new Product("PS5", 50);

        System.out.println("Ajout des trois produits dans l'inventaire :");
        inventory.addProduct(product1);
        inventory.addProduct(product2);
        inventory.addProduct(product3);

        System.out.println("\nVérifie l'inventaire :");
        inventory.checkLowInventory();

        System.out.println("\nEnlève la PS5 de l'inventaire :");
        inventory.removeProduct(product3);

        System.out.println("\nVérifie à nouveau l'inventaire :");
        inventory.checkLowInventory();
    }
}
