package weekTwelve;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
import java.util.Scanner;

public class RestaurantSet {

    public static Set<Integer> addTables(){
        Set<Integer> tables = new HashSet<>();

        Scanner keyboard = new Scanner(System.in);
        System.out.println("How many tables do you want to add? Or enter 0 to exit.");
        int input = keyboard.nextInt();
        while(input > 0){
            for(int i = 1; i <= input; i++){
                System.out.println("Enter table number :");
                int tabNum = keyboard.nextInt();
                tables.add(tabNum);
            }
            System.out.println("Tables have been added :)");
            return tables;
        }
        return tables;
    }
    public static void displayTables(Set<Integer> tables){
        Iterator<Integer> it = tables.iterator();
        while(it.hasNext()){
            Integer s = it.next();
            System.out.print(s + " ");
        }
    }
}
