package Lab02;

import java.util.Scanner;

public class Bai03 {
	public static void main(String[] args) {
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
}
