package weekThirteen.genericsActivity;

import java.util.ArrayList;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

        GenericMethods generic = new GenericMethods();

        ArrayList<Integer> intArray = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        ArrayList<Double> doubleArray = new ArrayList<>(Arrays.asList(1.2,2.2,3.3,4.4,5.5));
        ArrayList<Character> charArray = new ArrayList<>(Arrays.asList('A','B','C','D','E'));
        ArrayList<String> stringArray = new ArrayList<>(Arrays.asList("Alpha","Beta","Charlie","Delta","Echo"));

        System.out.print("Int Array : ");
        generic.pArray(intArray);

        System.out.print("Double Array : ");
        generic.pArray(doubleArray);

        System.out.print("Char Array : ");
        generic.pArray(charArray);

        System.out.print("String Array : ");
        generic.pArray(stringArray);
    }
}
