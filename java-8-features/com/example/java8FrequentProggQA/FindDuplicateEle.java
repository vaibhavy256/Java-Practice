package com.example.java8FrequentProggQA;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateEle {
   public static void main(String[] args) {
      String input = "my name is vaibhav  yeotikar";
      List<String> map = (List)((Map)Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))).entrySet().stream().filter((x) -> {
         return (Long)x.getValue() > 1L;
      }).map(Entry::getKey).collect(Collectors.toList());
      List<String> uniqueElements = (List)((Map)Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))).entrySet().stream().filter((x) -> {
         return (Long)x.getValue() == 1L;
      }).map(Entry::getKey).collect(Collectors.toList());
      String nonRepeat = (String)((Entry)((LinkedHashMap)Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))).entrySet().stream().filter((x) -> {
         return (Long)x.getValue() == 1L;
      }).findFirst().get()).getKey();
      System.out.println(nonRepeat);
   }
}
