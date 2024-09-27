package com.example.streamapi;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.stream.Stream;

public class SortMapDemo {
   public static void main(String[] args) {
      Map<String, Integer> map = new HashMap();
      map.put("eight", 8);
      map.put("two", 2);
      map.put("nine", 9);
      map.put("four", 4);
      Map<Employee, Integer> empMap = new TreeMap((o1, o2) -> {
         return (int)(o2.getSalary() - o1.getSalary());
      });
      empMap.put(new Employee(76, "vaibhav", "IT", 500000L), 20);
      empMap.put(new Employee(96, "vaibhav y", "FINANCE", 400000L), 40);
      empMap.put(new Employee(65, "abc", "HR", 800000L), 60);
      empMap.put(new Employee(46, "xxyas", "HR", 700000L), 80);
      System.out.println(empMap);
      new ArrayList(map.entrySet());
      Stream var10000 = empMap.entrySet().stream().sorted(Entry.comparingByKey(Comparator.comparing(Employee::getSalary)));
      PrintStream var10001 = System.out;
      Objects.requireNonNull(var10001);
      var10000.forEach(var10001::print);
   }
}
