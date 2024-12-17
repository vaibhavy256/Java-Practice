package com.example.practice1;

public class Vowelss {
    public static void main(String[] args) {
        String str="My name is Vaibhav";
        System.out.println("Vowles:"+showVowels(str));
    }

    public static String showVowels(String str){
        str=str.toLowerCase();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' ||ch=='o' ||ch=='u'){
                sb.append(ch+" ");
            }
        }
        return sb.toString();
    }
}
