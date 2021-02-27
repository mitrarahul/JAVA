package javaPractise;

public class PrimeNumberChecker {

	public static void main(String[] args) {
		
	isPrimeNumber(193);
		
	}
	
	
	public static void isPrimeNumber(int number)
	{ int flag= 0;
	if (number==1)
			System.out.println("neither prime nor composite Number") ; 
	
		for(int i=2; i<number/2; i++)
		{
			if (number%i==0) 
			flag=1;	
		}
		
		if (flag==1)
			System.out.println("composite Number") ; 
		
			else
			System.out.println("prime Number");				

}
//	public static int isPrimeNumber(int number)
//	{
//		if (number==1)
//			System.out.println("neither prime nor composite Number") ; 
//		
//		for(int i=2; i<number/2; i++)
//		{
//			if(number%i!=0) 
//				System.out.println(number+"is a prime Number");
//				return number;
//				
//		}
//	}
	
	
}