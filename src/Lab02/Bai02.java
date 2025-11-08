package Lab02;

import java.util.Scanner;

public class Bai02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap a: ");
		int a = scanner.nextInt();
		System.out.println("Nhap b: ");
		int b = scanner.nextInt();
		System.out.println("Nhap c: ");
		int c = scanner.nextInt();
		System.out.printf("Giai phuong trinh bac 2: %dx^2 + %dx + %d = 0", a, b, c);
		if (a == 0) {
			if (b == 0 && c == 0) {
				System.out.println("Phuong trinh co vo so nghiem");
			} else if (b == 0 && c != 0) {
				System.out.println("Phuong trinh vo nghiem");
			} else {
				System.out.println("Phuong trinh co nghiem: " + -c / b);
			}
		} else {
			double delta = Math.pow(b, 2) - 4 * a * c;
			if (delta < 0) {
				System.out.println("Phuong trinh vo nghiem");
			} else if (delta == 0) {
				System.out.println("Phuong trinh co nghiem: " + -b / 2 / a);
			} else {
				System.out.println("Phuong trinh co 2 nghiem");
				double x1 = (-b + Math.sqrt(delta)) / 2 / a;
				double x2 = (-b - Math.sqrt(delta)) / 2 / a;
				System.out.println("x1: " + x1);
				System.out.println("x2: " + x2);
			}
		}
		scanner.close();
	}
}
