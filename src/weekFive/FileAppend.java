package weekFive;

import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileAppend {
    public static void main(String [] args) throws IOException {
        try{
            //instance of our FileWriter Clas and PrintWriter class
            FileWriter filewriter = new FileWriter("myShoppingList.txt", true);
            PrintWriter output = new PrintWriter(filewriter);
            String item = JOptionPane.showInputDialog("Enter Name of Item :");
            String price = JOptionPane.showInputDialog("Enter Item Price :");
            output.printf("%n%s %s",item,price);

            //Closes out of PrintWriter and FileWriter class
            filewriter.close();
            output.close();

        }catch(FileNotFoundException e){
            System.err.printf("File Issue");

        }
    }
}
