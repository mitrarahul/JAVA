package javaPractise;



public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	System.out.println("miles = " + TimBuchalka1.toMilesPerHour(10.5));

	//	TimBuchalka1.printCVonversion(10.5);

//		double d;
//		d = 100/12d;
//		System.out.println(d);
	/**	int number=0, finishNumber  = 19;

		while ((number <= finishNumber )) {
			
			number++;
			if (number % 2 != 0) {
				//System.out.println(n);
				continue;
					}
			if (number>19)
				break;
			System.out.println(number);
		}*/
		reverseParseInt(240);
		int a = 510;
		String s = String.valueOf(a);
		System.out.println(a);
		String s1 = "051";
		 StringBuffer str = new StringBuffer(s);
		int num1= Integer.parseInt(s1);
		 System.out.println(num1);
		 
		 int a1 = Integer.parseInt(s1);
		 System.out.println(a1);
		 
	}
	
	private static void reverseParseInt(int num)
	{
		String s = new String();
		s.valueOf(num);
		System.out.println(s=s+1);
		//int r = Integar.parseInt(s);
}
}
