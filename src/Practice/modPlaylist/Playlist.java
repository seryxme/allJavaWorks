package Practice.modPlaylist;

import java.util.*;

public class Playlist {
    private static final LinkedList<Song> myPlaylist = new LinkedList<>();
    private static ArrayList<Album> myAlbums = new ArrayList<>();
    private static final Scanner optionReader = new Scanner(System.in);
    private static String playlistName;
    private static int index;
    private static boolean nextSong = true;

    public static void main(String[] args) {
        loadAlbums();
        startPlaylist();
    }

    private static void startPlaylist() {
        try {
            System.out.println("""
                    1 -> Add Songs
                    2 -> Play Song
                    3 -> Play All Songs
                    4 -> Delete Current Song
                    5 -> Show Playlist
                    6 -> Show Available Albums
                    0 -> Exit App
                    """);
            int option = optionReader.nextInt();
            optionReader.nextLine();

            switch (option) {
                case 1 -> addSong();
                case 2 -> playNext();
                case 3 -> playAllSongs();
                case 4 -> deleteSong();
                case 5 -> displayPlaylist();
                case 6 -> displayAlbumTracks();
                case 0 -> System.exit(0);
                default -> {
                    System.out.println("Invalid selection.");
                    startPlaylist();
                }
            }
        } catch (InputMismatchException ex) {
            System.out.println("Enter only numbers.");
            startPlaylist();
        }
    }

    private static void displayPlaylist() {
        for (Song song: myPlaylist) {
            System.out.println(song);
            System.out.println("----------------------------");
        }
        System.out.println("----------------------------");
        startPlaylist();
    }

    private static void displayAlbumTracks() {
        for (Album album: myAlbums) {
            album.trackList();
        }
        startPlaylist();
    }

    private static void loadAlbums() {
        myAlbums = SongDB.uploadSongs();
        for (Album album : myAlbums) {
            myPlaylist.addAll(album.getAlbum());
            }

        System.out.println("Enter the name of your playlist: ");
        playlistName = optionReader.nextLine();
    }


    private static void addSong() {
        try {
            System.out.println("Enter the song title: ");
            String songTitle = optionReader.nextLine();

            Song foundSong = null;
            for (Album album : myAlbums) {
                if (album.findSong(songTitle) != null) {
                    foundSong = album.findSong(songTitle);
                    myPlaylist.add(foundSong);
                    System.out.println(songTitle + " added to " + playlistName + " playlist.");
                    break;
                }
            }
            if (foundSong == null) System.out.println("Song not found in library.");
            System.out.println("""
                                        
                    Add another song?
                    1. Yes
                    2. No
                    """);
            int option = optionReader.nextInt();
            optionReader.nextLine();

            if (option == 1) addSong();
            else startPlaylist();
        } catch (InputMismatchException ex) {
            System.out.println("Enter only numbers.");
            addSong();
        }
    }

    private static void playAllSongs() {
        for (Song song : myPlaylist) {
            songDisplay(song);
        }
        startPlaylist();
    }

    private static void songDisplay(Song song) {
        System.out.println("Now playing...\n" + song);
        String[] timer = song.getDuration().split(":");
        int secs = Integer.parseInt(timer[1]);
        try {
            Thread.sleep(100L *secs);
        } catch (InterruptedException e){
            System.out.println("Interrupted.");
        }
    }

    private static void playOptions() {
        try {
            System.out.println("""
                    1. Play Next Song
                    2. Play Previous Song
                    3. Repeat Song
                    0. Back
                    """);
            int option = optionReader.nextInt();
            switch (option) {
                case 1 -> playNext();
                case 2 -> playPrevious();
                case 3 -> repeatSong();
                case 0 -> startPlaylist();
                default -> {
                    System.out.println("Invalid Selection.");
                    playOptions();
                }
            }
        } catch (InputMismatchException ex) {
            System.out.println("Enter only numbers.");
            playOptions();
        } catch (NoSuchElementException ex) {
            System.out.println("No tracks to play.");
            playOptions();
        }
    }

    private static void playNext() {
        if (!nextSong) {
            if (myPlaylist.listIterator(index).hasNext()) {
                index++;
                nextSong = true;
            }
        }

        if (myPlaylist.listIterator(index).hasNext()) {
            songDisplay(myPlaylist.listIterator(index).next());
            index++;
        }
        else System.out.println("You're at the end of the playlist.");
        playOptions();
    }

    private static void playPrevious() {
        if (nextSong) {
            if (myPlaylist.listIterator(index).hasPrevious()) {
                index--;
                nextSong = false;
            }
        }

        if (myPlaylist.listIterator(index).hasPrevious()) {
            songDisplay(myPlaylist.listIterator(index).previous());
            index--;
        }
        else System.out.println("You're at the beginning of the playlist.");
        playOptions();
    }

    private static void repeatSong() {
        if (!nextSong) {
            nextSong = true;
            playNext();
        }
        else {
            nextSong = false;
            playPrevious();
        }
    }

    private static void deleteSong() {
        myPlaylist.remove();
    }
}