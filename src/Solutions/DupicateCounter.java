package Solutions;

import java.util.HashMap;
import java.util.Map;

public class DupicateCounter {
    public static void main(String[] args) {
        String charact = "Abena";

        var newString = charact.toLowerCase();
        Map<Character, Integer> results = new HashMap<>();

        for(int i=0; i<newString.length(); i++){
            char ch = newString.charAt(i);

            results.compute(ch, (k,v)->(v==null) ? 1: ++v);

            if(ch == newString.charAt(i)){
                System.out.println("Dublicate found");
            }else{
                System.out.println("No duplicate found");
            }
        }

        System.out.println(results);
    }
}
