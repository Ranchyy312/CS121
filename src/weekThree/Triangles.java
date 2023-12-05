package weekThree;

import java.util.Scanner;

public class Triangles {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        //a
        System.out.println("Enter number 1:");
        int a = Integer.parseInt(console.nextLine());
        //b
        System.out.println("Enter number 2:");
        int b = Integer.parseInt(console.nextLine());
        //c
        System.out.println("Enter number 3:");
        int c = Integer.parseInt(console.nextLine());
        //String triangle
        String triangle;
        triangle = "";

        if(a!=b && a!=c && b!=c){
            triangle = "scalene";
        }
        if(a!=b && b==c || b!=c && a==c || a!=c && a==b){
            triangle = "isosceles";
        }
        if(a==b && b==c && a==c){
            triangle = "equilateral";
        }
        System.out.println("The triangle is: "+ triangle);

    }
}
