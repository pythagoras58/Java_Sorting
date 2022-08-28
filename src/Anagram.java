import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        /*
        * Words that have the same characters
        * But in different positions are called Anagrams
        * */

        String s1 = "ARMS";
        String s2 = "MARS";

        char ch1[] = s1.toLowerCase().toCharArray();
        char ch2[] = s2.toLowerCase().toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        System.out.println(ch1);
        System.out.println(ch2);

        if(ch1.toString().equals(ch2.toString())){
            System.out.println("WORDS ARE ANAGRAM");
        }else {
            System.out.println("WORDS ARE NOT ANAGRAM");
        }

//        if(ch1.equals(ch2)){
//            System.out.println("WORDS ARE ANAGRAM");
//        }else {
//            System.out.println("WORDS ARE NOT ANAGRAM");
//        }
    }
}
