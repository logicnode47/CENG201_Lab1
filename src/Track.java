/**
 * Track.java
 * Represents a single music track in a streaming playlist.
 * Name Surname:Furkan Bozkurt
 * Date:05.10.2026
 */
public class Track {
    // Instance variables for track information
    private String title;
    private String artist;
    private int durationSeconds;
    private boolean isExplicit;

    // Constructor with all track information
    public Track(String title, String artist, int durationSeconds, boolean isExplicit) {
        this.title = title;
        this.artist = artist;
        this.isExplicit = isExplicit;
        // Duration cannot be negative
        if (durationSeconds < 0) {
            this.durationSeconds = 0;
        } else {
            this.durationSeconds = durationSeconds;
        }
    }

    public Track(String title, String artist) {
        this(title, artist, 0, false);
    }

    public Track(String title) {
        this(title, "Unknown Artist", 0, false);
    }
    public Track() {
        this("Unknown Title", "Unknown Artist", 0, false);
    }
    public String getTitle(){
        return title;
    }
    public String getArtist(){
        return artist;
    }
    public int getDurationSeconds(){
        return durationSeconds;
    }
    public boolean getIsExplicit(){
        return isExplicit;
    }
    public String getDurationFormatted(){
        int minutes = durationSeconds / 60;
        int seconds = durationSeconds % 60;
        return String.format("%d:02",minutes,seconds);
    }
    @Override
    public String toString() {
        String result = "\" " + title + "by" + artist + "[" + getDurationFormatted() + "]";
        if (isExplicit) {
            result += "[EXPLICIT]";
        }

        return result;
    }



}
