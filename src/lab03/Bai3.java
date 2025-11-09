package lab03;

import java.util.Arrays;
import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap vao so phan tu cua mang: ");
		int len = scanner.nextInt();
		int[] numArr = new int[len];
		for (int i = 0; i < len; i++) {
			System.out.printf("Nhap gia tri cua phan tu thu %d cua mang numArr: numArr[%d] = ", i, i);
			numArr[i] = scanner.nextInt();
		}
		System.out.println("Array Ban Dau: " + Arrays.toString(numArr));
		Arrays.sort(numArr);
		System.out.println("Array Sau khi Sap xep: " + Arrays.toString(numArr));
		scanner.close();
	}
}
