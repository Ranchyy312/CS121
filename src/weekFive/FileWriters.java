package weekFive;
import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileWriters {
    public static void main(String [] args) throws FileNotFoundException {
        //Instance opf File and PrintWriter class
        File outputFile = new File("myShoppingList.txt");
        PrintWriter output = new PrintWriter(outputFile);
        // Variables
        String item;
        String price;
        // Header of new file
        output.printf("%s %s \n", "Item", "Price");

        for (int i = 1; i <= 3; i++) {
            item = JOptionPane.showInputDialog(String.format("Enter Name of Item %d:", i));
            price = JOptionPane.showInputDialog("Enter Item Price:");
            output.printf("%s %s \n", item, price);
        }
        output.close();


    }
}
