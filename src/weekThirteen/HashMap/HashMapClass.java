package weekThirteen.HashMap;
import java.util.HashMap;

public class HashMapClass {
    private HashMap<Integer, String> hash = new HashMap();

    public void addKeyPair(Integer key, String pair){
        hash.put(key,pair);
    }

    public void removeKeyPair(int key){
        hash.remove(key);
    }

    public Object getPair(int key){
        Object pair;
        if (hash.containsKey(key)){
            pair = hash.get(key);
        }else{
            pair= "Pair not found.";
        }
        return pair;
    }

    public void displayKeyPair(){
        hash.forEach((key,pair) ->{
            System.out.printf("Key: %d | Pair: %s\n",key,pair);
        });
    }

}
