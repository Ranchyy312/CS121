package weekNine;

import javax.swing.*;
import java.util.Scanner;

public class RestaurantReservationSimulation {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        //Initalize book info & Hardcoded table info - least 3 tables
        String[][] tables = {
                {"four", "four", "six"},
                {"Booked", "Available", "Available"}
        };

        //Print Tables (Inital) - use a for each loop
        System.out.println("-------Books-------");
        for (String[] row : tables) {
            for (String table : row) {
                System.out.printf(table + " ");
            }
            System.out.println();
        }

        //Simulate Reservation - update a reservation from Available to Booked
        String availableTables = "";
        if (tables[1][0] == "Available") {
            availableTables = availableTables + "one - four seats, ";
        }
        if (tables[1][1] == "Available") {
            availableTables = availableTables + "two - four seats, ";
        }
        if (tables[1][2] == "Available") {
            availableTables = availableTables + "three - six seats";
        }

        //ask what table they want to reserve
        System.out.println(" ");
        System.out.println("What table would you like to reserve? " + availableTables);
        String ans = keyboard.nextLine();

        //update books
        if (tables[1][0] == "Available") {
            if (ans == "one") {
                tables[1][0] = "Booked";
                System.out.println("Table one has been reserved for four people.");
            }
        }
        if (tables[1][1] == "Available") {
            if (ans == "two") {
                tables[1][1] = "Booked";
                System.out.println("Table two has been reserved for four people.");
            }
        }
        if (tables[1][2] == "Available") {
            if (ans == "three") {
                tables[1][2] = "Booked";
                System.out.println("Table three has been reserved for six people.");
                System.out.println(" ");
            }
        }
        
        //Print Books (Updated) - use a for each loop
        System.out.println(" ");
        System.out.println("-------Books-------");
        for (String[] row : tables) {
            for (String table : row) {
                System.out.printf(table + " ");
            }
            System.out.println();
        }
    }
}
