package weekEleven;

public class Recursion {
    public static int countDown(int num) {
        //1. Base case
        if (num == 0) {
            System.out.println("Blast Off!");
            return 0;
        } else {
            //2. Recursive call + modification
            System.out.println(num);
            return countDown(num -1);
        }
    }

    public static char alphaBackwards(char letter){
        if(letter == 'a'){
            System.out.println("Its A!");
            return 'a';
        }else {
            System.out.println(letter);
            return alphaBackwards((char) (letter - 1));
        }
    }

}
