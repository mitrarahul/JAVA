package javaPractise;

public class MethodOverloadingCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	System.out.println(calcFeetsAndInchesToCentimeters(-157));
	System.out.println(calcFeetsAndInchesToCentimeters(13, 1));
	
	}

	public static double calcFeetsAndInchesToCentimeters(double feet, double inches){
		double centimeters=0d;
		if((feet>=0 && inches>=0 && inches<=12))
		{
			centimeters = ((feet * 12d) + inches)* 2.54d;
			return centimeters;
		}		
		
		else
			return -1;
	}
	public static double calcFeetsAndInchesToCentimeters(double inches){
	if(inches>=0 )
		{
			int feet = (int)(inches/12d);
			 inches = inches%12d;
			 	 return	 calcFeetsAndInchesToCentimeters(feet, inches);
			
		}
		else
			return -1;
}
}