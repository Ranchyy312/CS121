package weekNine;

public class ArrayTest {
    public static void main(String[] args) {
        // declare an array
        String name1 = "Lizzi";
        String name2 = "Bob";

        //intialize array
        //option 1
        String [] name = new String [3];
        //number in brackets is a fixed size of the array

        //option 2
        int [] years;
        years = new int[5];

        float [] pay = new float [3];

        //using final
        final int MAXCAPACITY = 30;
        int [] classRoomSize = new int[MAXCAPACITY];

        //process the array
        String [] names = {"Libby","Jacob","Jessica","John"};
        System.out.println(names[0]);
        for(int i = 0; i < names.length; i++){
            System.out.println("The names in the names array is: # " + (i+1) + ""+ names[i]);
        }
        // years[]
        years[1]++; //post
        ++years[1]; //pre

        if(names[1].length() < names[3].length()){}

    }
}
