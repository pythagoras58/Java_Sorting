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
        iteratedSort(musicList);

        Collections.sort(musicList);

        System.out.println("[SORTED]-> " + musicList);

        iteratedSort(musicList);
    }

    private static void iteratedSort(ArrayList<String> musicList) {
        for(String items : musicList){
            System.out.println("[ITEMS]->" + items);
        }
    }
}
