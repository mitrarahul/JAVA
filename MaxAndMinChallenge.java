package javaPractise;
import java.util.Scanner;
public class MaxAndMinChallenge 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int max = 0, min = 0;
		boolean first = false;
		while (true) 
		{
			System.out.println("Enter Number = ");
			boolean isAnInt = scan.hasNextInt();
			if (isAnInt) 
			{
				int input = scan.nextInt();
				
				if (!first)
				{
					first = true;
					max = input;
					min = input;
				}
				if (input > max) 
				{
					max = input;
				} 
				if (input < min) 
				{
					min = input;
				}
			} else 
			{
				System.out.println("Invalid input");
				break;
			}
			scan.nextLine();
		}
		System.out.println("maximun number is = " + max + " and minimum number is = " + min);

		scan.close();
	}
}
