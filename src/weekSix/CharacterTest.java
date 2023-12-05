package weekSix;

import java.util.Scanner;

public class CharacterTest {
    public static void main(String[] args) {
        //Scanner
        //Scanner keyboard = new Scanner(System.in);
        //Create instance of Characters
        Characters charcterOne = new Characters("Blaze", "FireHurricane");
        Characters charcterTwo = new Characters("Grandite", "RockHurricane");
        charcterOne.displayInfo();
        charcterTwo.displayInfo();
    }
}