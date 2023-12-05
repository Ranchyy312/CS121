package weekThree;

import javax.swing.*;

public class SwitchActivity {
    public static void main(String[] args){
        String planet = JOptionPane.showInputDialog(null, "Enter a planet: ");
        String planetInfo = "";
        switch (planet) {
            case "Mercury":
                planetInfo = "This is the first planet from the sun. It is the smallest planet in our solar system.";
                break;
            case "Venus":
                planetInfo = "This is the second planet from the sun. It is the closest planet in size and mass to Earth.";
                break;
            case "Earth":
                planetInfo = "This is the third planet from the sun. This is where we live and teh only known planet to sustain life.";
                break;
            case "Mars":
                planetInfo = "This is the fourth planet from the sun. This is known as the red planet.";
                break;
            case "Jupiter":
                planetInfo = "This is the fifth planet from the sun. This planet is a gas giant, the 'eye' on the surface is a persistent storm.";
                break;
            case "Saturn":
                planetInfo = "This is the sixth planet from the sun. This planet is known for its rings surrounding it.";
                break;
            case "Uranus":
                planetInfo = "This is the seventh planet from the sun. This was originally thought to be a comet or a star due to its coloration.";
                break;
            case "Neptune":
                planetInfo = "This is the eighth planet from the sun. This is now the farthest planet from the sun.";
                break;
            case "Pluto":
                planetInfo = "This is now considered a dwarf planet. This was formally the ninth planet from the sun.";
                break;

            default:
                planetInfo = "There is no info for the planet you entered in this program.";
                break;
        }
        JOptionPane.showMessageDialog(null,planetInfo);
    }
}
