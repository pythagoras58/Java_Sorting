import java.util.Scanner;

public class VowelFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("INPUT A WORD: \n");
        String myWords = scanner.next();

        for(int i=0; i< myWords.length(); i++){
            if(myWords.charAt(i) == 'a' || myWords.charAt(i)=='e'
                    || myWords.charAt(i)=='i' || myWords.charAt(i)=='o' || myWords.charAt(i)=='u'){
                System.out.println("[VOWEL FOUND IN STRING] ==>" + myWords.charAt(i));
            }
        }
    }
}
