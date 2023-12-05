package weekNine;

public class Restaurant {
    private String table;
    private String menu;
    private double reservationTime;
    private int customers;

    // static variable
    private static int instanceCount = 0;

    //default constructor
    public Restaurant(){
        instanceCount ++;
    }

    //paramitireized constructir
    public Restaurant(String table, String menu, double reservationTime, int customers){
        this.table = table;
        this.menu = menu;
        this.reservationTime = reservationTime;
        this.customers = customers;
        // increments the static variable
        instanceCount ++;
    }

    //Setters
    public void setTable(String table){
        this.table = table;
    }
    public void setMenu(String menu){
        this.menu = menu;
    }
    public void setReservationTime(double reservationTime){
        this.reservationTime = reservationTime;
    }
    public void setCustomers(int customers){
        this.customers = customers;
    }

    //Getters
    public String getTable(){
        return table;
    }
    public String getMenu(){
        return menu;
    }
    public double getReservationTime(){
        return reservationTime;
    }
    public int getCustomers(){
        return customers;
    }

    //Static method
    public static int getInstanceCount(){

        return instanceCount;
    }
}
