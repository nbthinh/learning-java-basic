package Lab02;

import java.util.Scanner;

public class Bai04 {
	public static void giaiPhuongTrinhBacNhat(int a, int b) {
		if (a == 0 && b == 0) {
			System.out.println("Phuong trinh co vo so nghiem");
		} else if (a == 0 && b != 0) {
			System.out.println("Phuong trinh khong co nghiem");
		} else {
			float x = (float) -b / a;
			System.out.printf("Phuong trinh co 1 nghiem: %.5f", x);
		}
	}

	public static void bai01() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap a: ");
		int a = scanner.nextInt();
		System.out.print("Nhap b: ");
		int b = scanner.nextInt();
		System.out.printf("Giai phuong trinh bac nhat %dx + %d = 0 \n", a, b);
//		if (a == 0 && b == 0) {
//			System.out.println("Phuong trinh co vo so nghiem");
//		} else if (a == 0 && b != 0) {
//			System.out.println("Phuong trinh khong co nghiem");
//		} else {
//			float x = (float) -b / a;
//			System.out.printf("Phuong trinh co 1 nghiem: %.5f", x);
//		}
		giaiPhuongTrinhBacNhat(a, b);
		scanner.close();
	}

	public static void bai02() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap a: ");
		int a = scanner.nextInt();
		System.out.println("Nhap b: ");
		int b = scanner.nextInt();
		System.out.println("Nhap c: ");
		int c = scanner.nextInt();
		System.out.printf("Giai phuong trinh bac 2: %dx^2 + %dx + %d = 0 \n", a, b, c);
		if (a == 0) {
			giaiPhuongTrinhBacNhat(b, c);
		} else {
			double delta = Math.pow(b, 2) - 4 * a * c;
			if (delta < 0) {
				System.out.println("Phuong trinh vo nghiem");
			} else if (delta == 0) {
				float x = (float) -b / (2 * a);
				System.out.printf("Phuong trinh co nghiem kep x = %.3f ", x);
			} else {
				System.out.println("Phuong trinh co 2 nghiem");
				double x1 = (-b + Math.sqrt(delta)) / (2 * a);
				double x2 = (-b - Math.sqrt(delta)) / (2 * a);
				System.out.printf("x1 = %.3f ", x1);
				System.out.printf("x2 = %.3f ", x2);
			}
		}
		scanner.close();
	}

	public static void bai03() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap vao so dien: ");
		int sodien = scanner.nextInt();
		int sotien;
		if (sodien <= 100) {
			sotien = sodien * 1000;
		} else {
			sotien = 100 * 1000 + (sodien - 100) * 1500;
		}
		System.out.println("Sotien: " + sotien);
		scanner.close();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lua chon cua ban la: ");
		int x = scanner.nextInt();
		switch (x) {
		case 1:
			bai01();
			break;
		case 2:
			bai02();
			break;
		case 3:
			bai03();
			break;
		default:
			System.exit(0);
		}
		scanner.close();
	}
}
