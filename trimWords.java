package javaPractise;

import java.util.Scanner;

public class trimWords {

	public static void main(String[] args) {
		try (Scanner scanObj = new Scanner(System.in)) {
			
			System.out.println("Enter the words = ");
			String s = scanObj.nextLine();
			String t = new String();
			System.out.println("the index of a is " + s.indexOf("a"));
			
			System.out.println(s.substring(3));
			String arr[] = s.split(" ");
			System.out.println(arr[0]);
			System.out.println(arr[1]);
			System.out.println((arr[1]+ " is good"));
		}

	}
}
