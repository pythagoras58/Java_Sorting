import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(2);
        integerArrayList.add(1);
        integerArrayList.add(3);
        integerArrayList.add(6);
        integerArrayList.add(7);

        System.out.println("[UNSORTED]->" +integerArrayList);

        /*
        * Sort the arraylist using collections
        * */

        Collections.sort(integerArrayList);
        System.out.println("[SORTED]->" + integerArrayList);

        for(Integer item : integerArrayList){
            System.out.println("[ITEM] -> " + item);
        }
    }
}
