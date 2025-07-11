package Functions.VideoGames;

import java.util.ArrayList;

public class VideoGamesLibrary {
    
    private ArrayList<VideoGame> videoGames;

    public VideoGamesLibrary() {
        videoGames = new ArrayList<VideoGame>();
    }

    public void addVideoGame(VideoGame videoGame) {
        videoGames.add(videoGame);
    } 

    public void removeVideoGame(VideoGame videoGame) {
        videoGames.remove(videoGame);
    }

    public ArrayList<VideoGame> getVideoGames() {
        return videoGames;
    }
}
