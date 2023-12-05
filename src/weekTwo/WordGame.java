package weekTwo;

import java.util.Scanner;

public class WordGame {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        System.out.println("What is your name?");
        String firstName = keyboard.nextLine();

        System.out.println("What is your age?");
        int age = Integer.parseInt(keyboard.nextLine());

        System.out.println("What city are you from?");
        String city = keyboard.nextLine();

        System.out.println("What college do you go to?");
        String college = keyboard.nextLine();

        System.out.println("What is your major?");
        String major = keyboard.nextLine();

        System.out.println("What is your favorite animal?");
        String animal = keyboard.nextLine();

        System.out.println("What is your pet's name?");
        String pet = keyboard.nextLine();

        System.out.printf("There once was a person named %s who lived in %s.\n",firstName,city);
        System.out.printf("At the age of %d, %s went to college at %s.\n",age,firstName,college);
        System.out.printf("%s graduated with a %s. Then, %s adopted a(n) %s named %s.\n",firstName,major,firstName,animal,pet);
        System.out.printf("They both lived happily ever after!");
    }
}