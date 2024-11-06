package com.examples.practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateWordsInString {
    public static void duplicateWordsInString(String inputString){
        String[] words=inputString.split(" ");
        Map<String,Integer>wordCount=new HashMap<String,Integer>();
        for(String word:words){
            if(wordCount.containsKey(word)){
                wordCount.put(word.toLowerCase(),wordCount.get(word)+1);
            }
            else {
                wordCount.put(word,1);
            }
        }
        //Set<String>wordsInString=wordCount.keySet();
        for(Map.Entry<String,Integer> entry:wordCount.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey()+" "+entry.getValue());
            }
        }
    }
    public static void main(String args[]){
        duplicateWordsInString("java is java best langauga is java");
    }
}
