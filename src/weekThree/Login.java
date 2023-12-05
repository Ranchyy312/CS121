package weekThree;

import javax.swing.*;

public class Login {
    public static void main(String[] args) {
        String userName = "user";
        String passWord = "password";

        String enteredName = JOptionPane.showInputDialog("Enter your User Name: ");
        String enteredPass = JOptionPane.showInputDialog("Enter your Password: ");

        //both right
        if (enteredName.equals(userName) && enteredPass.equals(passWord)) {
            JOptionPane.showMessageDialog(null, "Welcome to CS121");
        }
        //Username wrong
        if (!enteredName.equals(userName)) {
            JOptionPane.showMessageDialog(null, "Your User Name was wrong");
        }
        //password wrong
        if (!enteredPass.equals(passWord)) {
            JOptionPane.showMessageDialog(null, "Your Password was wrong");
        }
        //Neither are right
        if (!enteredName.equals(userName) && !enteredPass.equals(passWord)) {
            JOptionPane.showMessageDialog(null, "Neither the User Name nor the Password are correct.");
        }
    }
}