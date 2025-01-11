import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsDemo {
    public static void main(String[] args) {
        List<String>integerList= Arrays.asList("Alice","Bob","John Doe","Alojiij");
        System.out.println(integerList.
                stream().
                filter(x->x.startsWith("A")).
                collect(Collectors.toList()));
        System.out.println(integerList.
                stream().
                map(name->name.toLowerCase())
                .collect(Collectors.joining(", ")));

        List<String>strs= Arrays.asList("hello","world","java","streams","collecting");
        System.out.println(strs.stream().
                collect(Collectors.groupingBy(String::length)));
        System.out.println(strs.stream().
                collect(Collectors.groupingBy(String::length,Collectors.joining(", "))));
        System.out.println(strs.stream().
                collect(Collectors.groupingBy(String::length,Collectors.counting())));

        String words="hello world hello and java so java is good";
        List<String>wordList= List.of(words.split(" "));
        System.out.println(wordList.stream().collect(Collectors.toMap(k->k, v->1, Integer::sum)));

    }
}
