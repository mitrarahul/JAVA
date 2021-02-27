package javaPractise;

public class DataTypeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*int intA = Integer.MIN_VALUE;
		System.out.println(intA);
		System.out.println(Integer.MIN_VALUE);
		System.out.println("double max value is "+Float.MAX_VALUE);
		System.out.println("byte max value is "+ Byte.MAX_VALUE);
		System.out.println(" max value is "+Float.MAX_VALUE);
		System.out.println("double max value is "+Float.MAX_VALUE);
		
		byte test = (byte) (intA /2);
		System.out.println(test);
		
		int intValue = 15/4;
		System.out.println("try int max value is "+intValue);
		float floatValue = 16/2f;
		double doubleValue = 18/2d;
		
		long check = (int)(intValue + doubleValue + floatValue)/2;
		System.out.println(check);*/
		
	/*	Scanner s = new Scanner(System.in);
		System.out.println("Enter pound value = ");
		int pound = s.nextInt();
		double kilo = (0.453592d * pound);
		System.out.println("the kilo vaue is " + kilo);
		
		double d = 102_3.98_2d;	
		System.out.println(d);
		System.out.println('\u0044'+'\u0041');
		//boolean value21 = true;*/
		
		
	/*	String str1 = "10";
		str1 = str1 + 50 + '\u00A9';
		System.out.println(str1);
		double doubleValue = 50.98771321;
		str1 = str1 + doubleValue;
		System.out.println(str1);
		
		double r = 17;
		r %= 3;
		System.out.println(r);*/
		
		boolean car = false;
		if(car)
			System.out.println("The car is true");
		else
		System.out.println("The car is false");
			
		boolean wasCar = car ? true:false;
		if (wasCar)
			System.out.println("wasCar is true");
		else
			System.out.println("wasCar is false");
		
		
		
		/**double doubleValue1 = 20d, doubleValue2 = 80d;
		double add = (doubleValue1 + doubleValue2) *100d;
		double remainder = add % 40.00d;
		System.out.println("remainder is =" +remainder);
		//** boolean varBoolean = false ;
		if (remainder ==0)
		 varBoolean = true;
		else 
			varBoolean = false;	//**
		boolean varBoolean =(remainder ==0) ? true: false;
		System.out.println("is no remanider ="+ varBoolean);
		if(!varBoolean)
			System.out.println("Got some remainder");*/
	}
}
