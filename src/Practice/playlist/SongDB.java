package Practice.playlist;

import java.util.ArrayList;
import java.util.Arrays;

public class SongDB {
    public static ArrayList<Album> albumArrayList = new ArrayList<>();

    private static Song grodt1 = Song.createSong("Many Men (Wish Death)", "4:16");
    private static Song grodt2 = Song.createSong("Patiently Waiting", "4:48", "Eminem");
    private static Song grodt3 = Song.createSong("In Da Club", "3:13");
    private static Song grodt4 = Song.createSong("High All The Time", "4:29");
    private static Song grodt5 = Song.createSong("Heat", "4:14");
    private static Song grodt6 = Song.createSong("Blood Hound", "4:00", "Young Buck");
    private static Song grodt7 = Song.createSong("P.I.M.P.", "4:09");
    private static Song grodt8 = Song.createSong("21 Questions", "3:44", "Nate Dogg");

    private static Song m2m1 = Song.createSong("I Know You Like It", "3:10");
    private static Song m2m2 = Song.createSong("Who Born The Maga", "3:04", "K-Switch");
    private static Song m2m3 = Song.createSong("Se Na Like This", "4:11");
    private static Song m2m4 = Song.createSong("Bumper to Bumper", "4:29");
    private static Song m2m5 = Song.createSong("Ololufe", "4:14");
    private static Song m2m6 = Song.createSong("You Bad", "4:05", "D'Banj");

    private static Song bp1 = Song.createSong("Take Over", "5:13");
    private static Song bp2 = Song.createSong("Renegade", "2:35", "Eminem");
    private static Song bp3 = Song.createSong("Jigga That N***a", "3:24");
    private static Song bp4 = Song.createSong("Never Change", "3:57");
    private static Song bp5 = Song.createSong("Izzo (H.O.V.A.)", "4:00");
    private static Song bp6 = Song.createSong("Girls, Girls, Girls", "4:35");
    private static Song bp7 = Song.createSong("'03 Bonnie and Clyde'", "3:45", "Beyonce");

    public static ArrayList<Album> uploadSongs() {
        Song[] album1 = {grodt1,grodt2,grodt3,grodt4, grodt5,grodt6,grodt7,grodt8};
        ArrayList<Song> newAlbum = new ArrayList<>(Arrays.asList(album1));
        Album grodt = new Album("50 Cent","Get Rich or Die Tryin'");
        grodt.addSongList(newAlbum);
        albumArrayList.add(grodt);

        Song[] album2 = {m2m1,m2m2,m2m3,m2m4,m2m5,m2m6};
        ArrayList<Song> newAlbum2 = new ArrayList<>(Arrays.asList(album2));
        Album m2m = new Album("Wande Coal","Mushin 2 Mo'Hits");
        m2m.addSongList(newAlbum2);
        albumArrayList.add(m2m);

        Song[] album3 = {bp1,bp2,bp3,bp4,bp5,bp6,bp7};
        ArrayList<Song> newAlbum3 = new ArrayList<>(Arrays.asList(album3));
        Album bp = new Album("Jay-Z","The Blueprint");
        bp.addSongList(newAlbum3);
        albumArrayList.add(bp);

        return albumArrayList;
    }

}
