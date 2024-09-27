package com.example.lambda;

import java.util.Collections;
import java.util.List;

public class BookSeervice {
   public List<Book> getBooksinSort() {
      List<Book> books = (new BookDao()).getBooks();
      Collections.sort(books, (o1, o2) -> {
         return o1.getName().compareTo(o2.getName());
      });
      return books;
   }

   public static void main(String[] args) {
      System.out.println((new BookSeervice()).getBooksinSort());
   }
}
