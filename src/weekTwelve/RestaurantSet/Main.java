package weekTwelve;
import java.util.Set;
public class Main {
    public static void main(String[] args) {
        RestaurantSet set = new RestaurantSet();
        Set<Integer>tableSet = set.addTables();
        set.displayTables(tableSet);
    }
}
