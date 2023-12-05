package weekSix.classActivity;
public class SandwichClass {
    String bread, cheese, topping;
    private String meats;
    private int numSandwich;

    SandwichClass(String bread, String cheese, String topping) {
        this.bread = bread;
        this.cheese = cheese;
        this.topping = topping;
    }
    //private setters
    public void setMeats(String meats){
        this.meats = meats;
    }
    public void setNumSandwich(int numSandwich){
        this.numSandwich = numSandwich;
    }

    //private getters
    public String getMeats(){
        return meats;
    }
    public int getNumSandwich(){
        return numSandwich;
    }
    //display method
    public void displayInfo(){
        System.out.printf("Your sandwich has %s bread and %s cheese, with %s as a topping and %s as a meat. You made %d sandwiches.", bread,cheese,topping,meats,numSandwich);
    }
}