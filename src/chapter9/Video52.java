package chapter9;

import java.util.Scanner;

public class Video52 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			try {
				System.out.println("Nhap x: ");
				int x = scanner.nextInt(); // Neu nhap so 0 la mot so hop le, no se khong chay vao loi, nhung neu chia
											// cho 0 thi se loi. luc do phai dung exception khac
				try {
					System.out.println("Ket qua 10/ x = " + 10 / x);
					break;
				} catch (Exception e) {
					System.out.println("run error " + e);

				}
			} catch (Exception e) {
				scanner.next();
				System.out.println(" Run error ");
			}

		}
//		scanner.close();

	}
}
