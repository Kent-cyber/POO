package Exercices.Music;

import java.util.*;

public class MusicLibrary {
    
    private ArrayList<Music> musics;

    public MusicLibrary() {
        musics = new ArrayList<Music>();
    }

    public void addMusic(Music music) {
        musics.add(music);
    }

    public void removeMusics(Music music) {
        musics.remove(music);
    }

    public ArrayList<Music> getMusics() {
        return musics;
    }

    public void playRandomMusic() {
        int size = musics.size();

        if (size == 0) {
            System.out.println("Aucune musique dans votre ludothèque");
            return;
        }

        Random random = new Random();
        int index = random.nextInt(size);

        System.out.println("En cours d'audio : " + musics.get(index).getTitle() + " par " + musics.get(index).getArtist());

    }
}
