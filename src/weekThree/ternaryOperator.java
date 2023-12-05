package weekThree;

public class ternaryOperator {
    public static void main(String[] args){
        boolean isSunny, isWarm;
        isSunny = true;
        isWarm = true;
        //Logic operators
        // && --> and
        // || --> or
        /*
        if(isSunny && isWarm){
            System.out.println("Let's get ice cream.");
        }
        if(isSunny || isWarm){
            System.out.println("Let's maybe get ice cream.");
        }
        */
        //condition ? exp1 : exp 2
        int num = 10;
        String result = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println("The number is : " + result);
    }
}
