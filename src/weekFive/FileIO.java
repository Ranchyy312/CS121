package weekFive;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileIO {
    public static void main(String []args) throws FileNotFoundException {

        //Instance of File Class
        File file = new File("myShoppingList.txt"); //Relative Path (us when file is within the project)
        //Or
        //Absolute Path (used when file is outside of project)
        //File file2 = new File("C:\\Users\\bltlc\\OneDrive - Ball State University\\BSU Fall 2023\\CS121\\Projects\\CS121\\courses.txt");
        try {
            //Read file
            Scanner scanner = new Scanner(file);
            String header = scanner.nextLine();

            while (scanner.hasNextLine()) {
                /*String Line = scanner.nextLine();
                System.out.println(Line);*/

                String item =  scanner.next();
                String price = scanner.next();
                System.out.printf("%-7s %-7s\n", item, price);
            }
        }catch(FileNotFoundException e){
            // e.printStackTrace();
            System.err.println("FILE NOT FOUND");
        }
    }
}
