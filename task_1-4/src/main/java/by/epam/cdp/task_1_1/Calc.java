package by.epam.cdp.task_1_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
		boolean run = true;
		double firstNumber, secondNumber, result = 0;
		String operation;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("Enter the first number");
			firstNumber = readNumber();

			System.out.println("Enter the operation");

			operation = readOperation();

			System.out.println("Enter the second number");

			secondNumber = readNumber();

			switch (operation) {
			case "+":
				result = firstNumber + secondNumber;
				break;

			case "-":
				result = firstNumber - secondNumber;
				break;

			case "*":
				result = firstNumber * secondNumber;
				break;

			case "/":
			case ":":
				if (secondNumber == 0) {
					System.out.println("Division by zero !");
					System.out.println("Enter second number again: ");
					secondNumber = readNumber();

				}
				result = firstNumber / secondNumber;
				break;
			}

			System.out.println("Result = " + result);

			System.out.println("Do you want to continue? (yes/no)");
			if (scanner.next().equals("no")) {
				run = false;
			}

		} while (run);
		scanner.close();
	}

	private static double readNumber() {
		Scanner scanner = new Scanner(System.in);
		double number = 0;
		try {
			number = scanner.nextDouble();
		} catch (InputMismatchException e) {
			System.out.println("Incorrect number!");
			System.out.println("Enter number again: ");
			readNumber();
		}
		scanner.close();
		return number;
	}

	private static String readOperation() {
		String operation = null;
		Scanner scanner = new Scanner(System.in);

		operation = scanner.next();

		switch (operation) {
		case "+":
			return operation;

		case "-":
			return operation;

		case "*":
			return operation;

		case "/":
		case ":":
			return operation;
		default:
			System.out.println("Incorrect operation!");
			System.out.println("Enter operation again: ");
			operation = readOperation();
		}

		return operation;
	}
}
