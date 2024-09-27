package com.example.exceptionhandling;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ExceptionHandlingExample {
   public static void main(String[] args) {
      List<String> list = Arrays.asList("44", "373", "xyz");
      list.forEach(handleGenericExpression((s) -> {
         System.out.println(Integer.parseInt(s));
      }, NullPointerException.class));
   }

   public static void printList(String s) {
      try {
         System.out.println(Integer.parseInt(s));
      } catch (Exception var2) {
         System.out.println("exception:" + var2.getMessage());
      }

   }

   static Consumer<String> handleExceptionAny(Consumer<String> payload) {
      return (obj) -> {
         try {
            payload.accept(obj);
         } catch (Exception var3) {
            System.out.println("Exception" + var3.getMessage());
         }

      };
   }

   static <Target, ExObj extends Exception> Consumer<Target> handleGenericExpression(Consumer<Target> targetConsumer, Class<ExObj> exObjClass) {
      return (obj) -> {
         try {
            targetConsumer.accept(obj);
         } catch (Exception var6) {
            Exception e = var6;

            try {
               ExObj exObj = (Exception)exObjClass.cast(e);
               System.out.println("exception:" + exObj.getMessage());
            } catch (ClassCastException var5) {
               throw var5;
            }
         }

      };
   }
}
