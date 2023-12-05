package weekFive;

import javax.swing.*;

public class Budget {
    public static void main(String [] args){
        // Initialize variables
        double amountSpent = 0;
        double budget = Double.parseDouble(JOptionPane.showInputDialog("Enter Monthly Budget: "));
        boolean sameMonth = true;

        //Main loop for Month
        while(sameMonth){
            String choice = JOptionPane.showInputDialog("Enter Expense or 'q' if month has ended: ");
            // Check for quit
            if(choice.toLowerCase().equals("q")){
                double diff = budget - amountSpent;
                //Check under or over
                if(diff >= 0 ) {
                    JOptionPane.showMessageDialog(null,String.format("Congrats you are %.2f dollars under budget!",diff));
                }else{
                    diff = diff * -1;
                    JOptionPane.showMessageDialog(null,String.format("Oops you are %.2f dollars over budget!",diff));
                }
                sameMonth = false;

            }else{
                //Adding expenses
             double expense = Double.parseDouble(choice);
             amountSpent = amountSpent + expense;
            }
        }
    }
}
