package lab03;

import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap vao gia tri so nguyen: ");
		int num = scanner.nextInt();
		System.out.println("Ban muon in bang cuu chuong: " + num);
		for (int i = 1; i < 11; i++) {
			System.out.printf("%d * %d = %d \n", num, i, num * i);
		}
		scanner.close();
	}
}
