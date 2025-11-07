package hoidanit;

import java.util.Scanner;

public class Bai02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap chieu dai: ");
		int chieudai = scanner.nextInt();
		System.out.println("Nhap chieu rong: ");
		int chieurong = scanner.nextInt();
		System.out.println("Chu vi = " + (chieudai + chieurong) * 2);
		System.out.println("Dien tich = " + chieudai * chieurong);
		System.out.println("Canh nho nhat cua hcn: " + Math.min(chieudai, chieurong));
		scanner.close();
	}
}
