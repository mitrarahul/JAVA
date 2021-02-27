package javaPractise;


public class DecimalComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d = -3.1758;
		double d1= d*1000;
		System.out.println(d1);
		long d2 = (long)d1;
		System.out.println(d2);
		
		double value1 = -5.89453;
	value1 =	((long)(value1 * 1e3)) / 1e3;
	System.out.println(value1);
		
		
	//	long abs = (int)Math.abs(d);
		//System.out.println(abs);
		
	//	DecimalFormat deciformat = new DecimalFormat("#.###");

		//System.out.println(deciformat.format(d));
		System.out.println(areEqualByThreeDecimalPlaces(-3.1753, -3.1754));
	}

	public static boolean areEqualByThreeDecimalPlaces(double value1, double value2) {
		//DecimalFormat deciformat = new DecimalFormat("#.###");
		// value1= (long)(value1*1000d);
		//value2= (long)(value2*1000d);
	value1 =	((long)(value1 * 1e3)) / 1e3;
	value2 =	((long)(value2 * 1e3)) / 1e3;
		
		return (value1==value2) ? true:false;
		
		
		
	/*	if (value1 ==value2)
			return true;

		else
			return false;*/

	}

}
