package javaPractise;

public class MegaBytesConverter {

	public static void main(String[] args) {

		printMegaBytesAndKiloBytes(5000);
		printMegaBytesAndKiloBytesLong(1100);
		
	}

	public static void printMegaBytesAndKiloBytes(int kiloBytes) {
		/*
		 * The method should not return anything (void) and it needs to calculate the
		 * megabytes and remaining kilobytes from the kilobytes parameter. Then it needs
		 * to print a message in the format "XX KB = YY MB and ZZ KB".
		 */
		// If the parameter kiloBytes is less than 0 then print the text "Invalid
		// Value".
		if (kiloBytes < 0) {
			System.out.println("Invalid Value");
		} else {
			int Megabyte = Math.floorDiv(kiloBytes, 1024);
			int KiloByteRemainder = Math.floorMod(kiloBytes, 1024);
			System.out.println(kiloBytes + " KB = " + Megabyte + " MB and " + KiloByteRemainder + " KB");
		}
	}

	public static void printMegaBytesAndKiloBytesLong(int kiloBytes) {
		if (kiloBytes < 0) {
			System.out.println("Invalid Value");
		} else {
			int Megabyte = kiloBytes / 1024;
			int KiloByteRemainder = kiloBytes % 1024;
			System.out.println(kiloBytes + " KB = " + Megabyte + " MB and " + KiloByteRemainder + " KB");

		}

	}
}
