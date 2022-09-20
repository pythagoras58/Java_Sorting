package OOPS;

import java.util.ArrayList;
import java.util.List;

public class Concepts {
    public static void main(String[] args) {

        //Lists
        List<String> names = new ArrayList<>();

        names.add("Abena");
        names.add("Danso");
        names.add("Anne");

        names.forEach(person ->{
            System.out.println("Name is : " + person);
        });
    }
}
