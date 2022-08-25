import Utility.Utilities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CharSorting {
    public static void main(String[] args) {

        ArrayList<String> alphabeths = new ArrayList<>();

        alphabeths.add("A");
        alphabeths.add("U");
        alphabeths.add("E");
        alphabeths.add("I");
        alphabeths.add("O");

        System.out.println("[UNSORTED LIST]===>" + alphabeths);

        // sorted list
        Collections.sort(alphabeths);

        System.out.println("[SORTED LIST]===>" + alphabeths);

        // loop through
        Utilities.iterateAnyList(alphabeths);
    }
}
