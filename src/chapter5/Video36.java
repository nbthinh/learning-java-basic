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
			scanner.nextLine();
			System.out.print("Continue ? Y or N");
			String option = scanner.nextLine();
			if (option.equals("N") || option.equals("n")) {
				break;
			}
		}
		System.out.println("Check array = " + arrNumber);
		double sum = 0;
		for (int i = 0; i < arrNumber.size(); i++) {
			sum += arrNumber.get(i);
		}
		System.out.println("Check sum = " + sum);
		scanner.close();
	}
}
