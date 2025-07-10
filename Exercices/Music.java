package Exercices;

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

    /*MusicLibrary library = new MusicLibrary();

        // Ajoute ces musiques dans la ludothèque
        library.addMusic(new Music("Pjanoo", "Eric Prydz"));
        library.addMusic(new Music("There Might Be Coffee", "Deadmau5"));
        library.addMusic(new Music("Nuclear", "Mike Oldfield"));
        library.addMusic(new Music("Neverender", "Justice feat. Tame Impala"));
        library.addMusic(new Music("After Dark", "Mr.Kitty"));
        library.addMusic(new Music("Paradise", "Coldplay"));
        library.addMusic(new Music("My Love", "Route 94"));

        // Affiche toutes les musiques ajoutées
        System.out.println("Voici les musiques :");

        // Parcoure la liste et affiche le titre et l'artiste
        for (Music music : library.getMusics()) {
            System.out.println(music.getTitle() + " par " + music.getArtist());
        }

        // Affiche le message pour dire que les musiques sont jouées de manière aléatoire
        System.out.println("\n**Joue ces musiques aléatoires**");

        // Joue et affiche les musiques aléatoires choisi trois fois
        library.playRandomMusic();
        System.out.println();
        library.playRandomMusic();
        System.out.println();
        library.playRandomMusic();*/
}
