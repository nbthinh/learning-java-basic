package lab03;

import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap vao so nguyen can kiem tra: ");
		int num = scanner.nextInt();
		int count = 0;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				System.out.println("Uoc so khac: " + i);
				count += 1;
				break;
			}
		}
		if (count > 0) {
			System.out.println("Day khong la so nguyen to");
		} else {
			System.out.println("Day la so nguyen to");
		}
		scanner.close();
	}
}
