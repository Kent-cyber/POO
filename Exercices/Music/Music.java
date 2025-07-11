package Exercices.Music;

public class Music { // Création de la classe Musique
    
    private String titre; // Création des attributs (états)
    private String artiste;

    public Music(String titre, String artiste) { // Constructeur pour la classe Musique
        this.titre = titre; // Initialise la valeur pour l'attribut nom
        this.artiste = artiste;
    }

    public String getTitle() { // Méthode pour retrouver le nom de la musique
        return titre;
    }

    public void setTitle(String titre) { // Méthode pour entrer le nom de la musique
        this.titre = titre;
    }

    public String getArtist() { // Méthode pour retrouver l'artiste
        return artiste;
    }

    public void setArtist(String artiste) { // Méthode pour entrer l'artiste
        this.artiste = artiste;
    }

    public void printMusicDetail() { // Méthode pour afficher les détails de la musique
        System.out.println("\nTitre : " + titre);
        System.out.println("Artiste : " + artiste);
    }
    
/******************** Code à mettre dans le main *******************************************/
}
