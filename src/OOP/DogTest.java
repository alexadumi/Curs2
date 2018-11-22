package OOP;


import java.util.Scanner;

public class DogTest {
    public static void main(String[] args) {

        Scanner reader = new Scanner (System.in);

        Dog someDog = new Dog();
        someDog.size = reader.nextInt();
        someDog.bark (reader.nextInt());



    }
}
