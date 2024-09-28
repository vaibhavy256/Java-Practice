package com.example.streamapi;

import java.util.List;
import java.util.stream.Collectors;

public class TaxService {
   public static List<Employee> evaluateTaxUsers(String input) {
      return input.equalsIgnoreCase("tax") ? (List)Databases.getEmployee().stream().filter((employee) -> {
         return employee.getSalary() > 500000L;
      }).collect(Collectors.toList()) : (List)Databases.getEmployee().stream().filter((employee) -> {
         return employee.getSalary() <= 500000L;
      }).collect(Collectors.toList());
   }

   public static void main(String[] args) {
      System.out.println(evaluateTaxUsers("tax"));
   }
}
