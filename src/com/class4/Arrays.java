package com.class4;

import java.util.Scanner;

public class Arrays {
	
	
	
	public static void main(String[] args) {
//		System.out.println("what is your job?");
//		Scanner student = new Scanner(System.in);
//		String c = student.nextLine();
//		System.out.println(c.length());
//		
//		int[] grade = {5, 54,56 , 3,};
//		System.out.println(grade[2]);
//		System.out.println(grade.length);
		
		// There is a method in String that allows us to convert any String to array that is called toCharArray()
		
//		String a = "Apple";
//		
//		a.toCharArray();
//		//Becuase the return type is Char we select our array data type char
//		char[] anyname = a.toCharArray();
//		System.out.println(anyname[2]);
		
		// In interveiw if ask, I have an array of charactors and I made from String. Can you print one charachter at a time.
		//.First we should ask or know the length of String. Ex: what is the String and what is the length of String.
		
		String b = "Mike";
		// Now we have the length which is mike.
		char[] aname = b.toCharArray();
		System.out.println(aname[0]);
		System.out.println(aname[1]);
		System.out.println(aname[2]);
		System.out.println(aname[3]);
		
		
		System.out.println("=======================");
		
		String c = "charater";
		char[] books = c.toCharArray();
		System.out.println(books[3]);
		System.out.println(books[0]);
		
		
		
	
		
	}

}
