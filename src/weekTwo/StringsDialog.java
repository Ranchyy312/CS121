package weekTwo;

import javax.swing.*;

public class StringsDialog {
    public static void main(String[] args){

        //JOptionPane
        String Fname = JOptionPane.showInputDialog("Enter your name:");
        JOptionPane.showMessageDialog(null,"You entered : "+ Fname);

        //int
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age:"));
        JOptionPane.showMessageDialog(null,"You entered: "+ age);

        //double
        double gpa = Double.parseDouble(JOptionPane.showInputDialog("Enter your GPA:"));
        JOptionPane.showMessageDialog(null,"You entered: "+ gpa);

        //System.out.printf("%s %n %d",Fname,age,gpa);
        String story = String.format("The story of %s%n age: %d%n gpa: %.2f%n"+ "stuff",Fname,age,gpa);
        JOptionPane.showMessageDialog(null, story);

        //Strings
        String name = "Robin";

        //.concat()
        name.concat("Tilford");
        System.out.println(name);
        //comes out as Robin because name was not "renamed"

        name = name.concat("Tilford");
        System.out.println(name);
        //this works because name was renamed

        //.length()
        System.out.println(name.length());
        // prints length of string

        //.charAt()
        System.out.println(name.charAt(4));
        // prints character in spec index cord // ie: 4 = n in [Robin]

        //.replace()
        System.out.println(name.replace("RobinTilford","Jacob"));
        // replaces whole string

        //.substring()
        System.out.println(name.substring(0));
        System.out.println(name.substring(0,1));
        // prints R
        System.out.println(name.substring(0,4));
        // print Robi
        // prints from beg index to end 0,4 or 0,1
    }
}
