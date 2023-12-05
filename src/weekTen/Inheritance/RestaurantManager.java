package weekTen.Inheritance;

public class RestaurantManager extends User{
    private int ordersProcessing;
    private int tablesReserved;
    public RestaurantManager(){

    }

    public RestaurantManager(String name, Integer contactNumber, String email, String password, int ordersProcessing, int tablesReserved){
        super(name,contactNumber,email,password);
        this.ordersProcessing = ordersProcessing;
        this.tablesReserved = tablesReserved;
    }
    public int getOrdersProcessing(){
        return ordersProcessing;
    }
    public int getTablesReserved(){
        return tablesReserved;
    }
    public void setOrdersProcessing(int ordersProcessing){
        this.ordersProcessing = ordersProcessing;
    }
    public void setTablesReserved(int tablesReserved){
        this.tablesReserved = tablesReserved;
    }

    @Override
    public String toString(){
        return super.toString()+ String.format(", orders processing: %d, tables reserved: %d",ordersProcessing,tablesReserved);
    }
}
