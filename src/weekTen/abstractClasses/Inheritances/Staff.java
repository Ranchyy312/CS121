package weekTen.abstractClasses.Inheritances;


import weekTen.abstractClasses.interfaces.User;

public class Staff extends User {
    private String role;
    private int tablesManaged;
    public Staff(){
    }

    public Staff(String name, int contactNumber, String email, String password, String role,int tablesManaged){
        super(name, contactNumber, email, password);
        this.role = role;
        this.tablesManaged = tablesManaged;
    }
    public String getRole(){
        return role;
    }
    public int getTablesManaged(){
        return tablesManaged;
    }
    public void setRole(String role){
        this.role = role;
    }
    public void setTablesManaged(int tablesManaged){
        this.tablesManaged = tablesManaged;
    }

    @Override
    public void display(){
        System.out.println("You're a Staff!");
    }
}
