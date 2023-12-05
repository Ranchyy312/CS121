package weekThree;

import javax.swing.*;
import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        //ask for a number
        Scanner console = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = Integer.parseInt(console.nextLine());

        //test if its even or odd
        if(num % 2 == 0){
            System.out.println("The number is even");
        }else{
            System.out.println("The number is odd");
        }
    }
}
