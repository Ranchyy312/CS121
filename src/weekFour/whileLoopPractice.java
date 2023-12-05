package weekFour;

import java.util.Scanner;

public class whileLoopPractice {
    public static void main(String [] args){
        //Instance of the Scanner Class
        Scanner console = new Scanner(System.in);
        //while(condiiton){//code}
        // do{ //code
        //} while(condition)
        //while(true ){
        int num = 0;

        /* while(num <= 5){
            System.out.println(" Number is : " + num);
            //increment num
            num++;
        }
        */

        do{
            //code
            System.out.println(" Number is : "+num);
            num++;
        }while(num<=5);
    }
}
