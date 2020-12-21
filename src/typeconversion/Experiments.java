package typeconversion;
import java.util.Scanner;

public class Experiments {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Give me a number please: ");
		String input = scanner.nextLine();
		System.out.println(input);
		
		double bigNumber = Double.valueOf(input).doubleValue();
		
		System.out.println("Double value is: ");
		System.out.println(bigNumber);
		
		System.out.println("Float value is:");
		System.out.println((float) bigNumber);
		
		System.out.println("Long value is:");
		System.out.println((long) bigNumber);
		
		System.out.println("Integer value is:");
		System.out.println((int) bigNumber);
		
		System.out.println("Short value is:");
		System.out.println((short) bigNumber);
		
		System.out.println("Byte value is:");
		System.out.println((byte) bigNumber);
	}

}
