package Utility;

import java.util.ArrayList;

public class Utilities {

    public static void iteratedStringSort(ArrayList<String> musicList) {
        for(String items : musicList){
            System.out.println("[ITEMS]->" + items);
        }
    }

    public static void iterateIntegerList(ArrayList<Integer> integerArrayList) {
        for(Integer item : integerArrayList){
            System.out.println("[ITEM] -> " + item);
        }
    }

    public static<T> void iterateAnyList(ArrayList<T> integerArrayList) {
        for(T item : integerArrayList){
            System.out.println("[ITEM] -> " + item);
        }
    }
}
