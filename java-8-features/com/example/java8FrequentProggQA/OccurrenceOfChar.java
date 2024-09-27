package com.example.java8FrequentProggQA;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccurrenceOfChar {
   public static void main(String[] args) {
      String input = "my name is vaibhav yeotikar";
      Map<String, Long> map = (Map)Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
      System.out.println(map);
   }
}
