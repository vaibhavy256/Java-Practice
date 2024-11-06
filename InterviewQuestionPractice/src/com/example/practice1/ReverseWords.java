package com.example.practice1;

public class ReverseWords {

    public static void main(String[] args) {
        String s = "My Name is Vaibhav b";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        String[] str = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = str.length - 1; i >= 0; i--) {
            sb.append(str[i]);
            sb.append(" ");
        }
        return sb.toString();
    }
}
