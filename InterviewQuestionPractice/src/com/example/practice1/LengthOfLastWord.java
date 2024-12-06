package com.example.practice1;

public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        String[] str=s.split(" ");
        String word=str[str.length-1];
        int wordLength=word.length();
        return wordLength;
    }
    public static void main(String[] args){
        String s="My Name is Vaibhav ";
        System.out.println(lengthOfLastWord(s));
    }
}
