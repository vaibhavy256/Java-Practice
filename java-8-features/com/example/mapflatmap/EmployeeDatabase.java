package com.example.mapflatmap;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDatabase {
   public static List<Employee> getEmployees() {
      List<Employee> list = new ArrayList();
      list.add(new Employee(76, "vaibhav", "A", 500000L));
      list.add(new Employee(96, "vaibhav y", "A", 400000L));
      list.add(new Employee(65, "abc", "B", 800000L));
      list.add(new Employee(46, "xxyas", "C", 700000L));
      return list;
   }
}
