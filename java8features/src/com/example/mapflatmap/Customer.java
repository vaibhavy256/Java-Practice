package com.example.mapflatmap;

import java.util.List;

public class Customer {
   private int id;
   private String name;
   private String email;
   private List<String> phoneNumbers;

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

   public String getEmail() {
      return this.email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public List<String> getPhoneNumbers() {
      return this.phoneNumbers;
   }

   public void setPhoneNumbers(List<String> phoneNumbers) {
      this.phoneNumbers = phoneNumbers;
   }

   public Customer(int id, String name, String email, List<String> phoneNumbers) {
      this.id = id;
      this.name = name;
      this.email = email;
      this.phoneNumbers = phoneNumbers;
   }

   public String toString() {
      return "Customer{id=" + this.id + ", name='" + this.name + "', email='" + this.email + "', phoneNumbers=" + this.phoneNumbers + "}";
   }
}
