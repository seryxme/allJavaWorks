package Practice.playlist;

import java.util.ArrayList;

public class Album {
    private final String artist;
    private final String albumTitle;
    private ArrayList<Song> albumTracks;

    public Album(String artist, String albumTitle) {
        this.artist = artist;
        this.albumTitle = albumTitle;
        albumTracks = new ArrayList<>();
    }

    public String getArtist() {
        return artist;
    }

    public String getAlbumTitle() {
        return albumTitle;
    }

    public void addSong(Song song) {
        albumTracks.add(song);
    }

    public ArrayList<Song> getAlbum() {
        return albumTracks;
    }

    public void addSongList(ArrayList<Song> songList) {
        albumTracks.addAll(songList);
    }

    public Song findSong(String title) {
        for (Song foundSong: albumTracks) {
            if (foundSong.getTitle().equalsIgnoreCase(title)) {
                return foundSong;
            }
        }
        return null;
    }

    public void trackList() {
        System.out.print(this);
        System.out.println("----------------------------");
        for (Song song: albumTracks) {
            System.out.println(song);
        }
        System.out.println("----------------------------");
    }

    @Override
    public String toString() {
        return String.format("""
                
                Album Title: %s
                Artiste: %s
                """, getAlbumTitle(), getArtist());
    }
}
