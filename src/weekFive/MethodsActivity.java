package weekFive;
import java.util.Scanner;
public class MethodsActivity {
    //start scanner before functions
    static Scanner console = new Scanner(System.in);

    //Length function returns l
    public static double getLength(){
        System.out.println("Enter the length of a rectangle:");
        double l = Double.parseDouble(console.nextLine());
        return l;
    }
    //Width function returns w
    public static double getWidth(){
        System.out.println("Enter the width of a rectangle:");
        double w = Double.parseDouble(console.nextLine());
        return w;
    }
    //Area function returns a
    public static double getArea(double l, double w){
        double a = (l * w);
        return a;
    }
    //Display function prints l,w,a
    public static void displayData(double l,double w, double a){
        System.out.println("Rectangle Length: "+l);
        System.out.println("Rectangle Width: "+w);
        System.out.println("Rectangle Area: "+a);
    }

    // call functions and insert parameters
    public static void main(String[] args) {
        double l;
        double w;
        double a;

        l = getLength();
        w = getWidth();
        a = getArea(l,w);
        displayData(l,w,a);
        console.close();
        //redundancy important? what is static? this works but why?
    }
}
