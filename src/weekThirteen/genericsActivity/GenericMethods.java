package weekThirteen.genericsActivity;
import java.util.ArrayList;

public class GenericMethods {

    public <E> void pArray(ArrayList<E> arrayList){
        for(E element : arrayList){
            System.out.printf("%s ", element);
        }
        System.out.println();
    }
}
