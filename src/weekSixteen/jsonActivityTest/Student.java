package weekSixteen.jsonActivityTest;

public class Student {
    private String name;
    private int id;
    private String major;
    // Constructor
    public Student(String name, int id, String major){
        this.name = name;
        this.id = id;
        this.major = major;

    }
    /* --------------------- SETTERS -------------------*/
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public String getMajor(){
        return major;
    }

    /* --------------------- GETTERS -------------------*/
    public void setName(String name){
        this.name = name;
    }
    public void setId(int id){
        this.id= id;
    }
    public void setMajor(String major){
        this.major = major;
    }
}
