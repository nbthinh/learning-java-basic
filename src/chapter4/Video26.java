package chapter4;

public class Video26 {
	public static void main(String[] args) {
		System.out.println("Run video 26");
		Student st1 = new Student();
		System.out.println("Checker = " + st1.name);
		Student st2 = new Student("Phuan Van Tam", 26);
		System.out.println("Checker = " + st2.name + " ; tuoi = " + st2.age);
	}
}
