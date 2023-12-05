package weekSixteen.jsonActivity;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Student {
    public static void main(String[] args) {
        try{
            Gson gson = new Gson();

            BufferedReader reader = new BufferedReader(new FileReader("students.json"));
            Student student = gson.fromJson(reader, Student.class);
           // System.out.printf(student.getName());
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
