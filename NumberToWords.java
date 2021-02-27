package javaPractise;

public class NumberToWords {

	public static void main(String[] args) {
		numberToWords(0);
		//System.out.println(reverse(4100));
	}

	public static void numberToWords(int number)
	{
		if (number<0)
			System.out.println("Invalid Value");
		if (number==0)
			System.out.println("Zero");
		
		int DigitCount= getDigitCount(number);
		number = reverse(number);
		int newDigitCount= getDigitCount(number);
		while (number>0)
		{ 
		int last = number % 10;
				
		switch (reverse(last)){
		case 0: System.out.println("Zero");
		break;
		case 1: System.out.println("One");
		break;
		case 2: System.out.println("Two");
		break;
		case 3: System.out.println("Three");
		break;
		case 4: System.out.println("Four");
		break;
		case 5: System.out.println("Five");
		break;
		case 6: System.out.println("Six");
		break;
		case 7: System.out.println("Seven");
		break;
		case 8: System.out.println("Eight");
		break;
		case 9: System.out.println("Nine");
		break;
		case 10: System.out.println("Ten");
		break;
		default:   System.out.println("Invalid Value");
		}
		number = number / 10;
	}
		while (newDigitCount<DigitCount) {
			System.out.println("Zero");
			newDigitCount++;
		}
	}
	
	public static int getDigitCount(int number) {
		if (number<0)
			return -1;
		String s = String.valueOf(number);
		int length = s.length();
		return length;
	}
 
	public static int reverse(int number)
	{	int reverse=0, temp = number;
		while (temp != 0) {
			int units = temp % 10;
			//if (units ==0)

			temp /=  10;
			reverse *= 10;
			reverse += units;
		}
		return reverse;
	}
}
