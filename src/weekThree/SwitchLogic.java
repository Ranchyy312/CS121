package weekThree;

import javax.swing.*;

public class SwitchLogic {
    public static void main(String[] args) {
        //Switch Statements VS Switch Exp

        //Switch Statements
        String planet = JOptionPane.showInputDialog(null, "Enter a planet: ");
        String planetInfo = "";
        switch (planet) {
            case "Earth":
                planetInfo = "Where we live now.";
                break;
            case "Mars":
                planetInfo = "This is known as the red planet.";
                break;
            case "Venus":
                planetInfo = "You entered in Venus.";
                break;
            default:
                planetInfo = "There is no info for the planet you entered in this program.";
                break;
        }
        JOptionPane.showMessageDialog(null,planetInfo);

//Switch Expression
        String planetExpress = JOptionPane.showInputDialog("Enter a planet: ");
        String planetInfoExpress = switch(planetExpress){
            case "Earth" -> "This is where you live.";
            case "Mars" -> "This is known as the red planet.";
            case "Venus" -> "You entered Venus.";
            default -> "The planet you entred has no info in this program.";
        };
    }
}
