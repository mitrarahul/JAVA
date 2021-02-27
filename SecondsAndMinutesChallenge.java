package javaPractise;

public class SecondsAndMinutesChallenge {
	public static final String DEFAULT_ERROR_MESSAGE = "Invalid INPUT";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println( getDurationString(61, 61));
		 System.out.println(getDurationString(60, 59));
		 System.out.println(getDurationString(-610, 9));
		 System.out.println( getDurationString(1, 6));
		 System.out.println( getDurationString(3722));
		
		
	}
	public static String getDurationString(int minutes, int seconds){
		int hours,newminutes ,secondsduration;
		if(minutes<0 || seconds<0 || seconds>59)
			return DEFAULT_ERROR_MESSAGE;
		
		else
			{secondsduration = ((minutes * 60) + seconds);
			System.out.println((minutes+" minutes & "+seconds+"seconds = "+secondsduration+"seconds"));
			hours = minutes/60;
			newminutes = minutes%60;
						
			return (hours+"h "+newminutes+"m "+seconds+"s");
	}
		
		
			
			
	}
	public static String getDurationString(int seconds){
	int	error ;
	if(seconds>=0 )
		{
			int minute = (seconds/60);
			 int newseconds = seconds%60;
			 return getDurationString(minute, newseconds); 
			
		}
		else
			error = -1;
			return DEFAULT_ERROR_MESSAGE;
}
}
