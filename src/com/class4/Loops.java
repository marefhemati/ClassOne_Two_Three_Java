package com.class4;

import java.util.Scanner;



public class Loops {
//	Given N --- Print this pattern up to N: 1, 4, 8, 12, 16, 20…
//	Given N --- Print backward to 0.
//	(Ask user for a number and let's assume N is 5 so if the user input 5
//	– then the program should print: 5 4 3 2 1 0)
//
//	Ask the user for a word and then print each character out one by one.
//	Example: user enters: hello; your program will print out: h e l l o

	public static void main(String[] args) {
		System.out.println("Give me a number");
		Scanner user = new Scanner(System.in);
		int N = user.nextInt(5);
		
		
		for(int i=4; i<=N; i=i+4) {
			System.out.println(i);
			
			
			
		}
	}
	
		
	
		
		
		}
  

	


