package com.example.practice1;

public class IndexFirstOccurenceOfString {
    public static int StringOccurrence(String haystack,String input){
        for(int i=0;i<haystack.length()-input.length()+1;i++){
            if(haystack.charAt(i)==input.charAt(0)){
                if(haystack.substring(i,input.length()+i).equals(input)){
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String str="butsadbutsad";
        String input="sad";
        System.out.println(StringOccurrence(str,input));
    }
}
