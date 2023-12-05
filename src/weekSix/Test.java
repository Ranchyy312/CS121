package weekSix;
public class Test {
    public static void main(String[] args) {
        Car Tesla = new Car("Tesla","s",2022,1000,true);
        System.out.println(Tesla.getYear());
        Car Honda = new Car();
        Tesla.setYears(2023);
        System.out.println(Tesla.getYear());
        System.out.println(Tesla.Color);
    }
}