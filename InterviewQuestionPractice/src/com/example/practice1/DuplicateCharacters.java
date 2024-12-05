package com.example.practice1;

public class DuplicateCharacters {

    public static void findDuplicateCharacters(String word){
        int count;
        word=word.toLowerCase();
        char[] ch=word.toCharArray();
        for(int i=0;i<ch.length;i++){
            count=1;
            for(int j=i+1;j< ch.length;j++){
                if(ch[i]==ch[j]){
                    count++;
                    ch[j]=0;
                }
            }
            if(count>1 && ch[i]!=0 && count<3){
                System.out.println(ch[i]+"->"+count);
            }
        }
    }
    public static void main(String[] args){
        String str="Vaibhava";
        findDuplicateCharacters(str);
    }
}
