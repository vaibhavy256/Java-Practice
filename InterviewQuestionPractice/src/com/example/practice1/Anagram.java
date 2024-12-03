package com.example.practice1;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Anagram {
    public static boolean areAnagrams(String str1, String str2) {
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();
        if (str1.length() != str2.length()) {
            return false;
        }
//        char[] charArray = str1.toCharArray();
//        char[] charArray2 = str2.toCharArray();
//
//        Arrays.sort(charArray);
//        Arrays.sort(charArray2);
        String charArray=str1.chars()
                             .sorted()
                             .mapToObj(c->String.valueOf((char) c))
                             .collect(Collectors.joining());

        String charArray2=str2.chars()
                              .sorted()
                              .mapToObj(c->String.valueOf((char) c))
                              .collect(Collectors.joining());

        return charArray2.equals(charArray);

    }

    public static void main(String args[]) {
        String str1 = "She is aradhya";
        String str2 = "is she hradaya";

        if (areAnagrams(str1, str2)) {
            System.out.println("Strings are Anagram");
        } else
            System.out.println("Strings are not anagrams");
    }
}
