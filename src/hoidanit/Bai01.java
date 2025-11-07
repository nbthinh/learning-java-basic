package hoidanit;

import java.util.Scanner;

public class Bai01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ten sinh vien: ");
		String hoten = scanner.nextLine();
		System.out.println("Nhap diem: ");
		int diem = scanner.nextInt();
		System.out.println("Your name is: " + hoten + ", co diem la: " + diem);
		scanner.close();
	}
}
