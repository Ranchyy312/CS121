package weekSix;

public class Characters {
    //Private
    //Public
    //private-package "default"
    //protected

    //Instance Variables / fields
    private String name, moveName;
    private int movePoints, hitpoints;

    //Constructors
    //default --> new Charcters()
    //parameterized contructor
    Characters(String Name,String moveName){
        this.name = Name;
        this.moveName = moveName;
    }

    //setters and getters
    //Setters
    public void setName(String name){
        this.name = name;
    }
    public void setMoveName(String moveName){
        this.moveName = moveName;
    }
    public void setMovePoints(int movePoints){
        this.movePoints = movePoints;
    }
    public void setHitpoints(int hitpoints){
        this.hitpoints = hitpoints;
    }

    //Getters
    public String getName(){
        return name;
    }
    public String getMoveName(){
        return moveName;
    }
    public int getMovePoints(){
        return movePoints;
    }
    public int getHitpoints(){
        return hitpoints;
    }


    // display method
    public void displayInfo(){
        System.out.printf("This is the character's name : %s%n This is the character's move name : %s%n");
    }
}
