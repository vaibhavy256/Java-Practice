package com.example.practice1;

import java.util.Arrays;

public class question {

    public static  void main(String args[]){
        int a[]={5,6,7, 14,20};
        int sum= Arrays.stream(a).sum();
        System.out.println("sume:"+ sum);
    }

}
