package weekTen.abstractClasses.Inheritances;

import weekTen.abstractClasses.interfaces.User;

public class Customer extends User {
    private int loyaltyP;
    private String pastReservationDate;
    public Customer(){

    }
    public Customer(String name, Integer contactNumber, String email, String password,int loyaltyP,String pastReservationDate){
        super(name,contactNumber,email,password);
        this.loyaltyP = loyaltyP;
        this.pastReservationDate = pastReservationDate;
    }
    public int getLoyaltyP(){
        return loyaltyP;
    }
    public String getPastReservationDate(){
        return pastReservationDate;
    }
    public void setLoyaltyP(int loyaltyP){
        this.loyaltyP = loyaltyP;
    }
    public void setPastReservationDate(String pastReservationDate){
        this.pastReservationDate = pastReservationDate;
    }
    @Override
    public void display(){
        System.out.println("You're a Customer!");
    }
}
