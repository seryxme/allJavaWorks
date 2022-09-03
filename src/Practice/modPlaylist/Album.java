package Practice.modPlaylist;

import java.util.ArrayList;

public class Album {
    private final String artist;
    private final String albumTitle;
    private final SongList songList;

    public Album(String artist, String albumTitle) {
        this.artist = artist;
        this.albumTitle = albumTitle;
        songList = new SongList();
    }

    public void addSong(Song song) {
        songList.addSong(song);
    }

    public void addSongList(ArrayList<Song> songList) {
        this.songList.addSongList(songList);
    }

    public String getArtist() {
        return artist;
    }

    public String getAlbumTitle() {
        return albumTitle;
    }

    public ArrayList<Song> getAlbum() {
        return songList.getSongList();
    }

    public void trackList() {
        System.out.print(this);
        System.out.println("----------------------------");
        for (Song song: songList.getSongList()) {
            System.out.println(song);
        }
        System.out.println("----------------------------");
    }

    public Song findSong(String title) {
        return songList.findSong(title);
    }

    @Override
    public String toString() {
        return String.format("""
                
                Album Title: %s
                Artiste: %s
                """, getAlbumTitle(), getArtist());
    }

    private class SongList {
        private final ArrayList<Song> albumTracks;
        public SongList() {
            albumTracks = new ArrayList<>();
        }

        public void addSong(Song song) {
            albumTracks.add(song);
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

        public ArrayList<Song> getSongList() {
            return albumTracks;
        }
    }
}
