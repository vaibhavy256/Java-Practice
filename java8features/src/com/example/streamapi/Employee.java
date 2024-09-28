package com.example.streamapi;

public class Employee {
   private int id;
   private String name;
   private String dept;
   private Long salary;

   public Employee(int id, String name, String dept, Long salary) {
      this.id = id;
      this.name = name;
      this.dept = dept;
      this.salary = salary;
   }

   public int getId() {
      return this.id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public String getName() {
      return this.name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public String getDept() {
      return this.dept;
   }

   public void setDept(String dept) {
      this.dept = dept;
   }

   public Long getSalary() {
      return this.salary;
   }

   public void setSalary(Long salary) {
      this.salary = salary;
   }

   public String toString() {
      return "\nEmployee{id=" + this.id + ", name='" + this.name + "', dept='" + this.dept + "', salary=" + this.salary + "}";
   }
}
