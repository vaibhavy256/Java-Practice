package com.example.streamapi;

import java.util.ArrayList;
import java.util.List;

public class Databases {
   public static List<Employee> getEmployee() {
      List<Employee> list = new ArrayList();
      list.add(new Employee(76, "vaibhav", "IT", 500000L));
      list.add(new Employee(96, "vaibhav y", "FINANCE", 400000L));
      list.add(new Employee(65, "abc", "HR", 800000L));
      list.add(new Employee(46, "xxyas", "HR", 700000L));
      return list;
   }
}
