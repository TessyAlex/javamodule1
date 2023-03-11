package exceptionsday6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo1 {

	public static void main(String[] args) {
		//int s=a/b;
		//throws new ArithmeticException("cannot be divisible by 0");
		
		System.out.println("program begins");
		try {
			Scanner scanner = new Scanner(System.in);
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int c = a / b;// point of exception
			System.out.println(c);
		} catch (ArithmeticException e) {
			System.out.println("cannot be divisible by 0");
		} catch (InputMismatchException e) {
			System.out.println("invalid input format");
		}
		System.out.println("program ended");

	}
}
