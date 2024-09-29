package com.examples.practice;

import java.util.HashSet;
import java.util.Scanner;

public class UniqueElements {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        HashSet<Integer> uniqueElements=new HashSet<>();
        HashSet<Integer>duplicateElements=new HashSet<>();
        for(int chars:array){
            if(!uniqueElements.add(chars)){
                duplicateElements.add(chars);
            }
        }
        uniqueElements.removeAll(duplicateElements);
        System.out.println(uniqueElements);
    }
}
