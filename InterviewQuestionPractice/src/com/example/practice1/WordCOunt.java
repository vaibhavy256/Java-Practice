package com.example.practice1;

import java.util.stream.Stream;

public class WordCOunt {
    public static int countWords(String input){
        if(input==null || input.trim().isEmpty()){
            return  0;
        }
        //String[] words=input.split("\\s+");
        return (int) Stream.of(input.trim().split("\\s+")).count();
    }

    public static void main(String[] args){
        String str="my name is       vaibhav";

        int count=countWords(str);
        System.out.println("Number of words: "+count);
    }
}
