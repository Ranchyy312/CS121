package weekEleven;

public class RecursionInClass {
    public static void main(String[] args) {
        //Factorial
        //1. Base case
        //2. Recursive call + modification
        int num = 7;
        System.out.println("the factorial of 7 is "+factorial(num));
    }

    public static int factorial(int num){
        //1. Base case
        if(num == 0){
            return 1;
        }else{
            //2. Recursive call + modification
            return num * factorial(num-1);
        }
    }
}
