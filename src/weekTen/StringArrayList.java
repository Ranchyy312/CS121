package weekTen;

import java.util.ArrayList;

public class StringArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();


        //add strings to the list
        names.add(0,"Jeff");
        names.add(1,"Bill");
        names.add(2,"Bob");

        //remove strings from the list
        names.remove(2);

        //get the size of the list
        System.out.println(names.size());

        //get an element by index
        System.out.println(names.get(0));

        //display the list using the for each loop
        for(String name : names){
            System.out.println(name);
        }

        //display the list use the for loop
        for(int i = 0; i < names.size(); i++){
            System.out.println(names.get(i));
        }
        //write a test class and run all the methods
    }
}
