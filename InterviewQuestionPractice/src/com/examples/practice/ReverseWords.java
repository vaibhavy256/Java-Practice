package com.examples.practice;

public class ReverseWords {

    public static void main(String[] args){
        String s="My Name is Vaibhav ";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s){
        String[] words=s.split(" +");
        StringBuilder sb=new StringBuilder();
        for(int i= words.length-1;i>=0;i--){
            sb.append(words[i]);
            sb.append(" ");
        }
        return sb.toString().trim();

    }
}
