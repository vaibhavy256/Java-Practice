package com.example.practice1;

public class LastWordLength {
    public static int LengthOfLastWord(String s){
        String str=s.trim();
        int count=0;
        for (int i=str.length()-1;i>=0;i--){
            if(str.charAt(i)!=' '){
                count++;
            }
            else {
                break;
            }
        }
        return count;
    }
    public static void main(String[] args){
        String s="My Name is Vaibhav ";
        System.out.println(LengthOfLastWord(s));
    }
}
