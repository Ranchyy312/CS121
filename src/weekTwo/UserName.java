package weekTwo;

import javax.swing.*;
import java.awt.datatransfer.StringSelection;

public class UserName {
    public static void main(String[] args){
        //Ask full name
        String name = JOptionPane.showInputDialog("Enter your full name:");
        JOptionPane.showMessageDialog(null,String.format("Your name is %s%n",name));

        //Upper
        String upper = String.format(name.toUpperCase());
        JOptionPane.showMessageDialog(null,String.format("Your name is %s , your name capitalized is %s%n",name,upper));

        //Lower
        String lower = String.format(name.toLowerCase());
        JOptionPane.showMessageDialog(null,String.format("Your name is %s , your name lowercased is %s%n",name,lower));

        //Reverse
        StringBuilder reverseName = new StringBuilder(name);
        String revName = String.valueOf(reverseName.reverse());
        JOptionPane.showMessageDialog(null,String.format("Your name is %s , your name reveresed is %s%n",name,revName));
    }
}
