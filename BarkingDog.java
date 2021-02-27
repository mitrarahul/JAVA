package javaPractise;

public class BarkingDog {

	public static void main(String[] args) {

		System.out.println(shouldWakeUp(true, 23));
		System.out.println(shouldWakeUp(false, 23));
		System.out.println(shouldWakeUp(true, 25));
		System.out.println(shouldWakeUp(true, 1));
		System.out.println(shouldWakeUp(true, 15));
		System.out.println(shouldWakeUp(true, 22));
		System.out.println(shouldWakeUp(true, 0));
		System.out.println(shouldWakeUp(true, -1));
		System.out.println();
		System.out.println(shouldWakeUp1(true, 23));
		System.out.println(shouldWakeUp1(false, 23));
		System.out.println(shouldWakeUp1(true, 25));
		System.out.println(shouldWakeUp1(true, 1));
		System.out.println(shouldWakeUp1(true, 15));
		System.out.println(shouldWakeUp1(true, 22));
		System.out.println(shouldWakeUp1(true, 0));
		System.out.println(shouldWakeUp1(true, -1));
	}
	

	public static boolean shouldWakeUp(boolean barking, int hourOfDay) 
	{
		boolean wakeup = false;
//		
//		if (barking == false )
//			return wakeup;
//		
//		else if (hourOfDay<0 || hourOfDay > 24)
//			return wakeup;
		if (barking && hourOfDay >= 0 && hourOfDay <= 24) {
			if (hourOfDay < 8 || hourOfDay > 22) {
				wakeup = true;
			}
		} else
			wakeup = false;
		return wakeup;
	}

	public static boolean shouldWakeUp1(boolean isBarking, int hourOfDay) {
	     
        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        } else {
            if (isBarking) {
                return (hourOfDay < 8 || hourOfDay > 22);
            } else {
                return false;
            }
        }       
    }

}


