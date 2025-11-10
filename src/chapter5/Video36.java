package chapter5;

import java.util.ArrayList;
import java.util.Scanner;

public class Video36 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Double> arrNumber = new ArrayList<Double>();
		while (true) {
			System.out.print("Nhap vao 1 so thuc bat ky");
			double input = scanner.nextDouble();
			arrNumber.add(input);
			System.out.print("Continue ? Y or N");

		}
		scanner.close();
	}
}
