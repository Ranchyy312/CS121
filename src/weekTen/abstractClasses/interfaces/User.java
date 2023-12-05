package weekTen.abstractClasses.interfaces;

public abstract class User
{
    //name,table,email
    protected String name;
    protected Integer contactNumber;
    protected String email;
    protected String password;

    //constructor
    public User(){

    }
    public User(String name, Integer contactNumber, String email, String password){
     this.name = name;
     this.contactNumber = contactNumber;
     this.email = email;
     this.password =password;
    }
    //getters and setters
    public String getName(){
        return name;
    }
    public Integer getContactNumber(){
        return contactNumber;
    }
    public String getEmail(){
        return email;
    }
    public String getPassword(){
        return password;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setContactNumber(Integer contactNumber){
        this.contactNumber = contactNumber;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setPassword(String password){
        this.password = password;
    }


    public abstract void display();
}
