package javaPractise;

public class Sum3and5Challenge {

	public static void main(String[] args) {
		int n = 0, x = 0;
		for (int i = 1; i <= 1000; i++) {
			if (i % 3 == 0 && i % 5 == 0) 
			{
				System.out.println(i);
				x += i;
				// System.out.println(x);
				n++;
			}
		if (n==5)
		break;
		}
		System.out.println("sum is "+x);

	}

}
