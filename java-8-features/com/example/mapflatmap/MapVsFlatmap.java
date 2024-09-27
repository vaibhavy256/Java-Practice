package com.example.mapflatmap;

import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatmap {
   public static void main(String[] args) {
      List<com.example.mapflatmap.Customer> customers = EkartDatabase.getAll();
      List<String> emails = (List)customers.stream().map((customer) -> {
         return customer.getEmail();
      }).collect(Collectors.toList());
      List<List<String>> phonenumbers = (List)customers.stream().map((customer) -> {
         return customer.getPhoneNumbers();
      }).collect(Collectors.toList());
      List<String> phones = (List)customers.stream().flatMap((customer) -> {
         return customer.getPhoneNumbers().stream();
      }).collect(Collectors.toList());
      System.out.println(phones);
   }
}
