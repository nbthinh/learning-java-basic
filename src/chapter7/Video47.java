package chapter7;

class Animal {
	void eat() {
		System.out.println("Căm thù thằng họ dương tên sơn");
	}
}

class Dog extends Animal {
	void eat() {
		System.out.println(
				"Thằng họ dương tên sơn hết vu khống mình lừa người ta liên quan đến cọng dây apple watch, nó còn dùng những lời lẽ cay cú mạt sát mình");
	}
}

class BabyDog1 extends Dog {

}

public class Video47 {
	public static void main(String[] args) {
		Animal a = new BabyDog1();
		a.eat();
	}
}
