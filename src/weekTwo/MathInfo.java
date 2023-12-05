package weekTwo;

import java.util.Scanner;

public class MathInfo {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);

        //Name
        System.out.println("Enter your name :");
        String name = console.nextLine();

        //Lower
        System.out.println(name.toLowerCase());

        //Upper
        System.out.println(name.toUpperCase());

        //Reverse
        StringBuilder reverseName = new StringBuilder(name);
        System.out.println(reverseName.reverse());

        //Math
        System.out.println("Enter your first integer: ");
        int numOne= Integer.parseInt(console.nextLine());

        System.out.println("Enter your second integer: ");
        int numTwo= Integer.parseInt(console.nextLine());

        //Addition +
        int add = (numOne + numTwo);
        System.out.printf("%d + %d = %d%n ",numOne, numTwo, add);

        //Subtraction -
        int sub = (numOne - numTwo);
        System.out.printf("%d - %d = %d%n",numOne, numTwo, sub);

        //Multiplication *
        int mult = (numOne * numTwo);
        System.out.printf("%d * %d = %d%n",numOne, numTwo, mult);

        //Division /
        int div = (numOne /numTwo);
        System.out.printf("%d / %d = %d%n",numOne, numTwo, div);

        //Square Roots
        // returns a double, make sure labeled as such
        double sqrt1 = Math.sqrt(numOne);
        System.out.printf("The square root of %d is %.2f.", numOne, sqrt1);

        //Power
        double power = Math.pow(numOne,numTwo);
        System.out.printf("The power of %d and %d is %.2f.", numOne, numTwo, power);

        //Logarithm
        double logar = Math.log(numOne);
        System.out.printf("The log of %d is : %.2f.", numOne, logar);

        //Math.abs
        //absolute value

        //Math.max()
        System.out.println(Math.max(4,88));
        //prints max of the two

        //Math.min()
        System.out.println(Math.min(4,88));
        //prints min of the two
    }
}
