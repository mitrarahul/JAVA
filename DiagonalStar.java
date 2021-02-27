package javaPractise;

public class DiagonalStar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printSquareStar(4);

	}

	public static void printSquareStar(int number) {
		if (number < 5)
			System.out.println("Invalid Value");

//		for (int i = 1; i <= number; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print(" * ");
//			}
//			System.out.println();
//		}
		else {
			for (int i = 1; i <= number; i++) {
				for (int j = 1; j <= number; j++) {
					if ((i == 1) || (i == number) || (j == 1) || (j == number) || (i == j) || (i + j == number + 1)) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}
	}
}
