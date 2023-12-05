package weekOne;

public class Collins {
    public static void main(String[] args) {
        int age;
        double gpa;
        char letterGrade;
        boolean csMajor;
        String name;

        age = 20;
        gpa = 3.0;
        name = "Joe";
        letterGrade = 'A';
        csMajor = true;

        String favoriteColor = "Sage";

        System.out.printf("My name is %s. ", name);
        System.out.printf("I am %d years old. ", age);
        System.out.printf("My gpa is %.2f. ", gpa);
        System.out.printf("You are a cs Major %b%n. ", csMajor);
        System.out.printf("My grade is %c. ", letterGrade);
        System.out.printf("My favorite color is %s.", favoriteColor);

    }
}
