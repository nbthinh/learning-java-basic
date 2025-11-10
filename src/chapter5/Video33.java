package chapter5;

import java.util.ArrayList;

import chapter4.Student;

public class Video33 {
	public static void main(String[] args) {
		int a = 10;
		ArrayList a2 = new ArrayList();
		ArrayList<String> a1 = new ArrayList<String>();
		ArrayList<Student> a3 = new ArrayList<Student>();
		a1.add("Cam thu thang tran hoang tuan");
		a1.add("Cam thu thang ho duong ten son");
		a1.add("Cam thu thang Nguyen Thang 89");

		a1.remove(1);
		System.out.println("Hello world = " + a1 + " , " + a1.get(1));
	}
}
