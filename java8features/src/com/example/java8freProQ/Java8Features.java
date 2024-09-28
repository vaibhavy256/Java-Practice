package com.example.java8freProQ;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
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

      int[] numbers={5,9,8,11,2,21};

      Integer secondHighest=Arrays.stream(numbers).boxed()
              .sorted()
              .skip(1)
              .findFirst()
              .get();
      System.out.println(secondHighest);


   }
}
