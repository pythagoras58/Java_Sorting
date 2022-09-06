import Utility.Utilities;
import api.Song;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MP4 {
    public static void main(String[] args) {

        Song s1 = new Song("Hello","Adele", 2013);
        Song s2 = new Song("Prisoner","Adele", 2013);
        Song s3 = new Song("Loving you","Adele", 2013);
        Song s4 = new Song("Don't Go","Adele", 2013);

        ArrayList<Song> musicList = new ArrayList<>();

        musicList.add(s1);
        musicList.add(s2);
        musicList.add(s3);
        musicList.add(s4);

        Utilities.iterateAnyList(musicList);

        System.out.println("[=============AFTER SORTING=============]");
        Collections.sort(musicList);

        Utilities.iterateAnyList(musicList);



    }
}
