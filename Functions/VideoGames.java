package Functions;

import java.util.ArrayList;

public class VideoGames {
    
    private String titre;
    private double prix;
    private String console;
    private static ArrayList<VideoGames> videoGamesCollection = new ArrayList<VideoGames>(); // Déclare une liste pour stocker la collection de jeux

    public VideoGames(String titre, double prix, String console) { // Constructeur pour la classe qui initialise les variables privées
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

    public static void addVideoGame(VideoGames videoGame) { // Méthode pour ajouter un jeu dans la liste
        videoGamesCollection.add(videoGame);
    }

    public static void removeVideoGame(VideoGames videoGame) { // Méthode pour supprimer un jeu de la liste
        videoGamesCollection.remove(videoGame);
    }

    public static ArrayList<VideoGames> getVideoGamesCollection() { // Méthode pour retrouver la liste entière de jeux
        return videoGamesCollection;
    }

    public void printVideoGameDetail() {
        System.out.println("\nTitre : " + titre);
        System.out.println("Prix : " + prix);
        System.out.println("Plate-forme : " + console);
    }
}
