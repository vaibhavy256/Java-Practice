package com.example.practice1;

public class DuplicateWords {
    public static void main(String args[]){
        String string = "Big black bug bit a  black dog on his big black nose";
        System.out.println("Duplicate words in the given string:");
        findDuplicateWords(string);    }

    private static void findDuplicateWords(String string) {
        int count=0;
        string=string.toLowerCase();
        String[] str1=string.split(" ");
        for(int i=0;i<str1.length;i++){
            count=1;
            for(int j=i+1;j<str1.length;j++){
                if (str1[i].equals(str1[j])) {
                    count++;
                    str1[j]="0";
                }
            }
        if(count>1&&str1[i]!="0"){
            System.out.println(str1[i]+"->"+count);
        }
        }
    }
}
