package weekNine;

import java.util.Scanner;

public class ArrayFromInput {
    public static void main(String[] args) {
        //table number, table size, table availability
        int[] tableNumber = new int[3];
        int[] tableSize = new int[3];
        boolean[] tableAvailability = new boolean[3];

        Scanner keyboard = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {

            System.out.println("Enter in the table number " + (i + 1) + ":");
            tableNumber[i] = Integer.parseInt(keyboard.nextLine());

            System.out.println("Enter in the table size " + (i + 1) + ":");
            tableSize[i] = Integer.parseInt(keyboard.nextLine());

            System.out.println("Is the table available? (t/f) " + (i + 1) + ":");
            tableAvailability[i] = Boolean.parseBoolean(keyboard.nextLine());

            System.out.println("-------------------------------------------");
        }

        System.out.println("Tables");
        System.out.println("-----------------------------");
        //header
        System.out.println("\t\tNumber\tSize\tAvailability");
        System.out.println("\t\t------\t----\t------------");
        for(int i = 0; i < tableSize.length; i++){
            System.out.println("Table " +(i + 1)+ ":  " +tableNumber[i] +"\t     "+ tableSize[i] +"\t\t   "+ tableAvailability[i]);
        }
    }
}
