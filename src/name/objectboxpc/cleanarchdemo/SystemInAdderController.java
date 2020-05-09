package name.objectboxpc.cleanarchdemo;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class SystemInAdderController {
	private final AdderInput _input;

	public SystemInAdderController(AdderInput input) {
		_input = input;
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		String input;
		int num1;
		int num2;
		try {
			while(true) {
				try {
					System.out.println("Enter the first number:");
					input = sc.nextLine().trim();
					num1 = Integer.parseInt(input);
					System.out.println("Enter the second number:");
					input = sc.nextLine().trim();
					num2 = Integer.parseInt(input);

					AdderRequest request = new AdderRequest(num1, num2);
					_input.handleRequest(request);
				} catch(NumberFormatException e) {
					System.out.println("Could not process number");
				}
			}
		} catch(NoSuchElementException e) {
			System.out.println("Bye");
		}
	}
}
