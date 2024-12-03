package com.example.practice1;

public class LcmHcf {
    public static int calculateHcf(int num1,int num2){
        while(num2!=0){
            int temp=num2;
            num2=num1%num2;
            System.out.println(num2);
            num1=temp;
        }
        return num1;
    }
    private static int calculateLcm(int num1, int num2, int hcf) {
        return num1*num2/hcf;
    }


    public static void main(String args[]) {
        int num1 = 72;
        int num2 = 120;

        int hcf = calculateHcf(num1, num2);

        // Calculate LCM
        int lcm = calculateLcm(num1, num2, hcf);

        // Display results
        System.out.println("HCF of " + num1 + " and " + num2 + " is: " + hcf);
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm);
    }


}
