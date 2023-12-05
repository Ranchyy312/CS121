package weekFour;

import java.util.Random;
import java.util.Scanner;

public class ESPGame {
    public static void main(String []args){
        Scanner console = new Scanner(System.in);

        String answer = "";
        int correct = 0;

        System.out.println("-----------------------------------------");

        for (int n = 1; n <= 10; n++) {

            //random
            Random rand = new Random();
            int num = rand.nextInt(0,5);

            //ask
            System.out.println(n + ". What color has the computer chosen?");
            answer = console.nextLine();

            //compare random num and change color
            String color = "";
            for (int c = 1; c <= 10; c++) {
                if (num == 0) {
                    color = "red";
                }
                if (num == 1) {
                    color = "green";
                }
                if (num == 2) {
                    color = "blue";
                }
                if (num == 3) {
                    color = "orange";
                }
                if (num == 4) {
                    color = "yellow";
                }
            }

            // says what computer chose after answer and computer selected
            System.out.println("> The computer chose " + color);
            System.out.println("-----------------------------------------");

            //add to correct answers
            if (answer.equals(color)) {
                correct++;
            }
        }
        //displays running total of correct answers
        System.out.println("* You got " + correct + " out of 10 correct *");

    }
}
