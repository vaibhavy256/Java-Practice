package com.example.practice1;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfWords {
    public static void main(String args[]){
        String[] words={"the","is","sunny","day","the","is","is","the","the","sunny"};
        wordsFrequency(words);
    }

    private static void wordsFrequency(String[] words) {
        //Map<String,Integer>word=new HashMap<>();

        for(int i=0;i<words.length;i++){
            int count=1;
            for(int j=i+1;j<words.length;j++){
                if (words[i]==words[j]) {
                    count++;
                    words[j]="0";
                }
            }

            if(count>=1 && words[i]!="0")
            System.out.println(words[i]+"->"+count);
            count=0;
        }
    }
}
