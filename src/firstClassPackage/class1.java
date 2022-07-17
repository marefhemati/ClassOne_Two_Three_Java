package firstClassPackage;

import java.util.Scanner;

public class class1 {

	public static void main(String[] args) {
		
		Scanner ob = new Scanner (System.in);
		System.out.println("what is the trafic light?");
		String tranfic = ob.nextLine();
		
		if(tranfic.equals("green")) {
			System.out.println("don't stop");
		}
			
			
		}

	}

