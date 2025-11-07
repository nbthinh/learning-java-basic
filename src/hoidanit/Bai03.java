package hoidanit;

import java.util.Scanner;

public class Bai03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Canh hinh lap phuong: ");
		int canh = scanner.nextInt();
		System.out.println("The tich: " + Math.pow(3, canh));
		scanner.close();
	}
}
