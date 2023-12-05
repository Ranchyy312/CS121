package weekTwo;

import javax.swing.*;

public class UserMath {
    public static void main(String[] args) {
        int numOne = Integer.parseInt(JOptionPane.showInputDialog("Enter your first Integer."));
        int numTwo = Integer.parseInt(JOptionPane.showInputDialog("Enter your second Integer."));

        //Addition
        int add = (numOne + numTwo);
        String prod1 = String.format("%d + %d = %d%n", numOne, numTwo, add);
        JOptionPane.showMessageDialog(null, prod1);

        //Subtraction
        int sub = (numOne - numTwo);
        String prod2 = String.format("%d - %d = %d%n", numOne, numTwo, sub);
        JOptionPane.showMessageDialog(null, prod2);

        //Multiplication
        int mult = (numOne * numTwo);
        String prod3 = String.format("%d * %d = %d%n", numOne, numTwo, mult);
        JOptionPane.showMessageDialog(null, prod3);

        //Divison
        int div = (numOne / numTwo);
        String prod4 = String.format("%d / %d = %d%n", numOne, numTwo, div);
        JOptionPane.showMessageDialog(null, prod4);

        //Square Root
        double sqrt1 = Math.sqrt(numOne);
        String prod5 = String.format("The square root of %d is %.2f.", numOne, sqrt1);
        JOptionPane.showMessageDialog(null, prod5);

        double sqrt2 = Math.sqrt(numTwo);
        String prod6 = String.format("The square root of %d is %.2f.", numTwo, sqrt2);
        JOptionPane.showMessageDialog(null, prod6);

        //Power
        double power = Math.pow(numOne,numTwo);
        String prod7 = String.format("The power of %d and %d is %.2f.", numOne, numTwo, power);
        JOptionPane.showMessageDialog(null, prod7);

        //Log
        double logar1 = Math.log(numOne);
        String prod8 = String.format("The log of %d is : %.2f.", numOne, logar1);
        JOptionPane.showMessageDialog(null, prod8);

        double logar2 = Math.log(numTwo);
        String prod9 = String.format("The log of %d is : %.2f.", numTwo, logar2);
        JOptionPane.showMessageDialog(null, prod9);
    }
}
