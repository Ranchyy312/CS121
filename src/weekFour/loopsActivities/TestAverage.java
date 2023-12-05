package weekFour.loopsActivities;

import java.util.Scanner;

public class TestAverage {
    public static void main(String [] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Enter number of students");
        int students = Integer.parseInt(console.nextLine());

        System.out.println("Enter number of tests per student");
        int tests = Integer.parseInt(console.nextLine());

        for (int s = 1; s <= students; s++) {

            System.out.println();
            System.out.println("Student number "+s);
            System.out.println("-------------------");
            double average = 0.0;

            for (int t = 1; t <= tests; t++) {
                System.out.println("Enter the score for test " + t);
                int score = Integer.parseInt(console.nextLine());
                average = average + score;
            }
            average = (average/tests);
            System.out.println("The average for student " +s+ " is "+ average);
        }
    }
}
