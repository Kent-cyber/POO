package Exercices.Music;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        MusicLibrary library = new MusicLibrary();

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
        library.playRandomMusic();
    }
}
