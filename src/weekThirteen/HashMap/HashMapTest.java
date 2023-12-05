package weekThirteen.HashMap;

import weekThirteen.HashMap.HashMapClass;

public class HashMapTest {
    public static void main(String[] args) {
        HashMapClass test = new HashMapClass();

        test.addKeyPair(1,"Hello");
        test.addKeyPair(2,"World");
        test.addKeyPair(3,"!");

        test.displayKeyPair();

        System.out.println(test.getPair(2));
        test.removeKeyPair(2);
        System.out.println(test.getPair(2));

        test.displayKeyPair();
    }
}
