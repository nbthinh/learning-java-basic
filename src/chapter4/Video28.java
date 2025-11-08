package chapter4;

public class Video28 {
	public static void main(String[] args) {
		System.out.println("Run video 28");
		Student st1 = new Student();
		Student st2 = new Student("Phuan Van Tam", 26);
		st2.setName("Eric new setName");
		System.out.println("Checker = " + st2.getName() + " ; tuoi = " + st2.getAge());
	}
}
