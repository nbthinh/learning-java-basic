package chapter4;

public class Student {
	private String name;
	private int age;
	private String address;

//	Ham khoi tao, khong can tra ve gia tri
	public Student() {
		System.out.println("Ham khoi tao dang chay");
	}

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return this.age;
	}

	public void setName(String name1) {
		this.name = name1;
	}

	public void setAge(int age1) {
		this.age = age1;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void learnJava() {
		System.out.println("Learn Java with youbtube Hoi Dan It");
	}

	public void learnJava(int a) {
		System.out.println("Learn Java with youbtube Hoi Dan It");
	}
}
