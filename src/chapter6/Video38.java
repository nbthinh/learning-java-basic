package chapter6;

import java.util.ArrayList;

public class Video38 {
	public static void main(String[] args) {
		Student st1 = new Student("Hoi dan it", "1");
		Student st2 = new Student("Phuan Van Tam", "2");
		Student st3 = new Student("Eric Pham", "3");
		Student st4 = new Student("Do Trung Quan", "4");
		Student st5 = new Student("Mac Cai Quan", "5");

		ArrayList<Student> arr = new ArrayList<Student>();
		arr.add(st5);
		arr.add(st4);
		arr.add(st3);
		arr.add(st2);
		arr.add(st1);
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i).getName().startsWith("Phuan")) {
				System.out.print(arr.get(i));
				System.out.println("\n");
			}
		}
		System.out.println("Check arr: " + arr);
//		System.out.print("Nhap vao username: ");
//		Scanner scanner = new Scanner(System.in);
//		String username = scanner.nextLine();
//
//		System.out.print("Nhap vao password: ");
//		String password = scanner.nextLine();
//		System.out.println("username = " + username + ", password = " + password);
//		if (username.equals("hoidanit") && password.length() > 6) {
//			System.out.println("Valid input");
//		}
//		scanner.close();
	}
}