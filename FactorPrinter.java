package javaPractise;

public class FactorPrinter {

	public static void main(String[] args) {

		printFactors(21);
	}

//	public static void printFactors(int number)
//	{
//		 if (number <1 )
//			 System.out.println("Invalid Value");
//		 int temp = number;
//		for (int i=number; i>=1;i--)
//		{
//			temp = number/i;
//			if (number %i==0)
//				System.out.println(temp);	
//		}
		
		public static void printFactors(int number)
		{
			 if (number <1 )
				 System.out.println("Invalid Value");
			 int temp, sum=0 ;
			for (int i=1; i<=number;i++)
			{
				temp = number/i;
				if (number %i==0 && temp< number)
					sum+= temp;
						
			}
			System.out.println(sum);
		 /*int temp=1;
		  * while (temp>=number)
		 {  
			 number=number/temp;
			 	 
			 if (number%temp==0)
			 System.out.println(temp);
			 
		 temp++;
		 }*/
		 
		 
	}
}
