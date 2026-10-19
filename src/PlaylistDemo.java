/**
 * PlaylistDemo.java
 * Driver program to test the Track class.
 * Name Surname:Furkan Bozkurt
 * Date:05.10.2026
 */
public class PlaylistDemo {
    public static void main(String[] args) {
        System.out.println("=== Playlist Track Demo ===\n");
        //Default Constructor
        Track track1 = new Track();
        System.out.println("Default Track:");
        System.out.println(track1);
        System.out.println();
        //Title-only constructor
        Track track2 = new Track("Neon Lights");
        System.out.println("Title-only Track:");
        System.out.println(track2);
        System.out.println();
        //Title+artist constructor
        Track track3 = new Track("Ocean Drive", "Midnight Pulse");
        System.out.println("Title + Artist Track:");
        System.out.println(track3);
        System.out.println();
        //Full constructor
        Track track4 = new Track("Raindrop Waltz", "Clara Voss", 210, false);
        System.out.println("Full Track (non-explicit):");
        System.out.println(track4);
        System.out.println();
        //Invalid Duration Test
        System.out.println("Invalid Duration Test:");
        Track invalidTrack = new Track("Broken Clock", "Static Noise", -50, false);
        System.out.println(invalidTrack);
        System.out.println();
        //Getter Test
        System.out.println("Getter Test:");
        Track track5 = new Track("Stardust", "Stellar Echo", 242, true);
        System.out.println("Title: " + track5.getTitle());
        System.out.println("Artist: " + track5.getArtist());
        System.out.println("Duration: " + track5.getDurationFormatted());
        System.out.println("Explicit: " + track5.getIsExplicit());

    }


}
