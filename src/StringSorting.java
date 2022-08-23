import Utility.Utilities;

import java.util.ArrayList;
import java.util.Collections;

public class StringSorting {
    public static void main(String[] args) {
        ArrayList<String> musicList = new ArrayList<>();


        musicList.add("Love");
        musicList.add("Peace");
        musicList.add("Patience");
        musicList.add("Kind");
        musicList.add("Faith");

        System.out.println("[UNSORTED]->" + musicList);

        Utility.Utilities.iteratedStringSort(musicList);

        Collections.sort(musicList);

        System.out.println("[SORTED]-> " + musicList);


        Utility.Utilities.iteratedStringSort(musicList);

        System.out.println("========ANY LIST =====");
        Utilities.iterateAnyList(musicList);
    }


}
