package projectOne;
import java.util.Random;
import java.util.Scanner;

public class CharacterBattle {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int total1 =0;
        int total2 =0;

        System.out.println("Enter an odd number of rounds : ");
        int rounds = Integer.parseInt(console.nextLine());

        for (int r = 1; r <= rounds; r++) {

            String CharacterName1;
            int hitPoints1;
            String moveName1;
            int movePower1;
            int attackSpeed1;

            String CharacterName2;
            int hitPoints2;
            String moveName2;
            int movePower2;
            int attackSpeed2;

            //start of each round
            System.out.println("Round : " + r);

            //Start player 1

            System.out.println("-------------:Player 1:--------------");
            System.out.println("Enter character name : ");
            CharacterName1 = console.nextLine();

            System.out.println("Enter hit points for the character : ");
            hitPoints1 = Integer.parseInt(console.nextLine());

            System.out.println("Enter a move name : ");
            moveName1 = console.nextLine();

            System.out.println("Enter the power for the move : ");
            movePower1 = Integer.parseInt(console.nextLine());

            System.out.println("Enter the attack speed of the move : ");
            attackSpeed1 = Integer.parseInt(console.nextLine());

            //Start player 2

            System.out.println("-------------:Player 2:--------------");
            System.out.println("Enter character name : ");
            CharacterName2 = console.nextLine();

            System.out.println("Enter Hit Points for the character : ");
            hitPoints2 = Integer.parseInt(console.nextLine());

            System.out.println("Enter a move name : ");
            moveName2 = console.nextLine();

            System.out.println("Enter the power for the move : ");
            movePower2 = Integer.parseInt(console.nextLine());

            System.out.println("Enter the attack speed of the move : ");
            attackSpeed2 = Integer.parseInt(console.nextLine());

            while(hitPoints1 > 0 && hitPoints2 > 0) {
                if (attackSpeed1 > attackSpeed2) {
                    //player 1 goes first
                    hitPoints2 -= movePower1;
                    if (hitPoints2 < 0) {
                        System.out.println("Player 1: " + CharacterName1 + " wins round " + r + "!");
                        total1++;
                    }
                    //player 2 goes second
                    hitPoints1 = -movePower2;
                    if (hitPoints1 < 0) {
                        System.out.println("Player 2: " + CharacterName1 + " wins round " + r + "!");
                        total2++;
                    }
                } else if (attackSpeed2 > attackSpeed1) {
                    //player 2 goes first
                    hitPoints1 -= movePower2;
                    if (hitPoints1 < 0) {
                        System.out.println("Player 2: " + CharacterName1 + " wins round " + r + "!");
                        total2++;
                    }
                    //player 1 goes second
                    hitPoints2 -= movePower1;
                    if (hitPoints2 < 0) {
                        System.out.println("Player 1: " + CharacterName1 + " wins round " + r + "!");
                        total1++;
                    }
                } else {
                    Random rand = new Random();
                    int num = rand.nextInt(0, 1);
                    if(num == 0){
                        //acting as player 1 goes first
                        hitPoints2 -= movePower1;
                        if (hitPoints2 < 0) {
                            System.out.println("Player 1: " + CharacterName1 + " wins round " + r + "!");
                            total1++;
                        }
                        hitPoints1 = -movePower2;
                        if (hitPoints1 < 0) {
                            System.out.println("Player 2: " + CharacterName1 + " wins round " + r + "!");
                            total2++;
                        }
                    }else{
                        //acting as player 2 goes first
                        hitPoints1 -= movePower2;
                        if (hitPoints1 < 0) {
                            System.out.println("Player 2: " + CharacterName1 + " wins round " + r + "!");
                            total2++;
                        }
                        if (hitPoints2 < 0) {
                            System.out.println("Player 1: " + CharacterName1 + " wins round " + r + "!");
                            total1++;
                        }
                    }
                }
            }
            System.out.println("Wins:");
            System.out.println("Player 1 Wins: "+total1);
            System.out.println("Player 2 Wins: "+total2);
        }
        System.out.println("Final Scores: ");
        System.out.println("Player 1 Wins: "+total1);
        System.out.println("Player 2 Wins: "+total2);
        if(total1 > total2){
            System.out.println("Player 1 wins the game!");
        }else{
            System.out.println("Player 2 wins the game!");
        }
    }
}