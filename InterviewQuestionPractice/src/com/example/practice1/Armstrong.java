package com.example.practice1;

import java.util.Scanner;

public class Armstrong {
    public static boolean isArmstrong(int num){
        int originalNumber=num;
        //int sum=0;
        String numStr=String.valueOf(num);
        int numDigits=numStr.length();

        int sum=numStr.chars()
                .map(Character::getNumericValue)
                .map(digit->(int)Math.pow(digit,numDigits))
                .sum();

//        while(num!=0){
//            int digit=num%10;
//            sum= (int) (sum+Math.pow(digit,digits));
//            num=num/10;
//        }
        return sum==num;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int number=sc.nextInt();
        if (isArmstrong(number)){
            System.out.println("Number is armstrong");
        }
        else{
            System.out.println("Number is not armstrong");
        }
    }
}
