package Functions.VideoGames;

public class MainVG {
    
    public static void main(String[] args) {
        
        VideoGamesLibrary library = new VideoGamesLibrary();

        VideoGame vg1 = new VideoGame("Clair Obscur: Expedition 33", 45, "PC");
        VideoGame vg2 = new VideoGame("Silent Hill 2 (Remake)", 70, "PS5");
        VideoGame vg3 = new VideoGame("Stellar Blade", 60, "PS5");
        VideoGame vg4 = new VideoGame("Resident Evil 4 (Remake)", 70, "PS5");

        library.addVideoGame(vg1);
        library.addVideoGame(vg2);
        library.addVideoGame(vg3);
        library.addVideoGame(vg4);

        System.out.println("Voici les jeux vidéos dans la librairie :");
        for (VideoGame videoGame : library.getVideoGames()) {
            System.out.println(videoGame.getTitle() + " sur " + videoGame.getConsole());
        }

        library.removeVideoGame(vg3);
        System.out.println("\nEt après avoir supprimé " + vg3.getTitle() + " de la liste :");
        for (VideoGame videoGame : library.getVideoGames()) {
            System.out.println(videoGame.getTitle() + " sur " + videoGame.getConsole());
        }
    }
}
