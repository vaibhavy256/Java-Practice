package com.example.streamapi;

import java.io.PrintStream;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class SortListDemo {
   public static void main(String[] args) {
      List<Employee> employees = Databases.getEmployee();
      Collections.sort(employees, (o1, o2) -> {
         return (int)(o1.getSalary() - o2.getSalary());
      });
      Stream var10000 = employees.stream().sorted(Comparator.comparing((emp) -> {
         return emp.getSalary();
      }));
      PrintStream var10001 = System.out;
      Objects.requireNonNull(var10001);
      var10000.forEach(var10001::println);
      var10000 = employees.stream().sorted(Comparator.comparing(Employee::getName));
      var10001 = System.out;
      Objects.requireNonNull(var10001);
      var10000.forEach(var10001::println);
   }
}
