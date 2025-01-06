import java.util.HashMap;
import java.util.Map;

public class HashMapImpl {
    public static void main(String[] args) {
        HashMap<Integer,String>map=new HashMap<>();
        map.put(1,"vaibhav");
        map.put(2,"yeotikar");
        map.put(3,"sdfsdf");

        for (Map.Entry<Integer,String> entry: map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
