package chapter9;

import java.util.Scanner;

public class Video53 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			int x = scanner.nextInt();
			System.out.println("Run try");
		} catch (Exception e) {
			System.out.println("Run exception");
		} finally {
			System.out.println("finally");
			scanner.close();
		}
	}
}
