package javaPractise;

public class GreatestCommonDivisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getGreatestCommonDivisor1(18,12));
	
	}
	
/*public static int getGreatestCommonDivisor(int first, int second)
{
 if (first <10 || second < 10)
	 return -1;
 int min = Math.min(first, second);
 int max = Math.max(first, second);
 int gcd=1,n1,n2;
 n1=min;
 while (min>1)
 {
	 n2 = max/n1;
	 if (max%n1==0 && min%n1==0 )
	 {
		 gcd = n1;
		 break;
	 }
	 n1--;
 }
	return gcd;
}
*/
public  static int getGreatestCommonDivisor1(int first,int second){
    if(first < 10 || second <10){
        return  -1;
    }
    if(second == 0){
        return first;
    }
    while(second != 0){
        int temp = second;
        second = first % second;
        first  = temp;
    }
    return first;
}
public static int getGreatestCommonDivisor(int first, int second) {
    if (first < 10 || second < 10) {
        return -1;
    }
    int a = Math.max(first,second);
    int b = Math.min(first,second);
    while (b != 0) {
        int mod = a % b;
        a = b;
        b = mod;
    }
    return a;
}
}