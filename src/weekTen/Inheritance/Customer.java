package weekTen.Inheritance;

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
    public String toString(){
        return super.toString()+ String.format(", loyalty points: %d, past reservation date: %s",loyaltyP,pastReservationDate);
    }

}
