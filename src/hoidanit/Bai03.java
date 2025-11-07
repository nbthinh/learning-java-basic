package hoidanit;

import java.util.Scanner;

public class Bai03 {
	public static void main(String[] args) {
//		int day = 4;
//		switch (day) {
//		case 1:
//			System.out.println("Monday");
//			break;
//		case 2:
//			System.out.println("Tueday");
//			break;
//		case 3:
//			System.out.println("Wednesday");
//			break;
//		case 4:
//			System.out.println("Thusday");
//			break;
//		case 5:
//			System.out.println("Friday");
//			break;
//		case 6:
//			System.out.println("Saturday");
//			break;
//		case 7:
//			System.out.println("Sunday");
//			break;
//		default:
//			System.out.println("Don't know");
//		}
		System.out.println("Moi ban chon tac vu");
		Scanner scanner = new Scanner(System.in);
		int value = scanner.nextInt();
		switch (value) {
		case 1:
			System.out.println("Ban da lua chon phep cong");
			break;
		case 2:
			System.out.println("Ban da lua chon phep tru");
			break;
		default:
			System.out.println("Ban da lua chon thoat chuong trinh");
			System.exit(0);
		}
		int value1 = scanner.nextInt();
		scanner.close();

	}
}
