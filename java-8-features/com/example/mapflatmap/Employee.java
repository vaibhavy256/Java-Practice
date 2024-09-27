package com.example.mapflatmap;

public class Employee {
   private int id;
   private String name;
   private String grade;
   private Long salary;

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

   public String getGrade() {
      return this.grade;
   }

   public void setGrade(String grade) {
      this.grade = grade;
   }

   public Long getSalary() {
      return this.salary;
   }

   public void setSalary(Long salary) {
      this.salary = salary;
   }

   public Employee(int id, String name, String grade, Long salary) {
      this.id = id;
      this.name = name;
      this.grade = grade;
      this.salary = salary;
   }

   public String toString() {
      return "Employee{id=" + this.id + ", name='" + this.name + "', grade='" + this.grade + "', salary=" + this.salary + "}";
   }
}
