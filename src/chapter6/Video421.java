package chapter6;

public class Video421 {
	public static void main(String[] args) {
		System.out.println("Run video 421");
		SinhVienIT st1 = new SinhVienIT("java", "123", "Mac Cai Quan", 10, 0.1);
		System.out.println("Check st1.language = " + st1.id);
		st1.getMoney();
		SinhVienCoKhi st2 = new SinhVienCoKhi("machine", "123", "Mac Cai Quan", 10, 0.1);
		System.out.println("Check st2  = " + st2.name);
	}
}
