package com.example.mapflatmap;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MapReduceE {
   public static void main(String[] args) {
      List<Integer> numbers = Arrays.asList(1, 9, 6, 5, 7);
      List<String> strings = Arrays.asList("java", "hibernate", "spring");
      int sum1 = numbers.stream().mapToInt((i) -> {
         return i;
      }).sum();
      int sum2 = (Integer)numbers.stream().reduce(0, (a, b) -> {
         return a + b;
      });
      Optional<Integer> sum3 = numbers.stream().reduce(Integer::max);
      String words = (String)strings.stream().reduce((word1, word2) -> {
         return word1.length() > word2.length() ? word1 : word2;
      }).get();
      double avgSalary = EmployeeDatabase.getEmployees().stream().filter((employee) -> {
         return employee.getGrade().equalsIgnoreCase("B");
      }).map((employee) -> {
         return employee.getSalary();
      }).mapToDouble((i) -> {
         return (double)i;
      }).average().getAsDouble();
      System.out.println(avgSalary);
   }
}
