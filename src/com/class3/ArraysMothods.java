package com.class3;

public class ArraysMothods {
	
	
	

	public static void main(String[] args) {
		
	//Option1 when we know the value or we have the value. when we print them we the index numbers. like below example.
		//The formula is for this is: data type + [] + aname + = {};
		//String[] array = {};
		
		String[] array = {"Tom", "Bob", "Mike", "Kab", "Gowhar"};
		
//		int[] salary = {3500, 4000, 5888};
//		
//		 System.out.println(array[0]);
//		 System.out.println(array[3]);
//		 System.out.println(array[4]);
		  
		 
		//Option2: we don't have the value or we don't know the value but know the numbers. then we assign the value for each. 
		 //like below example. The formula is like we create Object 
		
		 String[] student = new String[4];
		  student[1] = "Steve";
		  student[0] = "Kabul";
				  
				  System.out.println(student[1]);
				  System.out.println(student[0]);
		 

	}

}
