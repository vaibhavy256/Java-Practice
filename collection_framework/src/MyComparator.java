import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MyComparator  {

    public static void main(String[] args) {
        List<Integer> list1=new ArrayList<>();
        list1.add(45);
        list1.add(34);
        list1.add(76);
        list1.add(23);
        list1.sort(new IntegerComparator());
        System.out.println(list1);

        List<String>words= Arrays.asList("monday","thursday","friday","sunday");
        words.sort(new StringLengthComparator());
        System.out.println(words);
    }

}
class IntegerComparator implements Comparator <Integer>
{
    public int compare(Integer o1,Integer o2){
        return o2-o1;
    }
}

class StringLengthComparator implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        return o1.length()-o2.length();
    }
}


