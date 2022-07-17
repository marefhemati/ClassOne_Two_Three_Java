package com.class4;

public class ContinuesAndBreak {

	public static void main(String[] args) {
		//continue skip the from one we select and break stop printing from where we use it.
		
		String[] studentBook = {"History", "Math", "English", "Drawing"};
		
	for(int i=0; i<=studentBook.length-1; i=i+1) {
		
		if(i==2) {
			continue;
			
		}
		System.out.println(studentBook[i]);
			
			
		}
	
		
		
		

	}

}
