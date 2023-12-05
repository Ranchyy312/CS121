package weekThree;

public class Conditonals {
    public static void main(String[] args) {
        int age;
        double gpa;
        char letterGrade;
        boolean csMajor, isStudent, isTeacher, isTeacherCsMajor;
        String name;
        age = 20;
        gpa = 3.0;
        name = "Joe";
        letterGrade = 'A';
        isStudent = false;
        csMajor = true;
        isTeacher = true;
        isTeacherCsMajor = true;

        if(age <= 21){
            System.out.println("You are 21 or younger.\n");
        }else{
            System.out.println("You are older than 21.\n");
        }

        if(gpa >= 4.0){
            System.out.println("You recieve an A.");
        }else if(gpa >= 3.6){
            System.out.println("You recieve an A -----");
        }else if(gpa >=2.7){
            System.out.println("You recieve a B");
        } else if(gpa >= 1.7){
            System.out.println("You recieve a C");
        }else{
            System.out.println("You recieve below a C");
        }

        //Realtional Operator
        // <, >, <=, >=, ==, !=
        //.equals() --> for strings

        if(csMajor == isStudent){
            System.out.println("This person is a student and a CS Major.");
        }else{
            if(isTeacher != isStudent){
                System.out.println("This is a teacher and may be a cs major.");
            }else if(isTeacher == isTeacherCsMajor){
                System.out.println("This is a teacher and a cs major.");
            }
            System.out.println("This person is either not a student or a CS Major.");
        }
        name = "joseph";
        String name2 = "Joseph";

        //! = not
        if(!name.equals(name2)){
            System.out.printf("The name %s equal to name2 %s",name,name2);
        }else{
            System.out.println("The names are not equal");
        }

        /* if (conditon) {
            //executes if condition is true

        if (condition) {
            //executes if condition is true

        }else{
            //executes if condition is false

        if(condition1) {
            //executes if condition1 is true
        */
    }
}