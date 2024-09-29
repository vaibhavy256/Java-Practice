package com.example.java8freProQ;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8Features {
   public static void main(String[] args) {
      String input = "my name is vaibhav yeotikar";
//      Map<String, Long> map = (Map)Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//      System.out.println(map);

      String firstNonRepeatElement=Arrays.stream(input.split(""))
              .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
              .entrySet()
              .stream()
              .filter(x->x.getValue()==1)
              .findFirst().get().getKey();
      System.out.println(firstNonRepeatElement);

      //Find Second largest number
      int[] numbers={5,9,8,11,2,21};

      Integer secondHighest=Arrays.stream(numbers).boxed()
              .sorted(Comparator.reverseOrder())
              .skip(1)
              .findFirst()
              .get();
      System.out.println(secondHighest);

      //find the longest string from given array

      String[] arrays={"java","spring","microservices"};
     String longestString= Arrays.stream(arrays)
              .reduce((word1,word2)->word1.length()>word2.length()?word1:word2)
              .get();
     //   System.out.println(longestString);

      //program to find element who starts with particular char

      List<String> stringLists=Arrays.stream(numbers)
              .boxed()
              .map(s->s + "")
              .filter(s->s.startsWith("2"))
              .collect(Collectors.toList());
      System.out.println(stringLists);
   }
}
