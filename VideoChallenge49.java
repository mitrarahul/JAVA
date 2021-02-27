package javaPractise;

public class VideoChallenge49 {

	public static void main(String args[]) {
		
			
	int	PlayerPosition = calculateHighScorePosition( 1500);
		displayHighScorePosition("jim", PlayerPosition);
		
		PlayerPosition = calculateHighScorePosition( 900);
		displayHighScorePosition("tim", PlayerPosition);
		
		PlayerPosition= calculateHighScorePosition( 400);
		displayHighScorePosition("john", PlayerPosition);
		
		PlayerPosition= calculateHighScorePosition( 50);
		displayHighScorePosition("neal", PlayerPosition);

	}

	public static void displayHighScorePosition(String playerName, int PlayerPosition) {
		System.out.println(playerName + " managed to get into the position " +PlayerPosition + " on the high score table");
	}

	public static int calculateHighScorePosition(int playerScore) {
//		if (playerScore >= 1000) {
//			System.out.println("score - " +playerScore);
//			return 1;
//	}
//		else if (playerScore >= 500 ) {
//			System.out.println("score - " +playerScore);
//			return 2;
//		}
//		
//		else if (playerScore >= 100 ) {
//			System.out.println("score - " +playerScore);
//			return 3;
//		}
//	
//		System.out.println("score - " +playerScore);
//		return 4;
//		
		int position = 4;  // assuming position 4 will be returned

        if(playerScore >= 1000) {
            position = 1;
        } else if(playerScore >= 500) {
            position = 2;
        } else if(playerScore >= 100) {
            position = 3;
        }
        return position;
	}
}
