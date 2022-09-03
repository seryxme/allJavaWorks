package Practice.modPlaylist;

public class Song {
    private String title;
    private String duration;
    private String featuredArtist;

    public Song(String title, String duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public String getDuration() {
        return duration;
    }

    public String getFeaturedArtist() {
        return featuredArtist;
    }

    public void setFeaturedArtist(String featuredArtist) {
        this.featuredArtist = featuredArtist;
    }

    public static Song createSong(String title, String duration) {
        return new Song(title, duration);
    }

    public static Song createSong(String title, String duration, String featuredArtist) {
        Song newSong = new Song(title, duration);
        newSong.setFeaturedArtist(featuredArtist);
        return newSong;
    }

    @Override
    public String toString() {
        if(featuredArtist != null) {
            return String.format("Title: %s ft. %s%nDuration: %s", getTitle(), getFeaturedArtist(), getDuration());
        }
        return String.format("Title: %s%nDuration: %s", getTitle(), getDuration());
    }
}
