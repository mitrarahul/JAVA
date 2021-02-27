package javaPractise;

import java.util.Scanner;

public class stringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// to reverse a string

		try (Scanner scan = new Scanner(System.in)) {
			System.out.print("Enter your string = ");
			String s = scan.nextLine();
			
			//String s = "Manchester United";
			String t = new String();
			
			for(int i=s.length()-1;i>=0;i--)
			{
				t = t + s.charAt(i);
			}
			
			System.out.println(t);
		}
	}

}
