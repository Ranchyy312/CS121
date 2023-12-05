package weekNine;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.*;

public class RestaurantTest {
    //restaurant tacoBell = new restaurant();
    //private Restaurant tacoBell;
    //private Restaurant mcDonalds;

    @BeforeEach
    public void setUp(){
        Restaurant tacoBell = new Restaurant("Thirty","taco, burrito, crunchwrap",4.30,3);
        Restaurant mcDonalds = new Restaurant("TwentySeven","Big Mac, nuggets, ice cream", 5.20,5);
    }

    @Test
    public void testInstantCount(){
        Restaurant tacoBell = new Restaurant("Thirty","taco, burrito, crunchwrap",4.30,3);
        Restaurant mcDonalds = new Restaurant("TwentySeven","Big Mac, nuggets, ice cream", 5.20,5);
        assertEquals(2, Restaurant.getInstanceCount());
    }
}