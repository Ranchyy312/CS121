package weekEleven;

import static weekEleven.Recursion.countDown;
import static weekEleven.Recursion.alphaBackwards;

public class RecursionTest {
    public static void main(String[] args) {

        int num = 5;
        char letter = 'z';


        System.out.println(countDown(num));
        System.out.println(alphaBackwards(letter));

    }
}
