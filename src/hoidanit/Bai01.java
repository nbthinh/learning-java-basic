package hoidanit;

import java.util.Scanner;

public class Bai01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap ho ten: ");
		String hoten = scanner.nextLine();
		System.out.println("Your name is: " + hoten);
		scanner.close();
	}
}
