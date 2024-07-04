package com.example.lambda;

public class Main {

	public static void main(String[] args) {
		MyInterFace i=()-> System.out.println("First Lamda expression");
		
		SumInter sumInter=(a,b) -> a + b;
		System.out.println(sumInter.sum(5, 98));
		
		LengthInterface lengthInter=str->str.length();
		System.out.println("Length Of String"+lengthInter.getLength("Vaibhav yeotikar"));
	}

}
