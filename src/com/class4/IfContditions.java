package com.class4;

import java.util.Scanner;

public class IfContditions {

	public static void main(String[] args) {
		//if condition is use when you want to put the condition on your coding like: when, which code should be print or not print.
      //and the formulla for if conditon is: if+()+ {}
		
		System.out.println("what is trafic light color?");
		Scanner trafic = new Scanner(System.in);
		String car = trafic.nextLine();
		
		
		if(car.equals("red") || (car.equals("stop sign")) ){
			System.out.println("Stop the car");
			System.out.println("break the car");
			// in above examplet it match the  it print stop the car.
			// if we add ! mark infront of name it changes to negative like: if(!car.equals("red"))
			
		}
		
else if(car.equals("yellow")) {
	System.out.println("prepare of stop");
			
		}
		else{ System.out.println("keep driving");}
		// else we don't need() because don't have condition but in else if, we need same like if class.
		

	}

}
