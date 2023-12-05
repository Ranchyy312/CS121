package weekTwo;
import java.util.Scanner;
public class IntegerDiv {
    public static void main(String[] args) {
        //Cons\sole input
        //Scanner class

        Scanner keyboard = new Scanner(System.in);

        System.out.println("What is your name?");
        String firstName = keyboard.nextLine();

        System.out.println("What is your age?");
        int age = Integer.parseInt(keyboard.nextLine());

        System.out.println("What is your GPA?");
        double gpa = Double.parseDouble(keyboard.nextLine());

        System.out.println(firstName);
        System.out.println(age);
        System.out.println(gpa);


        int numOne = 1;
        int numTwo = 4;
        double results = (double)numOne/numTwo;
        System.out.println(results);

        //passing a double to another double = rounds off to whole
        // ie: 1.3875339 = 1.0 or 0.45 = 0.0

        // changing int to float on numOne or numTwo causes it to stay the same
        // ie: 0.25 would come out as 0.25

        double result = (double)(numOne/numTwo);
        System.out.println(result);
        // double == float // works the same in this instance


    }
}
