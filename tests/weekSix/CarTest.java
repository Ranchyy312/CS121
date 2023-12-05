package weekSix;

import org.junit.Test;

import static org.junit.Assert.*;

public class CarTest {
    //create an instance of your class
    Car Honda = new Car("Civic",2000);
    @Test
    public void getYear() {
        //assertEquals
        assertEquals(2000,Honda.getYear());
    }
    @Test
    public void testConstructor(){
        //assertNotNull
        Car Honda2 = new Car();
        assertNotNull(Honda2);
    }
    //assert
    @Test
    public void testisElectricCar(){
        Car Honda3 = new Car("Honda","S",1990,2500,false);
        assertFalse(Honda3.getElectric());
    }
    @Override
    public String toString(){
        return String.format("idk");
    }

}