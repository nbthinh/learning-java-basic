package chapter4;

public class Video23 {
	int sum(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {

		System.out.println("Run Video 23");
		Student st1 = new Student();
		st1.name = "Eric";
		st1.age = 26;

		Student st2 = new Student();
		st2.name = "Hoi dan IT";
		st2.age = 96;
		System.out.println("Student name: " + st1.name + " and age: " + st1.age);
		Video23 test = new Video23();
		int abc = test.sum(1, 2);
		System.out.println("abc = " + abc);
	}
}
