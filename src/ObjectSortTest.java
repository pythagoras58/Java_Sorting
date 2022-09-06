
class Human{ }

class Doctor extends Human{ }

class Animal{ }

class Dog extends Animal{}

class Bird{}

public class ObjectSortTest {

    public static <T extends Human> void printInfo(T anyObj){
        System.out.println("Hey, you are a Human/Animal/Bird...");
    }

    public static void main(String[] args) {
        printInfo(new Human());
        printInfo(new Doctor());
    }
}
