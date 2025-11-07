package hoidanit;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("First Number: " + Math.sqrt(49));
		int firstNumber = scanner.nextInt();
		System.out.println("Second Number: ");
		int secondNumber = scanner.nextInt();
		System.out.println("Max = " + Math.min(firstNumber, secondNumber));

//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Your name is: ");
//		String name = scanner.nextLine();
//		System.out.println("Your age is: ");
//		int age = scanner.nextInt();
//		System.out.println("My name is " + name + ", my age is " + age);
//		scanner.close();
	}
}
