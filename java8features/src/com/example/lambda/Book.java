package com.example.lambda;

public class Book {
   private int id;
   private String name;
   private int pages;

   public Book(int id, String name, int pages) {
      this.id = id;
      this.name = name;
      this.pages = pages;
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

   public int getPages() {
      return this.pages;
   }

   public void setPages(int pages) {
      this.pages = pages;
   }

   public String toString() {
      return "Book{id=" + this.id + ", name='" + this.name + "', pages=" + this.pages + "}";
   }
}
