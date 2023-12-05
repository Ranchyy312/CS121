package weekSixteen.jsonActivityTest;

import com.google.gson.Gson;
import java.io.FileWriter;
import java.io.IOException;

public class JSONWriter {
    public static void main(String[] args) {
        try {
            Student student = new Student("Jennifer Ghirardelli", 528285, "Math");

            Gson gson = new Gson();

            // convert Java object to json
            String jsonString = gson.toJson(student);

            // write Json string to file
            FileWriter filewriter = new FileWriter("studentWritingStuff.json");
            filewriter.write(jsonString);
            filewriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

