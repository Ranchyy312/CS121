package weekFour.loopsActivities;

import java.util.Scanner;

public class AverageRainfall {
    public static void main(String[] args){

        Scanner console = new Scanner(System.in);

        System.out.println("Enter number of years");
        int years = Integer.parseInt(console.nextLine());
        int totInch = 0;

        for(int y = 1; y <= years;y++) {
            int months = 12;
            for (int m = 1; m <= months; m++) {
                System.out.println("Enter inches of rainfall for year " + y + " month " + m);
                int inches = Integer.parseInt(console.nextLine());
                totInch = totInch + inches;
            }
        }
        int totMonths = years*12;
        double average= (double)totInch/totMonths;
        System.out.println("----------------------------------------------------------");
        System.out.println("Total Number of Months : "+totMonths);
        System.out.println("Total Inches of Rainfall : "+totInch);
        System.out.println("Average Rainfall per Month for "+years+" Years : "+average);
    }
}
