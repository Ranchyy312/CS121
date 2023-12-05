package weekFifteen.dateFormatActivity;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter start date of diet as mm/dd/yyyy : ");
        String startDate = keyboard.nextLine();

        System.out.println("Enter end date of diet as mm/dd/yyyy : ");
        String endDate = keyboard.nextLine();

        System.out.println("Enter amount of calories allowed per day : ");
        int cal = keyboard.nextInt();

        int totalCal = TotalCalories.calcCalories(cal,startDate,endDate);
        System.out.println("Total Calories : "+totalCal);
    }

}
