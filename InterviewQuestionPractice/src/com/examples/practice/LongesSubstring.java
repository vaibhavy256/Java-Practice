package com.examples.practice;

import java.util.ArrayList;
import java.util.List;

public class LongesSubstring  {
    public static void main(String args[]){
        String s="abcabcbb";
        int start=0;
        int end=0;
        int max_length=0;
        List<Character> list=new ArrayList<Character>();
        while(end<s.length()){
            if(!list.contains(s.charAt(end))){
                list.add(s.charAt(end));
                System.out.print(list);
                end++;
                max_length=Math.max(max_length,list.size());
            }
            else {
                list.remove(Character.valueOf(s.charAt(end)));
                System.out.print(list);
                start++;
            }
        }
        System.out.println(max_length);

    }
}
