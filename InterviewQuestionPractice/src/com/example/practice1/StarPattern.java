package com.example.practice1;

public class StarPattern {
    public static void main(String[] args) {
//        for(int i=0;i<=4;i++){
//            System.out.println("");
//            for(int j=0;j<=i;j++){
//                System.out.print("*");
//            }
//        }
        int k=1;
        for(int i=1;i<=5;i++){
            System.out.println("");
            for(int j=1;j<=i;j++){
                System.out.print(k+" ");
                k++;
            }
        }
    }
}
