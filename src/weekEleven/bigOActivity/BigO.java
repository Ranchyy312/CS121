package weekEleven.bigOActivity;

public class BigO {

    //Print parameter value once
    public static void printOnce(int n) {
        System.out.println("");
        System.out.println("Print Phrase Once:");
            System.out.println(n);
        }

    //Print parameter value n number of times
    public static void printNTimes(int n) {
        System.out.println("");
        System.out.println("Print N Number of Times:");
        for (int i = 0; i < n; i++) {
            System.out.println("This is a phrase printed " + (i+1) + " times!");
        }
    }

    //Print parameter value n^2 number of times
    public static void printNSquaredTimes(int n){
        System.out.println("");
        System.out.println("Print N Number^2 of Times:");
        for(int i = 0; i<=n; i++){
            for(int j =0; j<=i; j++) {
                System.out.println("This is a phrase printed, i:" + (i + 1)+ " times! j:" +(j+1));
            }
        }
    }


}
