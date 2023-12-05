package weekFour.loopsActivities;

import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        //Random
        Random rand = new Random();
        int num = rand.nextInt(1,5);
        
        //Start game
        String answer = "";
        int numGuess = 0;

        while(true){
            System.out.println("Guess a number between 1 and a 100, or enter q to quit");
            numGuess++;
            answer = console.nextLine();
            if(answer.equals("q")) {
                System.out.println("You quit. The number was " +num);
                break;
            }else{
                int guess = Integer.parseInt(answer);
                if (guess > num) {
                    System.out.println("Too high, guess again.");
                }
                if (guess < num) {
                    System.out.println("Too low, guess again.");
                }
                if (guess == num) {
                    System.out.println("Correct! The number was " + num);
                    System.out.println("It took you " + numGuess +" tries");
                    break;
                }
            }
        }
    }
}

