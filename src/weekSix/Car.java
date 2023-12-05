package weekSix;
public class Car {
    //Member Variables / Instant Variables / Fields
    String Make, Model, VIN, Color;
    private int year;
    int miles;
    private boolean isElectric;

    //default constructor
    //Constructors
    Car() {
        this.year = 2000;
        this.Make = "Empty";
        this.Model = "Empty";
        this.VIN = "123456LKFOFKG43422";
        this.Color = "White";
    }
    Car(String make, int year) {
        this.Make = make;
        this.year = year;

    }
    Car(String make, String model, int year, int miles, boolean isElectric) {
        this.Make = make;
        this.Model = model;
        this.year = year;
        this.miles = miles;
        this.isElectric = isElectric;
    }

    //Setters and Getters
    //Setters (Mutator Method)
    public void setYears(int years) {
        this.year = years;
    }

    //Getters (Accessor Method)
    public int getYear() {
        return year;
    }

    public void setElectric(boolean isElectric){
        this.isElectric = isElectric;
    }
    public boolean getElectric() {
        return isElectric;
    }
}