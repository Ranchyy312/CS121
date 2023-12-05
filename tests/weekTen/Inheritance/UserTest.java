package weekTen.Inheritance;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
   // Customer Bill = new Customer("Bill",1563,"bill@gmail.com","password",10,"1/23/23");
    public static void main(String[] args) {
        Customer Bill = new Customer("Bill",1563,"bill@gmail.com","password",10,"1/23/23");
        System.out.println(Bill.toString());

    }
    //Customer Bill = new Customer("Bill",1563,"bill@gmail.com","password",10,"1/23/23");
    @Test
    public void doStuff(){
        //System.out.println(Bill.toString());
    }

}