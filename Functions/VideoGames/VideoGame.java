package Functions.VideoGames;

public class VideoGame {
    
    private String titre;
    private double prix;
    private String console;

    public VideoGame(String titre, double prix, String console) { // Constructeur pour la classe qui initialise les variables privées
        this.titre = titre;
        this.prix = prix;
        this.console = console;
    }

    public String getTitle() { // Méthode pour retrouver le titre
        return titre;
    }

    public void setTitle(String titre) { // Méthode pour un entrer le titre
        this.titre = titre;
    }

    public double getPrice() { // Méthode pour retrouver le prix
        return prix;
    }

    public void setPrice(int prix) { // Méthode pour entrer le prix
        this.prix = prix;
    }

    public String getConsole() { // Méthode pour trouver la plate-forme du jeu
        return console;
    }

    public void setConsole(String console) { // Méthode pour entrer la plate-forme
        this.console = console;
    }

    public void printVideoGameDetail() {
        System.out.println("Titre : " + titre);
        System.out.println("Prix : " + prix);
        System.out.println("Plate-forme : " + console + "\n");
    }
}
