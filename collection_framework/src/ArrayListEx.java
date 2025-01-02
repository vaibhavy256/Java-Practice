import java.util.*;

public class ArrayListEx {
    public static void main(String[] args) {
        List<String> list1=new ArrayList<>();
        System.out.println(list1);

        List<String>list2=Arrays.asList("Monday","Tuesday","Thursday");
        list2.set(2,"wednesday");
        System.out.println(list2);

        String[] strings= {"asadsa","djfd","sjhsjh"};
        List<String>list3=Arrays.asList(strings);
        System.out.println(list3);
    }
}
