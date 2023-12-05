package weekSix.overLoaded;

public class TestClass {
    public static void main(String[] args) {
        Class Zero = new Class();
        Class One = new Class("one");
        Class Two = new Class("two", "three","four");
        One.setOne("One");
        System.out.println(One.getOne());
        One.setOne("Two","Three");
        System.out.println(One.getOne());

    }
}