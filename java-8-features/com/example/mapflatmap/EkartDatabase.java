package com.example.mapflatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EkartDatabase {
   public static List<com.example.mapflatmap.Customer> getAll() {
      return (List)Stream.of(new com.example.mapflatmap.Customer(101, "jhon", "john@gmail.com", Arrays.asList("2242431414", "16865234")), new com.example.mapflatmap.Customer(102, "smith", "smith@gmail.com", Arrays.asList("726726652", "545455")), new com.example.mapflatmap.Customer(103, "sachin", "sachin@gmail.com", Arrays.asList("2546565", "65745542")), new com.example.mapflatmap.Customer(104, "rohit", "rohit@gmail.com", Arrays.asList("5565656", "9677565"))).collect(Collectors.toList());
   }
}
