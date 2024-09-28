package com.example.lambda;

import java.util.ArrayList;
import java.util.List;

public class BookDao {
   public List<Book> getBooks() {
      List<Book> books = new ArrayList();
      books.add(new Book(101, "Java", 123));
      books.add(new Book(302, "Hibernate", 653));
      books.add(new Book(402, "Spring", 254));
      return books;
   }
}
