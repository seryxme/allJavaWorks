package Practice.modPlaylist;

import Practice.playlist.Album;
import Practice.playlist.Song;

import java.util.ArrayList;
import java.util.Arrays;

public class SongDB {
    public static ArrayList<Practice.modPlaylist.Album> albumArrayList = new ArrayList<>();

    private static Practice.modPlaylist.Song grodt1 = Practice.modPlaylist.Song.createSong("Many Men (Wish Death)", "4:16");
    private static Practice.modPlaylist.Song grodt2 = Practice.modPlaylist.Song.createSong("Patiently Waiting", "4:48", "Eminem");
    private static Practice.modPlaylist.Song grodt3 = Practice.modPlaylist.Song.createSong("In Da Club", "3:13");
    private static Practice.modPlaylist.Song grodt4 = Practice.modPlaylist.Song.createSong("High All The Time", "4:29");
    private static Practice.modPlaylist.Song grodt5 = Practice.modPlaylist.Song.createSong("Heat", "4:14");
    private static Practice.modPlaylist.Song grodt6 = Practice.modPlaylist.Song.createSong("Blood Hound", "4:00", "Young Buck");
    private static Practice.modPlaylist.Song grodt7 = Practice.modPlaylist.Song.createSong("P.I.M.P.", "4:09");
    private static Practice.modPlaylist.Song grodt8 = Practice.modPlaylist.Song.createSong("21 Questions", "3:44", "Nate Dogg");

    private static Practice.modPlaylist.Song m2m1 = Practice.modPlaylist.Song.createSong("I Know You Like It", "3:10");
    private static Practice.modPlaylist.Song m2m2 = Practice.modPlaylist.Song.createSong("Who Born The Maga", "3:04", "K-Switch");
    private static Practice.modPlaylist.Song m2m3 = Practice.modPlaylist.Song.createSong("Se Na Like This", "4:11");
    private static Practice.modPlaylist.Song m2m4 = Practice.modPlaylist.Song.createSong("Bumper to Bumper", "4:29");
    private static Practice.modPlaylist.Song m2m5 = Practice.modPlaylist.Song.createSong("Ololufe", "4:14");
    private static Practice.modPlaylist.Song m2m6 = Practice.modPlaylist.Song.createSong("You Bad", "4:05", "D'Banj");

    private static Practice.modPlaylist.Song bp1 = Practice.modPlaylist.Song.createSong("Take Over", "5:13");
    private static Practice.modPlaylist.Song bp2 = Practice.modPlaylist.Song.createSong("Renegade", "2:35", "Eminem");
    private static Practice.modPlaylist.Song bp3 = Practice.modPlaylist.Song.createSong("Jigga That N***a", "3:24");
    private static Practice.modPlaylist.Song bp4 = Practice.modPlaylist.Song.createSong("Never Change", "3:57");
    private static Practice.modPlaylist.Song bp5 = Practice.modPlaylist.Song.createSong("Izzo (H.O.V.A.)", "4:00");
    private static Practice.modPlaylist.Song bp6 = Practice.modPlaylist.Song.createSong("Girls, Girls, Girls", "4:35");
    private static Practice.modPlaylist.Song bp7 = Practice.modPlaylist.Song.createSong("'03 Bonnie and Clyde'", "3:45", "Beyonce");

    public static ArrayList<Practice.modPlaylist.Album> uploadSongs() {
        Practice.modPlaylist.Song[] album1 = {grodt1,grodt2,grodt3,grodt4, grodt5,grodt6,grodt7,grodt8};
        ArrayList<Practice.modPlaylist.Song> newAlbum = new ArrayList<>(Arrays.asList(album1));
        Practice.modPlaylist.Album grodt = new Practice.modPlaylist.Album("50 Cent","Get Rich or Die Tryin'");
        grodt.addSongList(newAlbum);
        albumArrayList.add(grodt);

        Practice.modPlaylist.Song[] album2 = {m2m1,m2m2,m2m3,m2m4,m2m5,m2m6};
        ArrayList<Practice.modPlaylist.Song> newAlbum2 = new ArrayList<>(Arrays.asList(album2));
        Practice.modPlaylist.Album m2m = new Practice.modPlaylist.Album("Wande Coal","Mushin 2 Mo'Hits");
        m2m.addSongList(newAlbum2);
        albumArrayList.add(m2m);

        Practice.modPlaylist.Song[] album3 = {bp1,bp2,bp3,bp4,bp5,bp6,bp7};
        ArrayList<Practice.modPlaylist.Song> newAlbum3 = new ArrayList<>(Arrays.asList(album3));
        Practice.modPlaylist.Album bp = new Practice.modPlaylist.Album("Jay-Z","The Blueprint");
        bp.addSongList(newAlbum3);
        albumArrayList.add(bp);

        return albumArrayList;
    }

}
