package chapter9;

import java.util.Scanner;

public class Video56 {
	public static int nhapMasv() {
		int result;
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("Nhap Ma sinh vien:");
			try {
				result = scanner.nextInt();
				break;
			} catch (Exception e) {
				System.out.println("Ma so sinh vien khong hop le, nhap vao so nguyen");
				scanner.next();
			}
		}

		scanner.close();
		return result;
	}

	public static void main(String[] args) {
		System.out.println("Run video 56");
		try (Scanner scanner = new Scanner(System.in)) {
			int masv = nhapMasv();
			SinhVien sv = new SinhVien(masv, "Hoi dan IT", 6.9, 25);
			System.out.println("sv info = " + sv);
		}
	}
}
