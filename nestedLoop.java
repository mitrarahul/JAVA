package javaPractise;

import java.util.Scanner;

public class nestedLoop {

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Enter the row value = ");
			int r = s.nextInt();
			// System.out.println("Enter the column value = ");
			// int c = s.nextInt();

			for (int i = 1; i <= r; i++) {
				// System.out.println( i);
				for (int j = r; j >= i; j--) {
					System.out.print(j);
				}
				System.out.println(" ");
			}
		}
	}

}
