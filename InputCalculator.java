package javaPractise;

import java.util.Scanner;

public class InputCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		inputThenPrintSumAndAverage();
	}

	public static void inputThenPrintSumAndAverage() {

		Scanner scan = new Scanner(System.in);
		float sum = 0f, count = 0f; 

		while (true) {

			boolean isInt = scan.hasNextInt();
			if (isInt) {
				int number = scan.nextInt();
				sum += number;
				count++;
			} else
				break;
			scan.nextLine();
		}
		float avg =Math.round(sum/count);
		System.out.println("SUM = " + (int)sum + " AVG = " + (int)(avg));
		scan.close();
	}
}
