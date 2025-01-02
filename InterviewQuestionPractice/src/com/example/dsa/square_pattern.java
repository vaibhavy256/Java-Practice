package com.example.dsa;

public class square_pattern {
    public static void main(String[] args) {
        int k=1;
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= 4; j++) {
                if (i == 0 || i ==4  || j == 0 || j == 4) {
                    System.out.print("*  ");
                } else {
                    // Print space for the hollow part
                    System.out.print("   ");
                }
            }
            System.out.println(); // Move to the next row
            }
        }
    }

