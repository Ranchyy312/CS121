package weekSix.overLoaded;

public class Class {
    // 4 variables
    private String one;
    String two, three, four;

    //3 overload constructors
    Class(){
        this.one = "one";
        this.two = "two";
        this.three = "three";
        this.four = "four";
    }

    Class(String one){
        this.one = one;
    }

    Class(String two, String three, String four){
        this.two = two;
        this.three = three;
        this.four = four;
    }

    //Setter
    public void setOne(String One){
        this.one = One;
    }
    //Getter
    public String getOne(){
        return one;
    }
    //Overloaded Method
    public void setOne(String Two,String Three){
        this.two = Two;
        this.three = Three;
    }
}
